package com.turmamat2024;

import javax.swing.JOptionPane;

/*
08) Fazer um programa que leia o valor de um produto e a condição de pagamento: 
se for a vista 10% de desconto ou a prazo com 15% de juros. O programa deverá
retornar o valor final do produto
*/

public class ExercicioSe01080805 {
    
    public static void main (String [] args) {
        
        double ValorProd, ValorFinal = 0;
        String CodPag = "";
        
        ValorProd = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: R$"));
        CodPag = JOptionPane.showInputDialog("Informe a condição de pagamento " +
                " (A para á vista ou P para prazo): ");
    
        if (CodPag.equals("A")  | CodPag.equals("a")) {
            ValorFinal = ValorProd - ValorProd * 0.1;
       }else if (CodPag.equals("P") | CodPag.equals("p")){
           ValorFinal = ValorProd + ValorProd * 0.15;
       }else {
           JOptionPane.showMessageDialog(null, "Condições de pagamento invalida");
       }
       JOptionPane.showMessageDialog(null, "O valor final do produto é: R$" +ValorFinal);
    }
}
