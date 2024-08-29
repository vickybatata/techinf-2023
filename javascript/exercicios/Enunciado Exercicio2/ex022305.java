package com.turmamat2024;

import javax.swing.JOptionPane;

/*
2. Faça um algoritmo que leia as coordenadas (X,Y) de dois pontos, calcule e
escreva a distância entre os mesmos.
*/

public class ex022305 {
    public static void main(String[] args){
        
        double X, Y, distancia = 0;
        
        X = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do ponto x: "));
        Y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do ponto y: "));
        
        distancia = Y - X;
        
        JOptionPane.showMessageDialog(null, "A distancia entre os dois pontos é de: "+distancia);
    }
}
