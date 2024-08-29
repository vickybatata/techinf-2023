package Livros;

import ClassesEspeciais.DAO;
import java.util.ArrayList;


public class LivrosControle implements DAO{
    LivrosDAO ld = new LivrosDAO();
    
    @Override
    public void insert(Object o) {
        ld.insert(o);
    }

    @Override
    public void update(Object o) {
        ld.update(o);
    }

    @Override
    public void delete(int cod) {
        ld.delete(cod);
    }

    public void selectALL() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaLivros().ExibirTabela();
            }
        });
    }
    
}
