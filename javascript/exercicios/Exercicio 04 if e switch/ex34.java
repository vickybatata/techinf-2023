package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
34. Escreva um programa que leia uma letra (A, B, C, D ou F) representando uma 
nota escolar e exiba uma mensagem de acordo com a nota. Utilize a seguinte 
tabela:
a) A: "Excelente"
b) B: "Bom"
c) C: "Regular"
d) D: "Ruim"
e) F: "Reprovado"
*/

public class ex34 {
    public static void main(String[] args) {
        
         String Letra = JOptionPane.showInputDialog("Informe uma letra: ").toUpperCase().substring(0, 1);
        
        switch (Letra){
            
            case "A":
                JOptionPane.showMessageDialog(null,"A: Excelente");
                break;
                
            case "B":
                JOptionPane.showMessageDialog(null,"B: Bom");
                break;
                
            case "C":
                JOptionPane.showMessageDialog(null,"C: Regular");
                break;
                
            case "D":
                JOptionPane.showMessageDialog(null,"D: Ruim");
                break;
                
            case "F":
                JOptionPane.showMessageDialog(null,"F: Reprovado");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"ERROR");
                break;
                
        }
        
    }
}
