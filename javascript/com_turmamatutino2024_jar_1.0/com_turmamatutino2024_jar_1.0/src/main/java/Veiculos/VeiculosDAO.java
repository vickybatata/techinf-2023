package Veiculos;

import Alunos.Alunos;
import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VeiculosDAO implements DAO {

       @Override
   public void insert(Object o) {
    Veiculos v = (Veiculos) o;

    String sql = "insert into Veiculos(Placa, Marca, Modelo, AnoFab, Cor,"
            + "TpCmbstv, NumChassi, Quilometragem, DtUltmRev)"
            + "values(?,?,?,?,?,?,?,?,?)";

    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, v.getPlaca());
        ps.setString(2, v.getMarca());
        ps.setString(3, v.getModelo());
        ps.setString(4, v.getAnoFab());
        ps.setString(5, v.getCor());
        ps.setString(6, v.getTpCmbstv());
        ps.setString(7, v.getNumChassi());
        ps.setString(8, v.getQuilometragem());
        ps.setString(9, v.getDtaUltmRev());

        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi Gravado com sucesso!!");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir registro: " + e.getMessage());
        e.printStackTrace(); 
    }
}


   @Override
public void update(Object o) {
    Veiculos v = (Veiculos) o;
    String sql = "update Veiculos set Placa=?, Marca=?, Modelo=?, AnoFab=?, Cor=?,"
            + " TpCmbstv=?, NumChassi=?, Quilometragem=?, DtUltmRev=? "
            + "where Cod=?";
    
    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, v.getPlaca());
        ps.setString(2, v.getMarca());
        ps.setString(3, v.getModelo());
        ps.setString(4, v.getAnoFab());
        ps.setString(5, v.getCor());
        ps.setString(6, v.getTpCmbstv());
        ps.setString(7, v.getNumChassi());
        ps.setString(8, v.getQuilometragem());
        ps.setString(9, v.getDtaUltmRev());
        ps.setInt(10, v.getCod());  
        
        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não houve atualização!");
        }
        
        ps.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar registro: " + e.getMessage());
        e.printStackTrace(); 
    }
}


    
    public void delete(int cod) {
    String sql = "delete from Veiculos where Cod=?";
    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, cod);
        
        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Exclusão com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não houve a Exclusão");
        }
        
        ps.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir registro: " + e.getMessage());
        e.printStackTrace();
    }
}


   public ArrayList<Veiculos> selectALL() {
    ArrayList<Veiculos> Arrayv = new ArrayList<>();
    String sql = "select * from Veiculos";
    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Veiculos v = new Veiculos();
            v.setCod(rs.getInt("Cod"));
            v.setPlaca(rs.getString("Placa"));
            v.setMarca(rs.getString("Marca"));
            v.setModelo(rs.getString("Modelo"));
            v.setAnoFab(rs.getString("AnoFab"));
            v.setCor(rs.getString("Cor"));
            v.setTpCmbstv(rs.getString("TpCmbstv"));
            v.setNumChassi(rs.getString("NumChassi"));
            v.setQuilometragem(rs.getString("Quilometragem"));
            v.setDtaUltmRev(rs.getString("DtUltmRev"));
            Arrayv.add(v);
        }
        
        rs.close();
        ps.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao selecionar registros: " + e.getMessage());
        e.printStackTrace();
    }
    return Arrayv;
    }
}   
