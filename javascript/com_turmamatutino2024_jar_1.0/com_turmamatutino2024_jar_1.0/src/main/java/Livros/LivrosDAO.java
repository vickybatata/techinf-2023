package Livros;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LivrosDAO implements DAO {

    @Override
   public void insert(Object o) {
    Livros l = (Livros) o;

    String sql = "INSERT INTO livros (Titulo, Autor, ISBN, Editora, AnoPub, Genero, NumPag, Idioma, LocBiblioteca) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, l.getTitulo());
        ps.setString(2, l.getAutor());
        ps.setString(3, l.getISBN());
        ps.setString(4, l.getEditora()); 
        ps.setString(5, l.getAnoPubli());
        ps.setString(6, l.getGenero());
        ps.setString(7, l.getNumPag());
        ps.setString(8, l.getIdioma());
        ps.setString(9, l.getLocBiblioteca());

        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não houve gravação!!");
        }
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir registro: " + e.getMessage());
        e.printStackTrace();
    }
}


    @Override
    public void update(Object o) {
        Livros l = (Livros) o;
        //JOptionPane.showMessageDialog(null,f.getCod());
        String sql = "update livros set Titulo=?, Autor=?, ISBN=? "
                + "Ediora=?, AnoPub=?, Genero=?, NumPag=? "
                + "Idioma=?, LocBiblioteca=? where cod=?";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1,l.getTitulo());
            ps.setString(2,l.getAutor());
            ps.setString(3,l.getISBN());
            ps.setString(4,l.getEditora());
            ps.setString(5,l.getAnoPubli());
            ps.setString(6,l.getGenero());
            ps.setString(7,l.getNumPag());
            ps.setString(8,l.getIdioma());
            ps.setString(9,l.getLocBiblioteca());
            ps.setInt(10,l.getCod());
          
           int atual = ps.executeUpdate();
           if(atual>0){
              JOptionPane.showMessageDialog(null,"Atualizado com sucesso!!!!:)!!");   
           }else{
                JOptionPane.showMessageDialog(null,"Não houve atualização!"); 
           }
           ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error: 449");
        }

    }

    
    public void delete(int cod) {
        String sql = "delete from livros where cod="+cod;
       try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           int atual = ps.executeUpdate();
           if(atual >0){
              JOptionPane.showMessageDialog(null,"Exlusão com sucesso!");  
           }else{
                JOptionPane.showMessageDialog(null,"Não houve a Exlusão");
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"error: 450");
       } 
    }

   
   public ArrayList<Livros> SelectAll() {
    ArrayList<Livros> Arrayl = new ArrayList<>();
    String sql = "SELECT * FROM livros";
    
    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Livros l = new Livros();
            l.setCod(rs.getInt("Cod"));
            l.setTitulo(rs.getString("Titulo"));
            l.setAutor(rs.getString("Autor"));
            l.setISBN(rs.getString("ISBN"));
            l.setEditora(rs.getString("Editora")); 
            l.setAnoPubli(rs.getString("AnoPub"));
            l.setGenero(rs.getString("Genero"));
            l.setNumPag(rs.getString("NumPag"));
            l.setIdioma(rs.getString("Idioma"));
            l.setLocBiblioteca(rs.getString("LocBiblioteca"));
            Arrayl.add(l);
        }
        
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao consultar registros: " + e.getMessage());
        e.printStackTrace();
    }
    
    return Arrayl;
   }
}