package Matriz;

import javax.swing.JOptionPane;

/*
04 - Faça um algoritmo com uma matriz 3X3 de tipo Lógico
     Respondendo VERDADEIRO OU FALSO para a seguinte pergunta
     Gostaram de Lógica de programação?
*/

public class ex04 {
    public static void main(String[] args) {
        
         boolean Like[][] = new boolean[3][3];
        
        for (int Lin = 0; Lin < Like.length; Lin++) {
            for (int Col = 0; Col < Like[0].length; Col++) {
                Like[Lin][Col] = Boolean.parseBoolean(JOptionPane.showInputDialog("Gostaram de Lógica de programação?"));  
            }
        }
        for (int Lin = 0; Lin < Like.length; Lin++) {
            for (int Col = 0; Col < Like[0].length; Col++) {
                System.out.print(Like[Lin][Col]+" ");
            }
            System.out.println("");
        }
    }
}
    
