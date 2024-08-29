package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
1. Escreva um programa em Java que verifique se um número é positivo, negativo ou
zero.
*/

public class ex01 {
    public static void main (String [] args){
        
       int Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        if (Num > 0){
            JOptionPane.showMessageDialog(null,"É positivo!");
        }else if (Num < 0){
            JOptionPane.showMessageDialog(null,"É negativo!");   
        }else{
            JOptionPane.showMessageDialog(null,"É zero!");
        }   
    }
}
