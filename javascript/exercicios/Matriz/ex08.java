package Matriz;

import javax.swing.JOptionPane;

/*
08 - Fazer uma matriz de média de duas notas, no final mostrar, nome do aluno,
     notas, médias, status(aprovado, reprovado, recuperação). 
     Para aprovado >=7, reprovado <6, recuperação >6<7.  3X3
*/  

public class ex08 {
    public static void main(String[] args) {
        
        String MatNome[][] = new String[3][3];
        String MatStatus[][] = new String[MatNome.length][MatNome[0].length];
        float MatNota1[][] = new float[MatNome.length][MatNome[0].length];
        float MatNota2[][] = new float[MatNome.length][MatNome[0].length];
        float MatMedia[][] = new float[MatNome.length][MatNome[0].length];
        
        for (int Lin = 0; Lin < MatNome.length; Lin++) {
            for (int Col = 0; Col < MatNome[0].length; Col++) {
                MatNome[Lin][Col] = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                MatNota1[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
                MatNota2[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
                MatMedia[Lin][Col] = (MatNota1[Lin][Col] + MatNota2[Lin][Col]) / 2;
                if (MatMedia[Lin][Col] >= 7) {
                    MatStatus[Lin][Col] = "Aprovado";
                } else if (MatMedia[Lin][Col] < 6) {
                    MatStatus[Lin][Col] = "Reprovado";
                } else {
                    MatStatus[Lin][Col] = "Recuperação";
                }
            }
        }
        StringBuilder resultado = new StringBuilder();
        for (int Lin = 0; Lin < MatNome.length; Lin++) {
            for (int Col = 0; Col < MatNome[0].length; Col++) {
                resultado.append("Nome: ").append(MatNome[Lin][Col])
                    .append("\nNota 1: ").append(MatNota1[Lin][Col])
                    .append("\nNota 2: ").append(MatNota2[Lin][Col])
                    .append("\nMédia: ").append(MatMedia[Lin][Col])
                    .append("\nStatus: ").append(MatStatus[Lin][Col])
                    .append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
    