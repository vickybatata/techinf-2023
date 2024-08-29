package Veiculos;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaVeiculos {
    
      public static VeiculosDAO vdao = new VeiculosDAO();
      public void ExibirTabela(){
        
        ArrayList<Veiculos> Arrayv = new ArrayList<>();
        Arrayv = vdao.selectALL();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Placa");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Ano de Fabricação");
        model.addColumn("Cor");
        model.addColumn("Tipo de combustivel");
        model.addColumn("Número de Chassi");
        model.addColumn("Quilometragem");
        model.addColumn("Data da Ultima Revisão");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayv.size()){
                model.addRow(new Object [] {Arrayv.get(i).getCod(),
                    Arrayv.get(i).getPlaca(),Arrayv.get(i).getMarca(),Arrayv.get(i).getModelo(),
                    Arrayv.get(i).getAnoFab(),Arrayv.get(i).getCor(),Arrayv.get(i).getTpCmbstv(),
                    Arrayv.get(i).getNumChassi(),Arrayv.get(i).getQuilometragem(),Arrayv.get(i).getDtaUltmRev()
                            
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

