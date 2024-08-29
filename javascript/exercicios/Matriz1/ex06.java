package matriz1;

import javax.swing.JOptionPane;

/*
06 - fazer uma matriz 3x4 e outra de 4x3 que resultará em outra matriz com 
a multiplicação das duas.
*/

public class ex06 {
    public static void main(String[] args) {
        
        float[][] MatNum1 = new float[3][4];
        float[][] MatNum2 = new float[4][3];
        float[][] Multpli = new float[3][3];
        
        // Preencher a primeira matriz com valores fornecidos pelo usuário
        for (int Lin = 0; Lin < MatNum1.length; Lin++) {
            for (int Col = 0; Col < MatNum1[0].length; Col++) {
                MatNum1[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe o número da primeira matriz: "));
            }
        }
        
        // Preencher a segunda matriz com valores fornecidos pelo usuário
        for (int Lin = 0; Lin < MatNum2.length; Lin++) {
            for (int Col = 0; Col < MatNum2[0].length; Col++) {
                MatNum2[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe o número da segunda matriz: "));
            }
        }
        
        // Multiplicação das duas matrizes
        for (int Lin = 0; Lin < 3; Lin++) {
            for (int Col = 0; Col < 3; Col++) {
                Multpli[Lin][Col] = 0;
                for (int k = 0; k < 4; k++) {
                    Multpli[Lin][Col] += MatNum1[Lin][k] * MatNum2[k][Col];
                }
            }
        }
        
        // Construir a string com o resultado da multiplicação
        StringBuilder Resultado = new StringBuilder();
        for (int Lin = 0; Lin < Multpli.length; Lin++) {
            for (int Col = 0; Col < Multpli[0].length; Col++) {
                Resultado.append(Multpli[Lin][Col]).append(" ");
            }
            Resultado.append("\n");
        }
        
        // Exibir o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, Resultado.toString());
    }
}

