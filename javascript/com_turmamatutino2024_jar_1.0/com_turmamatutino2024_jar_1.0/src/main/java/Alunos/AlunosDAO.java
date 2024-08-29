package Alunos;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;




public class AlunosDAO implements DAO{

    @Override
   public void insert(Object o) {
    Alunos a = (Alunos) o;

    String sql = "insert into Alunos(NomeCompleto, CPF, Endereco, Telefone, Email,"
            + "DataNasc, SerieAno, NomeResp, EscolaOrigem)"
            + "values(?,?,?,?,?,?,?,?,?)";

    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, a.getNomeCompleto());
        ps.setString(2, a.getCPF());
        ps.setString(3, a.getEndereco());
        ps.setString(4, a.getTelefone());
        ps.setString(5, a.getEmail());
        ps.setString(6, a.getDataNasc());
        ps.setString(7, a.getSerieAno());
        ps.setString(8, a.getNomeResp());
        ps.setString(9, a.getEscOrigem());

        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi Gravado com sucesso!!");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir registro: " + e.getMessage());
        e.printStackTrace();  // Imprime o stack trace para identificar a origem do erro
    }
}


    @Override
    public void update(Object o) {
        
        Alunos a = (Alunos) o;
        String sql = "update set alunos set NomeCompleto=?, CPF=?, Endereco=?, +"
                + "Telefone=?, Email=?, DataNasc=?, SerieAno=?, NomeResp=?, +"
                + "EscOrigem=? where cod=?"; 
        try{
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNomeCompleto());
            ps.setString(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDataNasc());
            ps.setString(7, a.getSerieAno());
            ps.setString(8, a.getNomeResp());
            ps.setString(9, a.getEscOrigem());
            
          int atual = ps.executeUpdate();
           if(atual>0){
              JOptionPane.showMessageDialog(null,"Atualizado com sucesso!!!!:)!!");   
           }else{
                JOptionPane.showMessageDialog(null,"Não houve atualização!"); 
           }
           ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error: 454");
        }
        
        
    }

    
    public void delete(int cod) {
        String sql = "delete from alunos where cod="+cod;
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

    public ArrayList<Alunos> selectALL() {
            
        ArrayList<Alunos> Arraya = new ArrayList<>();
        String sql = "select * from alunos";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
              Alunos a = new Alunos();
              a.setCod(rs.getInt("Cod"));
              a.setNomeCompleto(rs.getString("NomeCompleto"));
              a.setCPF(rs.getString("CPF"));
              a.setEndereco(rs.getString("Endereco"));
              a.setTelefone(rs.getString("Telefone"));
              a.setEmail(rs.getString("Email"));
              a.setDataNasc(rs.getString("DataNasc"));
              a.setSerieAno(rs.getString("SerieAno"));
              a.setNomeResp(rs.getString("NomeResp"));
              a.setEscOrigem(rs.getString("EscolaOrigem"));
              Arraya.add(a);
           }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error: 456");
        }
        return Arraya;
    }
    }

    
    
    
    

