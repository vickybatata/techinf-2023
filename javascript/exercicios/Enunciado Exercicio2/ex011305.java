package com.turmamat2024;

import javax.swing.JOptionPane;

/*
Faça um algoritmo que leia dois números inteiros, trocar o conteúdo desses números.
*/

public class ex011305 {
    public static void main(String [] args) {
        
    int Num1, Num2, aux = 0;
    
    Num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro nº: "));
    Num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo nº: "));
    
    aux = Num1;
    Num1 = Num2;
    Num2 = aux;
    
    JOptionPane.showMessageDialog(null, "Num1 vale: "+Num1);
    JOptionPane.showMessageDialog(null, "Num2 vale: "+Num2);
    }
}
