package Matriz;

import javax.swing.JOptionPane;

/*
05 - Faça um algoritom com uma matriz 5X5, achar:
     Diagonal principal e a Diagonal Secundária
*/

public class ex05 {
    public static void main(String[] args) {
        
       int MatNum[][] = new int[5][5];
        
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                MatNum[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            }
        }
        System.out.println("Diagonal Principal");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin == Col){
                    System.out.println(" "+MatNum[Lin][Col]);
                }else{
                    System.out.println("0");
                }
            }
            System.out.println("");    
        }
        System.out.println("Diagonal Secundária");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if (Lin + Col == 6){
                    System.out.println(" "+MatNum[Lin][Col]);
                }else{
                    System.out.println("0");
                }
            }
            System.out.println("");
        }
    }
} 
    