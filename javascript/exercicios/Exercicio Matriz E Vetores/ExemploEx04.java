package ExMatrizEVetores;

import javax.swing.JOptionPane;


public class ExemploEx04 {
    public static void main(String[] args) {
        
         // Matrizes originais
        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{5, 6}, {7, 8}};
        int[][] matrizResultante = new int[2][4];

        int LinMatrizA = 0;
        int ColMatrizA = 0;
        int ColMatrizB = 0;
        int LinMatrizB = 0;

        for (int[] matrizResultante1 : matrizResultante) {
            for (int lin = 0; lin < matrizResultante[0].length; lin++) {
                if (lin % 2 == 0) {
                    matrizResultante1[lin] = matrizA[ColMatrizA][LinMatrizA];
                    LinMatrizA++;
                    if (LinMatrizA == matrizA[0].length) {
                        ColMatrizA++;
                        LinMatrizA = 0;
                    }
                } else {
                    matrizResultante1[lin] = matrizB[ColMatrizB][LinMatrizB];
                    LinMatrizB++;
                    if (LinMatrizB == matrizB[0].length) {
                        ColMatrizB++;
                        LinMatrizB = 0;
                    }
                }
            }
        }
        
        StringBuilder resultText = new StringBuilder();
        for (int[] linha : matrizResultante) {
            for (int elemento : linha) {
                resultText.append(elemento).append(" ");
            }
            resultText.append("\n");
        }

        JOptionPane.showMessageDialog(null, resultText.toString());
        
    }
} 
    
