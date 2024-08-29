package com.turmamat2024;

import javax.swing.JOptionPane;

/*
d) Cadastro de Carro em uma concessionária:
*/

public class ex051305CadastroDeCarro {
    public static void main (String [] args){
        
    String nome, cpf, NumTel, ModeloCarro, CorCarro, placa = "";
    
    nome = JOptionPane.showInputDialog("Informe o nome: ");
    cpf = JOptionPane.showInputDialog("Informe o cpf: ");
    NumTel = JOptionPane.showInputDialog("Informe o n° de telefone: ");
    ModeloCarro = JOptionPane.showInputDialog("Informe o modelo do carro: ");
    CorCarro = JOptionPane.showInputDialog("Informe a cor do carro: ");
    placa = JOptionPane.showInputDialog("Informe a placa do carro: ");
    
    JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nCpf: "+cpf+
            "\nNúmero de telefone: "+NumTel+"\nModelo do carro: "+ModeloCarro+
            "\nCor do carro: "+CorCarro+"\nPlaca do carro: "+placa);
    }
}
