package ExercicoLista3;

import javax.swing.JOptionPane;

/*
11)Criar um programa que permita ao aluno responder qual a capital do Brasil. Sendo Todas
as possibilidades deverão ser pensadas. Ex.: Brasília, brasília, BRASÍLIA.
*/

public class exercicio11 {
    public static void main(String[] args) {
        
        String resposta = JOptionPane.showInputDialog("Qual a capital do Brasil: ");
         resposta = resposta.toLowerCase(); 
   if (resposta.equals("brasília")) {
            JOptionPane.showMessageDialog(null, "Resposta correta! Brasília é a capital do Brasil.");
        } else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta. A capital do Brasil é Brasília.");
        }
    }
}