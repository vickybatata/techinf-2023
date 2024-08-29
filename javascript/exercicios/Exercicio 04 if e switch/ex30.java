package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
30. Escreva um programa em Java que leia um número de 1 a 7 e exiba o dia da
semana correspondente.
*/
public class ex30 {
    public static void main(String[] args) {
        
        int Dia = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de 1 a 7: "));
        
        switch (Dia){
            
            case 1:
                JOptionPane.showMessageDialog(null, "Segunda-Feira");
                break;    
            
            case 2:
                JOptionPane.showMessageDialog(null, "Terça-Feira");
                break;    
            
            case 3:
                JOptionPane.showMessageDialog(null, "Quarta-Feira");
                break;    
            
            case 4:
                JOptionPane.showMessageDialog(null, "Quinta-Feira");
                break;    
            
            case 5:
                JOptionPane.showMessageDialog(null, "Sexta-Feira");
                break;    
            
            case 6:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;    
            
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;  
                
            default:
                JOptionPane.showMessageDialog(null,"Esse dia é inexistente");
                break;
                
         }
        
    }
    
}
