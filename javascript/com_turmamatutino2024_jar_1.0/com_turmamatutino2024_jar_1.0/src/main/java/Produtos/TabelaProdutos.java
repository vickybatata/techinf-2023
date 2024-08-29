package Produtos;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaProdutos {
    
    public static ProdutosDAO pdao = new ProdutosDAO();
    public void ExibirTabela(){
        
        ArrayList<Produto> Arrayp = new ArrayList<>();
        Arrayp = pdao.selectALL();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Nome do Produto");
        model.addColumn("Código do Produto");
        model.addColumn("Descricao");
        model.addColumn("Preço");
        model.addColumn("Quantidade de estoque");
        model.addColumn("Categoria");
        model.addColumn("Data De Validade");
        model.addColumn("Fornecedor");
        model.addColumn("Localizaçãao do estoque");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayp.size()){
                model.addRow(new Object [] {Arrayp.get(i).getCod(),
                    Arrayp.get(i).getNomeProd(),Arrayp.get(i).getCodProd(),Arrayp.get(i).getDescricao(),
                    Arrayp.get(i).getPreco(),Arrayp.get(i).getQuantEstoque(),Arrayp.get(i).getCategoria(),
                    Arrayp.get(i).getDataValidade(),Arrayp.get(i).getFornecedor(),Arrayp.get(i).getLocEstoque()
                            
                });
                i++;
            }else{
                parar= false;
            }
        }
        
         JTable tabela = new JTable(model);
       
        
        JScrollPane scrol = new JScrollPane(tabela);
        
        pane.add(scrol);
        
        frame.add(pane);
        
        
        frame.setVisible(true);
        frame.setResizable(false);
    }
    

}



