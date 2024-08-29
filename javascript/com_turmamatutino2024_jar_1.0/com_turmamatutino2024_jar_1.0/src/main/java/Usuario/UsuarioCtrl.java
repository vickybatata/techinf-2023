/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import ClassesEspeciais.DAO;
import login.Login;
import login.LoginDAO;


public class UsuarioCtrl implements DAO{
     public LoginDAO ld = new LoginDAO();
     
    @Override
    public void insert(Object o) {
        ld.insert(o);
    }

    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void Desativar(int cod){
        
    }
    
    public void Logar(Login user){
        ld.logar(user);
    }
}

