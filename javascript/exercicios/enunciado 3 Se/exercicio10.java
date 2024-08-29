package ExercicoLista3;

import javax.swing.JOptionPane;

/*
10)Fazer um programa que leia o consumo médio em metros cúbicos de água de um 
cliente e o tipo de cliente (comercial R$ 2,84 o metro cúbico ou residencial 
R$ 2,68 o metro cúbico) O algoritmo deverá retornar o valor da conta
*/

public class exercicio10 {
    public static void main(String[] args) {
  
    double ConsumoMedio, ValorConta = 0;
        String TipoCliente = "";
        
        ConsumoMedio = Double.parseDouble(JOptionPane.showInputDialog("Informe o consumo" +
                " médio em metros cúbicos"));
        TipoCliente = JOptionPane.showInputDialog("Informe o tipo de cliente (Comercial ou" +
               " Residencial)");
        if (TipoCliente.equals("Comercial")){ 
            ValorConta = ConsumoMedio * 2.84;
        }else if (TipoCliente.equals("Residencial")){
            ValorConta = ConsumoMedio * 2.68;
        }else {
            JOptionPane.showMessageDialog(null, "Tipo de cliente inválido!");
          
        }
        
        JOptionPane.showMessageDialog(null, "O valor da conta de água é R$" +ValorConta);
    } 
}
