package Fornecedores;

import ClassesEspeciais.DAO;


 public class FornecedoresControle implements DAO {
     
     FornecedoresDAO fd = new FornecedoresDAO();
     
    @Override
    public void insert(Object o) {
         fd.insert(o);
    }

    @Override
    public void update(Object o) {
        fd.update(o);
    }

    @Override
    public void delete(int cod) {
        fd.delete(cod);
    }
     
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploTabela().ExibirTabela();
            }
        });
    }
     
 }
