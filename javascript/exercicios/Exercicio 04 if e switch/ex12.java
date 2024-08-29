package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
12. Escreva um programa que determine se uma letra lida é uma vogal ou uma
consoante.

 */
public class ex12 {
    
    public static void main(String[] args) {
        
  String Letra = JOptionPane.showInputDialog("Informe uma letra: ").toUpperCase();
        
        if (Letra.equals("A") || Letra.equals("E") ||Letra.equals("I") || Letra.equals("O") || Letra.equals("U")){
            JOptionPane.showMessageDialog(null,"É vogal");
        }else{
            JOptionPane.showMessageDialog(null,"É consoante");
        }
        
    }
    
}
