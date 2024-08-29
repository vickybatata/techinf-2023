package matriz1;

import javax.swing.JOptionPane;

/*
03 - fazer um programa com uma matriz 3x2 de notas. Mostrar a matriz
*/

public class ex03 {
    public static void main(String[] args) {
        
 float MatNota[][] = new float[3][2];
        
        for (int Lin = 0; Lin < MatNota.length; Lin++) {
            for (int Col = 0; Col < MatNota[0].length; Col++) {
                MatNota[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota: "));
            }
        }
        for (int Lin = 0; Lin < MatNota.length; Lin++) {
            for (int Col = 0; Col < MatNota[0].length; Col++) {
                System.out.print(MatNota[Lin][Col]+" ");
            }
            System.out.println(""); 
        }
    }
}