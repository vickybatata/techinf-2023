
package Contas;

import ClassesEspeciais.DAO;
import java.util.ArrayList;


public class ContasControle implements DAO {

    ContasDAO cd = new ContasDAO();
    
    @Override
    public void insert(Object o) {
        cd.insert(o);
    }   

    @Override
    public void update(Object o) {
        cd.update(o);
    }

   
    public void delete(int cod) {
        cd.delete(cod);
    }

    public void selectALL() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaContas().ExibirTabela();
            }
        });
    }

    
}
