package matriz1;

import javax.swing.JOptionPane;

/*
05 - fazer um programa com matriz 4x2, mostrar a matriz e depois de mostrar 
multiplicar seus valores por 3 e mostrar o resultado.
*/

public class ex05 {
    public static void main(String[] args) {
        
 float[][] MatNum = new float[4][2];
        float[][] MatMult = new float[4][2];
        
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                MatNum[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
                MatMult[Lin][Col] = MatNum[Lin][Col] * 3;
            }
        }
        
        System.out.println("Matriz original:");
        mostrarMatriz(MatNum);

        System.out.println();

        System.out.println("Matriz após multiplicar por 3:");
        mostrarMatriz(MatMult);
    }
        
    public static void mostrarMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}