package Alunos;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaAlunos {
   
    public static AlunosDAO adao = new AlunosDAO();
    public void ExibirTabela(){
        
        ArrayList<Alunos> Arraya = new ArrayList<>();
        Arraya = adao.selectALL();
        
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
        model.addColumn("Série/Ano");
        model.addColumn("Nome do Responsavel");
        model.addColumn("Escola de Origem");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arraya.size()){
                model.addRow(new Object [] {Arraya.get(i).getCod(),
                    Arraya.get(i).getNomeCompleto(),Arraya.get(i).getCPF(),Arraya.get(i).getEndereco(),
                    Arraya.get(i).getTelefone(),Arraya.get(i).getEmail(),Arraya.get(i).getDataNasc(),
                    Arraya.get(i).getSerieAno(),Arraya.get(i).getNomeResp(),Arraya.get(i).getEscOrigem()
                            
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
