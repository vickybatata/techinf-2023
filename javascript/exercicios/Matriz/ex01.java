package ListadeExercicios200524;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
01 - Faça uma algoritmo com uma matriz 4X4 de números reais.
     Mostrar os números no final.
*/

public class ex01 {
    public static void main(String[] args) {
        
     float MatNum [][] = new float [4][4];
     
     for (int Lin = 0; Lin < MatNum.length;Lin++) {
         for (int Col = 0; Col < MatNum.length;Col++) {
             MatNum[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe um número: "));
            
         }
     }
     String MostrarNum = Arrays.deepToString(MatNum);
    JOptionPane.showMessageDialog(null, MostrarNum);
    
    StringBuilder sb = new StringBuilder();
        for (float [] Lin: MatNum){
            
            for (float elemento : Lin) {
                sb.append(elemento).append(' ');
            }
               sb.append('\n');
        }
    JOptionPane.showMessageDialog(null,
    sb.toString());
    }
}
