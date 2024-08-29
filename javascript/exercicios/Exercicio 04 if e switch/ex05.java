package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
5. Desenvolva um programa que leia a idade de uma pessoa e indique se ela é
criança (0-12 anos), adolescente (13-17 anos), adulto (18-59 anos) ou idoso (60
anos ou mais).
*/

public class ex05 {
    public static void main(String[] args) {
        
       int Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        
        if (Idade < 13){
            JOptionPane.showMessageDialog(null,"Criança");
        }else if (Idade < 18){
            JOptionPane.showMessageDialog(null,"Adolescente");
        }else if (Idade < 60){
            JOptionPane.showMessageDialog(null,"Adulto");
        }else{
            JOptionPane.showMessageDialog(null,"Idoso");
        }
        
    }
    
}
