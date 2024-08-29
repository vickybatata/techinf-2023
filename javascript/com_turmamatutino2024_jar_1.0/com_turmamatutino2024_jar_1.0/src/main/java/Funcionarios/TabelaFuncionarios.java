/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaFuncionarios {
  
    public static FuncionariosDAO fdao = new FuncionariosDAO();
    public void ExibirTabela(){
        
        ArrayList<Funcionarios> Arrayf = new ArrayList<>();
        Arrayf = fdao.selectAll();
        
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
        model.addColumn("Data de Admissao");
        model.addColumn("Cargo");
        model.addColumn("Salario");
        model.addColumn("Departamento");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayf.size()){
                model.addRow(new Object [] {Arrayf.get(i).getCod(),
                    Arrayf.get(i).getNomeCompleto(),Arrayf.get(i).getCPF(),Arrayf.get(i).getEndereco(),
                    Arrayf.get(i).getTelefone(),Arrayf.get(i).getEmail(),Arrayf.get(i).getDataAdmissao(),
                    Arrayf.get(i).getCargo(),Arrayf.get(i).getSalario(),Arrayf.get(i).getDepartamento()
                            
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




