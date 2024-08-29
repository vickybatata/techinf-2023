package ListadeExercicios200524;

import javax.swing.JOptionPane;

/*
03 - Faça uma algoritmo com uma matriz 8X3 de nomes
     Mostrar os nomes no final.
 */
public class ex03 {
    public static void main(String[] args) {
        
        String Nome [][] = new String [8][3];
        
         for (int Lin = 0; Lin < Nome.length;Lin++) {
             for (int Col = 0; Col < Nome[0].length;Col++) {
                 Nome[Lin][Col] = JOptionPane.showInputDialog("Informe um nome ");
            
             }
         }    
    StringBuilder sb = new StringBuilder();
        for (String [] Lin: Nome){
            
            for (String elemento : Lin) {
                sb.append(elemento).append(' ');
            }
               sb.append('\n');
        }
    JOptionPane.showMessageDialog(null, sb.toString());
    }
}