package com.turmamat2024;

import javax.swing.JOptionPane;

/*
 01) Fazer um programa que leia a idade de uma pessoa e informe se é maior
 de idade ou não
*/

public class ExercicioSe01010805 {
    
    public static void main(String[] args) {
        
         int Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade: "));
        
        if (Idade > 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }else if (Idade < 18) {
            JOptionPane.showMessageDialog(null, "Menor de idade");
     
        }   
    }
}   
