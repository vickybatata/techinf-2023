package ExercicoLista3;

import javax.swing.JOptionPane;

/*
02) Fazer um programa que leia um valor de 5 dígitos e verifique se é palíndromo
62526
*/
                   
public class exercicio02 {
    public static void main (String [] args) {
        
      int num, digito1, digito2, digito4, digito5;
        int inverso = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n° de 5 digitos: "));
        
        digito1 = num / 10000;
        digito2 = (num / 1000) % 10;
        digito4 = (num / 10) % 10;
        digito5 = num % 10;
      
        inverso = digito5 * 10000 + digito4 * 1000 + digito2 * 100 + digito1 * 10;
        
        if (digito1 == digito5 && digito2 == digito4) {
            JOptionPane.showMessageDialog(null, "O número "+num+ " é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número "+num+ " não é um palídromo.");
        }
    }    
}

