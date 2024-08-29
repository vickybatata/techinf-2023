package ExercicoLista3;

import javax.swing.JOptionPane;

/*
08)Faça um algoritmo de reajuste de salário, onde a regra é:
a - Salário menor ou igual a 950,00 reajuste de 25%
b - Senão o aumento será de 10%
c - Mostrar nome, matricula, salário não ajustado e salário ajustado.
*/

public class exercicio08 {
    
    public static void main(String args[]) {
        
        String Nome = JOptionPane.showInputDialog("Informe o nome: ");
        int Matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula: "));
        float Salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: "));
        float Reajuste;
        
        if (Salario <= 950.00){
            Reajuste = Salario + (Salario * 0.25f);
        }else{
            Reajuste = Salario + (Salario * 0.10f);
        }
        
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nMatricula: "+Matricula+
                "\nSalário: "+Salario+"\nReajuste Salarial: "+Reajuste);
        
    }
    
}