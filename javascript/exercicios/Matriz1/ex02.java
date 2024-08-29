package matriz1;

import javax.swing.JOptionPane;

/*
02 - fazer um progrma com uma matriz 3x3 de números inteiros. Mostrar a matriz
*/

public class ex02 {
    public static void main(String[] args) {
        
      int[][] matriz = new int[3][3];
        
        // Preencher a matriz com valores fornecidos pelo usuário
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                matriz[lin][col] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número : "));
            }
        }
        
        // Mostrar a matriz completa
        System.out.println("A matriz 3x3:");
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[lin][col] + " ");
            }
            System.out.println();
        }
    }
}