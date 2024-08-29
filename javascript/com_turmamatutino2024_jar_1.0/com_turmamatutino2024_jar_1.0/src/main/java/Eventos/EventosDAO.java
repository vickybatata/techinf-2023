package Eventos;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EventosDAO implements DAO{

    
    @Override
            
   public void insert(Object o) {
    Eventos e = (Eventos) o;

    String sql = "insert into Eventos(Nome, DataEvento, HorarioInicio, Horariotermino, Local,"
            + "Descricao, PublicoAlvo, CapacidadeMax, Organizador)"
            + "values(?,?,?,?,?,?,?,?,?)";

    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, e.getNomeEv());
        ps.setString(2, e.getData());
        ps.setString(3, e.getHorarioInicio());
        ps.setString(4, e.getHorarioTerm());
        ps.setString(5, e.getLocal());
        ps.setString(6, e.getDescricao());
        ps.setString(7, e.getPublicoAlvo());
        ps.setString(8, e.getCapacMax());
        ps.setString(9, e.getOrgan());

        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi Gravado com sucesso!!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir registro: " + ex.getMessage());
        ex.printStackTrace();  
    }
}


    @Override
    public void update(Object o) {
        
        Eventos e = (Eventos) o;
        String sql = "update set eventos set Nome=?, DataEvento=?, HorarioInicio=?,"
                + "HorarioTermino=?, Local=?, Descricao=?, PublicoAlvo=?, CapacidadeMax=?, +"
                + "Organizador=? where cod=?"; 
        try{
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, e.getNomeEv());
            ps.setString(2, e.getData());
            ps.setString(3, e.getHorarioInicio());
            ps.setString(4, e.getHorarioTerm());
            ps.setString(5, e.getLocal());
            ps.setString(6, e.getDescricao());
            ps.setString(7, e.getPublicoAlvo());
            ps.setString(8, e.getCapacMax());
            ps.setString(9, e.getOrgan());
            
          int atual = ps.executeUpdate();
           if(atual>0){
              JOptionPane.showMessageDialog(null,"Atualizado com sucesso!!!!:)!!");   
           }else{
                JOptionPane.showMessageDialog(null,"Não houve atualização!"); 
           }
           ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"error: 454");
        }
        
        
    }

    
    public void delete(int cod) {
        String sql = "delete from eventos where cod="+cod;
       try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           int atual = ps.executeUpdate();
           if(atual >0){
              JOptionPane.showMessageDialog(null,"Exlusão com sucesso!");  
           }else{
                JOptionPane.showMessageDialog(null,"Não houve a Exlusão");
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"error: 455");
       } 
    }

   public ArrayList<Eventos> selectALL() {
        ArrayList<Eventos> Arraye = new ArrayList<>();
        String sql = "SELECT * FROM eventos";
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Eventos e = new Eventos();
                e.setCod(rs.getInt("Cod"));
                e.setNomeEv(rs.getString("Nome"));
                e.setData(rs.getString("DataEv"));
                e.setHorarioInicio(rs.getString("HorarioInicio"));
                e.setHorarioTerm(rs.getString("HorarioTerm"));
                e.setLocal(rs.getString("Local"));
                e.setDescricao(rs.getString("Descricao"));
                e.setPublicoAlvo(rs.getString("PublicoAlvo"));
                e.setCapacMax(rs.getString("CapacMax"));
                e.setOrgan(rs.getString("Organ"));
                Arraye.add(e);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registros: " + ex.getMessage());
            ex.printStackTrace();
        }
        return Arraye;
    }
}