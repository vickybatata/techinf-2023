package Funcionarios;

import ClassesEspeciais.DAO;
import Fornecedores.FornecedoresDAO;



public class FuncionariosControle implements DAO {
    FuncionariosDAO fd = new FuncionariosDAO();
    
    @Override
    public void insert(Object o) {
        fd.insert(o);
    }

    @Override
    public void update(Object o) {
        fd.update(o);
    }

    
    public void delete(int cod) {
        fd.delete(cod);
    }

    public void selectALL() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFuncionarios().ExibirTabela();
            }
        });
    }

   
}
