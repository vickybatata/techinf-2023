package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
33. Desenvolva um programa que leia um número de 1 a 4 representando uma
operação matemática (adição, subtração, multiplicação ou divisão) e realize a
operação entre dois números fornecidos pelo usuário.
*/

public class ex33 {
    public static void main(String[] args) {
        
        int Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        int Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        
        int Menu = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n\n[ 1 ] - Adição\n[ 2 ] - Subtração\n[ 3 ] - Multiplicação"
                + "\n[ 4 ] - Divisão\n[ 0 ] - Sair\n\nEscolha: "));
        
        switch (Menu){
            
            case 0:
                JOptionPane.showMessageDialog(null,"Obrigado pela visita!");
                break;
            
            case 1:
                JOptionPane.showMessageDialog(null,Valor1+" + "+Valor2+" = "+(Valor1+Valor2));
                break;
                
            case 2:  
                JOptionPane.showMessageDialog(null,Valor1+" - "+Valor2+" = "+(Valor1-Valor2));
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null,Valor1+" * "+Valor2+" = "+(Valor1*Valor2));
                break;
                
            case 4:
                if (Valor1 != 0 && Valor2 != 0){
                    JOptionPane.showMessageDialog(null,Valor1+" / "+Valor2+" = "+(Valor1/Valor2));                  
                }else{
                    JOptionPane.showMessageDialog(null,"Não é possivel dividir!");
                }
                break;  
 
            default:
                JOptionPane.showMessageDialog(null,"Não tem essa opção!");
                break;
                
        } 
    }
}
