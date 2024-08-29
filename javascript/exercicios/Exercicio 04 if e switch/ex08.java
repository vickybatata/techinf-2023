package exercicios04IfeSwitch;

import javax.swing.JOptionPane;



public class ex08 {
    public static void main(String[] args) {
        
         float Salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: "));
        float Aumento;
        
        if (Salario <= 1500){
            Aumento = Salario + (Salario * 0.10f);
        }else{
            Aumento = Salario + (Salario * 0.05f);
        }
        
        JOptionPane.showMessageDialog(null,"Salário: "+Salario+"\nReajuste: "+Aumento);
    }
  
}
