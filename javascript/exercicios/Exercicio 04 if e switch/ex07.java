package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
7. Faça um programa que verifique se um aluno foi aprovado, reprovado ou está em
recuperação, considerando que a média mínima para aprovação é 7.0 e a média
para recuperação é de 5.0.
*/

public class ex07 {
    public static void main(String[] args) {
        
              float Media = Float.parseFloat(JOptionPane.showInputDialog("Informe sua média: "));
        String Status;
        
        if (Media >= 7){
            Status = "Aprovado"; 
        }else if (Media < 6){
            Status = "Reprovado";
        }else{
            Status = "Recuperação";
        }
        
        JOptionPane.showMessageDialog(null,Status);
    }
}
