package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
4. Escreva um programa que leia três números inteiros e determine qual deles é o
maior.
*/

public class ex04 {
    public static void main(String[] args) {
        
        int Num1, Num2, Num3 = 0;
       
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
        Num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
        
        if (Num1 > Num2 && Num1 > Num3){
            JOptionPane.showMessageDialog(null, "O primeiro n° é o maior.");
         }else if (Num2 > Num1 && Num2 > Num3){
            JOptionPane.showMessageDialog(null,"O segundo n° é o maior.");
        }else if (Num3 > Num1 && Num3 > Num2){
            JOptionPane.showMessageDialog(null,"O terceiro n° é o maior.");
        }else{
            JOptionPane.showMessageDialog(null,"Os números são iguais.");
        }
       
     }
}
