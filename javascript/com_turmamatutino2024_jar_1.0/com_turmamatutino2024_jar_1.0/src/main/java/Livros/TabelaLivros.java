package Livros;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaLivros {
 
    public static LivrosDAO ldao = new LivrosDAO();
    public void ExibirTabela(){
        
        ArrayList<Livros> Arrayl = new ArrayList<>();
        Arrayl = ldao.SelectAll();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380, 80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Titulo");
        model.addColumn("Autor");
        model.addColumn("ISBN");
        model.addColumn("Ediora");
        model.addColumn("AnoPubli");
        model.addColumn("Genero");
        model.addColumn("NumPag");
        model.addColumn("Idioma");
        model.addColumn("LocBiblioteca");
        
        int i = 0;
        boolean parar = true;
        
        while(parar){
            if(i<Arrayl.size()){
                model.addRow(new Object [] {Arrayl.get(i).getCod(),
                    Arrayl.get(i).getTitulo(),Arrayl.get(i).getAutor(),Arrayl.get(i).getISBN(),
                    Arrayl.get(i).getEditora(),Arrayl.get(i).getAnoPubli(),Arrayl.get(i).getGenero(),
                    Arrayl.get(i).getNumPag(),Arrayl.get(i).getIdioma(),Arrayl.get(i).getLocBiblioteca()
                            
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

