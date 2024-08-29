package ExercicoLista3;

import javax.swing.JOptionPane;

/*
01) Fazer um programa que leia a idade de uma pessoa e informe se é maior de
idade ou não
*/

public class exercicio01 {
    public static void main (String [] args) {
        
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade: "));
        
        if (idade > 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }else if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Menor de idade");
     
        }   
    }
}   

    

