package com.turmamat2024;

import javax.swing.JOptionPane;

/*
10) Fazer um programa que leia a quantidade de homens e mulheres que
compareceram em uma festa e retorne qual teve maior quantidade e o 
percentual correspondente de cada um
*/

public class ExercicioSe01100805 {
    public static void main (String [] args){
      
     int QuantHomens, QuantMulheres = 0;
     double PerHom, PerMul = 0;
     
     QuantHomens = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de homens: "));
     QuantMulheres = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de mulheres: "));
     
     PerHom = (QuantHomens * 100.0) / (QuantHomens + QuantMulheres);
     PerMul = (QuantMulheres * 100.0) / (QuantMulheres + QuantHomens);
     
     if (QuantHomens > QuantMulheres) {
         JOptionPane.showMessageDialog(null, "Houve mais homens na festa");
     }else if (QuantMulheres > QuantHomens) {
         JOptionPane.showMessageDialog(null, "Houve mais mulher na festa");
    }else {
         JOptionPane.showMessageDialog(null, "O numero de homens e mulheres presentes é igual.");
     }
     JOptionPane.showMessageDialog(null, "Percentual de homens na festa: " +PerHom+ "%");
     JOptionPane.showMessageDialog(null, "Percentual de mulheres na festa: " +PerMul+ "%"); 
    }
    
}
