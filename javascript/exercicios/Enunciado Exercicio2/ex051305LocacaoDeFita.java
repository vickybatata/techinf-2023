package com.turmamat2024;

import javax.swing.JOptionPane;

/*
b) Locação de Fita de vídeo uma locadora:
*/


public class ex051305LocacaoDeFita {
    public static void main (String [] args){
        
      String Nome, Telefone, Cpf, Endereco, FitaAlugada, TempoAlugado = "";
      
      Nome = JOptionPane.showInputDialog("Informe o nome: ");
      Telefone = JOptionPane.showInputDialog("Informe o n° de telefone: ");
      Cpf = JOptionPane.showInputDialog("Informe o cpf: ");
      Endereco = JOptionPane.showInputDialog("Informe o endereço: ");
      FitaAlugada = JOptionPane.showInputDialog("Informe o nome da Fita Alugada: ");
      TempoAlugado = JOptionPane.showInputDialog("Informe o Tempo Alugado: ");  
      
      JOptionPane.showMessageDialog(null, "Nome: "+Nome+"\nTelefone: "+Telefone+
              "\nCpf: "+Cpf+"\nEndereço: "+Endereco+"\nFita Alugada: "+FitaAlugada+
              "\nTempo Alugado: "+TempoAlugado);
      
    }
}
