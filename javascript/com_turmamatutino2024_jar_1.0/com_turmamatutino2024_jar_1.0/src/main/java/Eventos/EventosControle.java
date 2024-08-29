package Eventos;

import ClassesEspeciais.DAO;
import java.util.ArrayList;


public class EventosControle implements DAO {
    
    EventosDAO ed = new EventosDAO();
    
    @Override
    public void insert(Object o) {
        ed.insert(o);
    }

    @Override
    public void update(Object o) {
        ed.update(o);
    }

  
    public void delete(int cod) {
        ed.delete(cod);
    }

    public void selectALL() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TabelaEventos().ExibirTabela();
            }
        });
    }

   

   
    
}
