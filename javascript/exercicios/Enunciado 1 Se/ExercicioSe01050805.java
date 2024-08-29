package com.turmamat2024;

import javax.swing.JOptionPane;

/*
05- Fazer um algoritmo que leia 3 valores e verifique se é possível formar)
triangulo (para formar triangulo nenhum valor pode ser maior que a soma dos demais)
*/

public class ExercicioSe01050805 {
    public static void main(String [] args){
        
        double lado1, lado2, lado3;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado do triângulo"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado do triângulo"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado do triângulo"));
       
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            JOptionPane.showMessageDialog(null, "É possivel formar um triângulo com "
                    + "esses lados.");
        }else {
            JOptionPane.showMessageDialog(null, "Não é possivel formar um triângulo "
                    + "com esses lados.");
        }    
        
    }
}
