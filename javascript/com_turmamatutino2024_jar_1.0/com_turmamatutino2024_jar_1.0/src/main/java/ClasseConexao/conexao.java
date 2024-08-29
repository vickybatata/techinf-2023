package ClasseConexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {
    public static final String URL = "jdbc:mysql://localhost:3306/formularios";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String CLASS_FOR_NAME="com.mysql.cj.jdbc.Driver";
    public static Connection conexao;
    
    public static Connection getConexao() {
   
       try{
           if(conexao==null||conexao.isClosed()){
            Class.forName(CLASS_FOR_NAME);
            conexao = DriverManager.getConnection(URL,USER,PASSWORD);
            JOptionPane.showMessageDialog(null,"Foi para o banco");
           }
           
       }catch(ClassNotFoundException e){
           JOptionPane.showMessageDialog(null,"O erro 445: ");
           
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"O erro 446: ");
       }
      return conexao; 
    }
    
    public static void FecharConexao(){
         
        if(conexao!=null){
            try{
            conexao.close();
            
            }catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"O erro 447: ");
            }
         }
        
    }
}   

