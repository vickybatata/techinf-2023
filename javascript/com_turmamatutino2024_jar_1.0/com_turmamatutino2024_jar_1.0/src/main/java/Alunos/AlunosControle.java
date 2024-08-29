package Alunos;

import ClassesEspeciais.DAO;
import java.util.ArrayList;


public class AlunosControle implements DAO {
    
    AlunosDAO  ad = new AlunosDAO ();
    
    
    @Override
    public void insert(Object o) {
           ad.insert(o);
    }

    @Override
    public void update(Object o) {
        ad.update(o);
    }

    
    public void delete(int cod) {
        ad.delete(cod);
    }

    public void selectALL() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TabelaAlunos().ExibirTabela();
            }
        });
    }
}