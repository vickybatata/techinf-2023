package com.turmamat2024;

import javax.swing.JOptionPane;

/*
c) Empréstimo de Livro de uma biblioteca:
*/

public class ex051305Biblioteca {
    public static void main (String [] args){
        
     String nome, NomeLivro, autor, DataEmprestimo, DataDevolucao = "";
     
     nome = JOptionPane.showInputDialog("Informe o nome: ");
     NomeLivro = JOptionPane.showInputDialog("Informe o nome do livro: ");
     autor = JOptionPane.showInputDialog("Informe o nome do autor: ");
     DataEmprestimo = JOptionPane.showInputDialog("Informe a data de emprestimo: ");
     DataDevolucao = JOptionPane.showInputDialog("Informe a data de devolução: ");
     
     JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nNome do livro: "+NomeLivro+
             "\nNome do autor: "+autor+"\nData de emprestimo: "+DataEmprestimo+
             "\nDara de devlolução: "+DataDevolucao);
    }
}
