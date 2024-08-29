package com.turmamat2024;

import javax.swing.JOptionPane;

/*
03) Fazer um programa que leia o valor da base e altura de um retângulo e 
retorne se esse retângulo é também quadrado
*/

public class ExercicioSe01030805 {
    public static void main(String [] args) {
        
        double base, altura;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base do retângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura do reângulo: "));
        
        if(base == altura) {
            JOptionPane.showMessageDialog(null, "O retângulo é também um quadrado");
        }else {
            JOptionPane.showMessageDialog(null, "O retângulo não é um quadrado.");
        }
    }
}
