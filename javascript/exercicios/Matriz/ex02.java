package ListadeExercicios200524;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
02 - Faça um algoritmo com uma matriz 5X7 de números inteiros.
     Mostrar os números no final

 */
public class ex02 {
    public static void main(String[] args) {
        
        int MatNum [][] = new int [5][7];
     for (int Lin = 0; Lin < MatNum.length;Lin++) {
         for (int Col = 0; Col < MatNum.length;Col++) {
             MatNum[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            
         }
     }
       
    StringBuilder sb = new StringBuilder();
        for (int [] Lin: MatNum){
            
            for (int elemento : Lin) {
                sb.append(elemento).append(' ');
            }
               sb.append('\n');
        }
    JOptionPane.showMessageDialog(null, sb.toString());
    }
}