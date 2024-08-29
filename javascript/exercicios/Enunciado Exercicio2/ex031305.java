package com.turmamat2024;

import javax.swing.JOptionPane;

/*
3. Faça um algoritmo que leia as medidas dos três lados de um triângulo, calcule
e escreva o seu perímetro e a sua área.
*/

public class ex031305 {
    public static void main(String [] args){
        
    double A, B, C, area, base, altura, perimetro = 0;
    
    A = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado A do triângulo: "));
    B = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado B do triângulo: "));
    C = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado C do triângulo: "));
    
    perimetro = A + B + C;
    
    base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
    
    area = (base * altura) / 2;
    
    JOptionPane.showMessageDialog(null, "O perimetro do triangulo é: "+perimetro);
    JOptionPane.showMessageDialog(null, "A area do seu trinagulo é: "+area);
    
    }
}
