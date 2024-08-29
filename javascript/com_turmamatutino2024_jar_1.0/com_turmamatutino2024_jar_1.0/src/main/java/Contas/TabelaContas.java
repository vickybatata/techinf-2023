
package Contas;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaContas {
    public static ContasDAO cdao = new ContasDAO();
    public void ExibirTabela(){
        
        ArrayList<Contas> Arrayc = new ArrayList<>();
        Arrayc = cdao.selectAll();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Descricao");
        model.addColumn("Valor");
        model.addColumn("DtVenc");
        model.addColumn("DtPag");
        model.addColumn("Fornecedor");
        model.addColumn("Categoria");
        model.addColumn("StatusPag");
        model.addColumn("MetPag");
        model.addColumn("Observacoes");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayc.size()){
                model.addRow(new Object [] {Arrayc.get(i).getCod(),
                    Arrayc.get(i).getDescricao(),Arrayc.get(i).getValor(),Arrayc.get(i).getDtVenc(),
                    Arrayc.get(i).getDtPag(),Arrayc.get(i).getFornecedor(),Arrayc.get(i).getCategoria(),
                    Arrayc.get(i).getStatusPag(),Arrayc.get(i).getMetPag(),Arrayc.get(i).getObservacoes()
                            
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

