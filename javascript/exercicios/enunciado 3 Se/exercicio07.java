package ExercicoLista3;

import javax.swing.JOptionPane;

/*
07) Utilizar Condicional encadeada:
Média Escolar com 3 notas, faça o algoritmo para a digitação do nome do
aluno, as 3 notas, fazer a média, e mostrar o nome, a média,
se está reprovado, recuperação ou aprovado sendo a média igual ou superior a 7,0.
Situações:
Aprovado = Média igual ou superior a 7,0
Reprovado = Média menor que 6,0
Recuperação = Menor que 7,0 e maior que 6,0.
*/

public class exercicio07 {
    public static void main(String[] args) {
        
  String Nome = JOptionPane.showInputDialog("Informe o nome: ");
        float Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
        float Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
        float Nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
        float Media = (Nota1 + Nota2 + Nota3) / 3f;
        //String Status;
        String Status = Media >= 7 ? "Aprovado" : Media < 6 ? "Reprovado" : "Recuperação";
        if (Media >= 7){
           Status = "Aprovado";
       }else if (Media < 6){
           Status = "Reprovado";
         }else{
           Status = "Recuperação";
         }
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nNota 1: "+Nota1+
                "\nNota 2: "+Nota2+"\nNota 3: "+Nota3+"\nMedia: "+Media+
                "\nStatus: "+Status);
    }
}