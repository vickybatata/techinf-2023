package matriz1;

import javax.swing.JOptionPane;

/*
04 - fazer um programa com matriz 2x3 de valores lógicos. Mostrar a matriz
*/

public class ex04 {
    public static void main(String[] args) {
        
         boolean[][] MatValores = new boolean[2][3];
         
              for (int Lin = 0; Lin < MatValores.length; Lin++) {
                   for (int Col = 0; Col < MatValores[0].length; Col++) {
                        MatValores[Lin][Col] = Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o valor: "));
                   }
              }
        for (int Lin = 0; Lin < MatValores.length; Lin++) {
            for (int Col = 0; Col < MatValores[0].length; Col++) {
                System.out.print(MatValores[Lin][Col]+" ");
            }
            System.out.println("");
        }
    }
}