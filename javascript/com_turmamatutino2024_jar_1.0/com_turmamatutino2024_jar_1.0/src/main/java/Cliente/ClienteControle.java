package Cliente;

import ClassesEspeciais.DAO;
import ClassesEspeciais.DAO;
import java.util.ArrayList;


public class ClienteControle implements DAO{

    ClienteDAO cd = new ClienteDAO();
    
    @Override
    public void insert(Object o) {
        cd.insert(o);
    }

    @Override
    public void update(Object o) {
        cd.update(o);
    }

     @Override
    public void delete(int cod) {
        cd.delete(cod);
    }
    
    public void selectALL() {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaCliente().ExibirTabela();
            }
        });
    }

   
    
}
   

    

