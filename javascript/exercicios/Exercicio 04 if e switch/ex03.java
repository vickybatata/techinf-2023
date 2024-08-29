package exercicios04IfeSwitch;

import javax.swing.JOptionPane;

/*
3. Faça um programa que calcule o preço final de um produto, considerando um
desconto de 10% se o valor for acima de R$ 100,00.
*/

public class ex03 {
    public static void main(String[] args) {
        
      float PrecoProd  = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto: "));
      
      if (PrecoProd < 100){
          float ValorFinal = PrecoProd - (PrecoProd * 0.10f);
          JOptionPane.showMessageDialog(null,"Valor final do produto: "+ValorFinal);
        }else{
            JOptionPane.showMessageDialog(null,"Valor final do produto: "+PrecoProd);
      }
      
    }
}
