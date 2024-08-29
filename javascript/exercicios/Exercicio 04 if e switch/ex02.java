package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
2. Crie um programa que determine se um número é par ou ímpar e, se for par, se é
divisível por 4.
*/

public class ex02 {
    public static void main(String[] args) {
        
         int Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        if (Num % 2 == 0){
            JOptionPane.showMessageDialog(null,"É par!");
            if (Num % 4 == 0){
                JOptionPane.showMessageDialog(null,"É divisivel por 4!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"É impar!");
        }
    }
}
