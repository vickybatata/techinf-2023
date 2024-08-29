package Veiculos;

import ClassesEspeciais.DAO;
import java.util.ArrayList;


public class VeiculosControle implements DAO{

    VeiculosDAO vd = new VeiculosDAO();  
    
    @Override
    public void insert(Object o) {
        vd.insert(o);
    }

    @Override
    public void update(Object o) {
        vd.update(o);
    }

    
    public void delete(int cod) {
        vd.delete(cod);
    }

    public void selectALL() {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaVeiculos().ExibirTabela();
            }
        });
    }

    
    
}
