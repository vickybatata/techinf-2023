package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
13. Desenvolva um programa que calcule o IMC (Índice de Massa Corporal) de uma
pessoa e indique em qual faixa de peso ela se encontra (abaixo do peso, peso
normal, sobrepeso, obesidade grau I, obesidade grau II ou obesidade grau III).
 */

public class ex13 {
    
    public static void main(String[] args) {
        
       float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
       float Peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
       float IMC = (float) (Peso / Math.pow(Altura,2)) ; 
       
       if (IMC < 18.5){
            JOptionPane.showMessageDialog(null,"IMC: "+IMC+"\nAbaixo do peso");
        }else if (IMC < 25){
            JOptionPane.showMessageDialog(null,"IMC: "+IMC+"\nPeso ideal ");
        }else if (IMC < 30){
            JOptionPane.showMessageDialog(null,"IMC: "+IMC+"\nLevemente acima do peso");
        }else if (IMC < 35){
            JOptionPane.showMessageDialog(null,"IMC: "+IMC+"\nObesidade Grau 1");
        }else if (IMC < 40){
            JOptionPane.showMessageDialog(null,"IMC: "+IMC+"\nObesidade Grau 2");
        }else{
            JOptionPane.showMessageDialog(null,"IMC: "+IMC+"\nObesidade Grau 3");
        }
    }
}
