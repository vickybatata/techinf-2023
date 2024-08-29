package Matriz;

import javax.swing.JOptionPane;

/*
06 - Fazer uma matriz 4X4 somente de números positivos, que serão informados.
     Mostrar a matriz final.
*/

public class ex06 {
 
    public static void main(String[] args) {
        int MatNum[][] = new int[4][4];

        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[Lin].length; Col++) {
                int numero;
                do {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número positivo:"));
                    if (numero <= 0) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um número positivo.");
                    }
                } while (numero <= 0);
                MatNum[Lin][Col] = numero;
            }
        }

        StringBuilder matrizFinal = new StringBuilder();
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[Lin].length; Col++) {
                matrizFinal.append(MatNum[Lin][Col]).append("\t");
            }
            matrizFinal.append("\n");
        }

        JOptionPane.showMessageDialog(null, matrizFinal.toString());
    }
}
