/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaEventos {
    
     public static EventosDAO edao = new EventosDAO();
    public void ExibirTabela(){
        
        ArrayList<Eventos> Arraye = new ArrayList<>();
        Arraye = edao.selectALL();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("NomeEv");
        model.addColumn("Data");
        model.addColumn("HorarioInicio");
        model.addColumn("HorarioTerm");
        model.addColumn("Local");
        model.addColumn("Descricao");
        model.addColumn("PublicoAlvo");
        model.addColumn("CapacMax");
        model.addColumn("Organ");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arraye.size()){
                model.addRow(new Object [] {Arraye.get(i).getCod(),
                    Arraye.get(i).getNomeEv(),Arraye.get(i).getData(),Arraye.get(i).getHorarioInicio(),
                    Arraye.get(i).getHorarioTerm(),Arraye.get(i).getLocal(),Arraye.get(i).getDescricao(),
                    Arraye.get(i).getPublicoAlvo(),Arraye.get(i).getCapacMax(),Arraye.get(i).getOrgan()
                            
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



