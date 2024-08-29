package com.turmamat2024;

import javax.swing.JOptionPane;

/*
 0 - Faça uma programa que ao ser informado
 um número verifique se é positivo ou negativo.
*/

import javax.swing.JOptionPane;

public class ExercicioSe00010805 {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n°: "));
        
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "Positivo.");
        }else if (num < 0) {
            JOptionPane.showMessageDialog(null, "Negativo.");
        }else {
            JOptionPane.showMessageDialog(null, "Neutro.");
        }
    }
}

