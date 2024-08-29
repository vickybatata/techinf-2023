
package com.turmamat2024;

import javax.swing.JOptionPane;

/*
4. Uma lanchonete serve os seguintes produtos com os respectivos preços:
 
•	X burguer	R$ 2,50
•	X frango	R$ 2,00
•	X salada	R$ 1,50
•	Batata frita	R$ 0,80
•	Sucos	        R$ 0,90
•	Refrigerantes	R$ 1,20
Faça um algoritmo que leia as quantidades de cada um dos itens acima de um 
determinado cliente, calcule e escreva o valor total do pedido.
*/

public class ex041305 {
    public static void main (String [] args){
        
        float Xburguer= 0f; 
	float Xfrango = 0f;	
	float Xsalada	= 0f;
	float Batatafrita = 0f;
	float Sucos = 0f;
	float Refrigerantes = 0f; 
        float Total = 0f;
        int Quant = 0;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Xburguer: "));
        Xburguer = Quant * 2.5f;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Xfrango: "));
        Xfrango = Quant * 2F;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Xsalada: "));
        Xsalada = Quant * 1.5f;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Batatafrita: "));
        Batatafrita = Quant * 0.80f;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Suco: "));
        Sucos = Quant * 0.90f;
        
        Quant = Integer.parseInt(JOptionPane.showInputDialog("Informar a Quantidade de Refrigerante: "));
        Refrigerantes = Quant * 1.2f;
        
        Total =  Xburguer+Xfrango+Xsalada+Batatafrita+Sucos+Refrigerantes;
      
        JOptionPane.showConfirmDialog(null,"O Total do lanche: R$ "+Total);
         
    }
}
