package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
10. Crie um programa que determine se uma pessoa pode ou não votar, considerando
a idade mínima de 16 anos para votar no Brasil.
 */
 
public class ex10 {
    
    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        
        if (idade > 15){
            JOptionPane.showMessageDialog(null, "Pode votar.");
       }else{
            JOptionPane.showMessageDialog(null, "Não pode votar.");
        }
    }
}
