package com.turmamat2024;

import javax.swing.JOptionPane;

/*
 Faça os programas dos cadastros a seguir:
	a) Emissão de Passagem aérea:
	 
Obs: No máximo 06 dados para cada um cadastro.	
*/

public class ex051305PassagemAerea {
    public static void main(String [] args){
        
        String Passageiro, rg, cpf = "";
        double Reserva,passaporte, TotalCompra = 0;
        
        Passageiro = JOptionPane.showInputDialog("Informe o nome do passageiro: ");
        Reserva = Double.parseDouble(JOptionPane.showInputDialog("Informe o n° da reserva: "));
        cpf = JOptionPane.showInputDialog("Informe o cpf: ");
        passaporte = Double.parseDouble(JOptionPane.showInputDialog("Informe o n° do passaporte: "));
        TotalCompra = Double.parseDouble(JOptionPane.showInputDialog("Informe o total da compra"));
        
        JOptionPane.showMessageDialog(null, "Nome do passageiro: "+Passageiro+
                "\nN° da reserva: "+Reserva+"\nCpf: "+cpf+
                "\nN°do passaporte: "+passaporte+
                "\nTotal da compra: "+TotalCompra);
   }
}
