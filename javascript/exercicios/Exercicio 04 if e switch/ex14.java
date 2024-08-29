package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
14. Crie um programa que leia as notas de três provas e calcule a média final. 
Se a média for maior ou igual a 7,0, o aluno está aprovado; caso contrário,
está reprovado.
*/

public class ex14 {
    
    public static void main(String[] args) {
        
 float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
        float media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
        
    }
    
}