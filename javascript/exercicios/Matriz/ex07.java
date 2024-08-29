package Matriz;

import javax.swing.JOptionPane;

/*
07 - Fazer uma matriz resultante de duas matriz 3X2. Mostrar todas as matrizes. 
*/

public class ex07 {
    public static void main(String[] args) {
        
         int Matriz1[][] = new int[3][2];
        int Matriz2[][] = new int[3][2];
        int MatrizResultante[][] = new int[3][2];
        
        // Preencher a primeira matriz com números fornecidos pelo usuário
        for (int Lin = 0; Lin < Matriz1.length; Lin++) {
            for (int Col = 0; Col < Matriz1[0].length; Col++) {
                Matriz1[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da primeira matriz [" + (Lin+1) + "][" + (Col+1) + "]: "));
            }
        }

        // Preencher a segunda matriz com números fornecidos pelo usuário
        for (int Lin = 0; Lin < Matriz2.length; Lin++) {
            for (int Col = 0; Col < Matriz2[0].length; Col++) {
                Matriz2[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da segunda matriz [" + (Lin+1) + "][" + (Col+1) + "]: "));
            }
        }

        // Calcular a matriz resultante da soma das duas matrizes
        for (int Lin = 0; Lin < Matriz1.length; Lin++) {
            for (int Col = 0; Col < Matriz1[0].length; Col++) {
                MatrizResultante[Lin][Col] = Matriz1[Lin][Col] + Matriz2[Lin][Col];
            }
        }

        // Exibir a primeira matriz
        System.out.println("Primeira Matriz:");
        for (int Lin = 0; Lin < Matriz1.length; Lin++) {
            for (int Col = 0; Col < Matriz1[0].length; Col++) {
                System.out.print(Matriz1[Lin][Col] + " ");
            }
            System.out.println();
        }

        // Exibir a segunda matriz
        System.out.println("Segunda Matriz:");
        for (int Lin = 0; Lin < Matriz2.length; Lin++) {
            for (int Col = 0; Col < Matriz2[0].length; Col++) {
                System.out.print(Matriz2[Lin][Col] + " ");
            }
            System.out.println();
        }

        // Exibir a matriz resultante
        System.out.println("Matriz Resultante (Soma):");
        for (int Lin = 0; Lin < MatrizResultante.length; Lin++) {
            for (int Col = 0; Col < MatrizResultante[0].length; Col++) {
                System.out.print(MatrizResultante[Lin][Col] + " ");
            }
            System.out.println();
        }
    }
}
   
 
