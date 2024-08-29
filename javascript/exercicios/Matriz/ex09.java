package Matriz;

import javax.swing.JOptionPane;

/*
09 - Fazer uma matriz 4X4 mostrar a matriz
     - A diagonal principal
     - Quais os números da diagonais secundárias
     - Quais os números acima das diagonais secundárias
     - Qual o número que faz parte da diagonal principal e secundária
     - Quais os números abaixo da diagonal principal e secundária.
     - Quais os números acima da diagonal principal e secundária. 
*/
 
public class ex09 {
    public static void main(String[] args) {
        
 int MatNum[][] = new int[4][4];
        
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                MatNum[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número2: "));
            }
        }

        System.out.println("A matriz:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                System.out.print(MatNum[Lin][Col] + " ");
            }
            System.out.println();
        }  
        
       
        System.out.println("Diagonal Principal:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin == Col) {
                    System.out.print(MatNum[Lin][Col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();    
        }
     
        System.out.println("Diagonal Secundária:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin + Col == 3) {
                    System.out.print(MatNum[Lin][Col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();    
        }
    
        System.out.println("Números acima da Diagonal Secundária:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin + Col < 3) {
                    System.out.print(MatNum[Lin][Col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();    
        }
  
        System.out.println("Número que faz parte da Diagonal Principal e Secundária:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin == Col && Lin + Col == 3) {
                    System.out.print(MatNum[Lin][Col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();    
        }
   
        System.out.println("Números abaixo da Diagonal Principal e Secundária:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin > Col && Lin + Col > 3) {
                    System.out.print(MatNum[Lin][Col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();    
        }
    
        System.out.println("Números acima da Diagonal Principal e Secundária:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin < Col && Lin + Col < 3) {
                    System.out.print(MatNum[Lin][Col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();    
        }
    }
}