package com.turmamat2024;

import javax.swing.JOptionPane;

/*
/e) Cadastro de Disciplinas de uma escola
*/

public class ex051305Disciplinas {
    public static void main (String [] args) {
        
        String  NomeDisc, NumAlns, FreqAprov, NotaMin = "";
        
        NomeDisc = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
        NumAlns = JOptionPane.showInputDialog("Informe o número de alunos matriculados: ");
        FreqAprov = JOptionPane.showInputDialog("Informe a frequencia de aprovação: ");
        NotaMin = JOptionPane.showInputDialog("Informe a nota minima: ");
        
        JOptionPane.showMessageDialog(null, "Nome da disciplina: "+NomeDisc+
                "\nNumero de alunos: "+NumAlns+"\nFrequencia de aprovação: "+FreqAprov+
                "\nNota Minima: "+NotaMin);
              
    }
}
