/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaCliente {
    
    public static ClienteDAO cdao = new ClienteDAO();
    public void ExibirTabela(){
        
        ArrayList<Cliente> Arrayc = new ArrayList<>();
        Arrayc = cdao.selectALL();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Nome Completo");
        model.addColumn("CPF");
        model.addColumn("Endereço");
        model.addColumn("Telefone");
        model.addColumn("Email");
        model.addColumn("Data de Nascimento");
        model.addColumn("Sexo");
        model.addColumn("Estado Civil");
        model.addColumn("profissao");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayc.size()){
                model.addRow(new Object [] {Arrayc.get(i).getCod(),
                    Arrayc.get(i).getNomeCompleto(),Arrayc.get(i).getCPF(),Arrayc.get(i).getEndereco(),
                    Arrayc.get(i).getTelefone(),Arrayc.get(i).getEmail(),Arrayc.get(i).getDataNasc(),
                    Arrayc.get(i).getSexo(),Arrayc.get(i).getEstadoCivil(),Arrayc.get(i).getProfissao()
                            
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


