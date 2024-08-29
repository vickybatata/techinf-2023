package com.turmamat2024;

import javax.swing.JOptionPane;

/*
06) Fazer um programa que leia 2 valores e o tipo de media a ser calculada entre
eles aritmética ou ponderada (1º 30% e 2º 70%)
*/

public class ExercicioSe01060805 {
    public static void main(String [] args) {
        
        int Valor1, Valor2 = 0;
        double media, tipoMedia = 0;
        
        Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        tipoMedia = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de média a ser calculada:\n" +
                "1 - Média Aritmética\n" +
                "2- Média Ponderada"));
        
        if(tipoMedia == 1) {
            media = (Valor1 + Valor2) / 2;
            JOptionPane.showMessageDialog(null,"A média aritmética é: "+media);   
        }else if (tipoMedia == 2){
            media = (Valor1 * 0.3 + Valor2 * 0.7);
            JOptionPane.showMessageDialog(null, "A média ponderada é: "+media);
        }else{
            JOptionPane.showMessageDialog(null, "Opção inválida!");
            
        }
    
    }
}
