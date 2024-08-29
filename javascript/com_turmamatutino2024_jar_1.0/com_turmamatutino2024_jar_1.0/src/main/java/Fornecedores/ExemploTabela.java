package Fornecedores;

import Fornecedores.Fornecedores;
import Fornecedores.FornecedoresDAO;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ExemploTabela {
   
    public static FornecedoresDAO fdao = new FornecedoresDAO();
    public void ExibirTabela(){
        
        ArrayList<Fornecedores> Arrayf = new ArrayList<>();
        Arrayf = fdao.SelectAll();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Nome da Empresa");
        model.addColumn("CNPJ");
        model.addColumn("Endereço");
        model.addColumn("Telefone");
        model.addColumn("Email");
        model.addColumn("Nome do Contato");
        model.addColumn("Tipo de Produto/Serviço");
        model.addColumn("Condições de Pagamento");
        model.addColumn("Prazo de Entrega");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayf.size()){
                model.addRow(new Object [] {Arrayf.get(i).getCod(),
                    Arrayf.get(i).getNomeEmp(),Arrayf.get(i).getCNPJ(),Arrayf.get(i).getEndereco(),
                    Arrayf.get(i).getTelefone(),Arrayf.get(i).getEmail(),Arrayf.get(i).getNomeContato(),
                    Arrayf.get(i).getTipoProdServ(),Arrayf.get(i).getCondPag(),Arrayf.get(i).getPrazoEnt()
                            
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