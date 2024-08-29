package login;

import ClassesEspeciais.DAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginControle implements DAO {

    LoginDAO ld = new LoginDAO();
    
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
    
    public void desativar (int cod) {
        ld.desativar(0);
    }


} 