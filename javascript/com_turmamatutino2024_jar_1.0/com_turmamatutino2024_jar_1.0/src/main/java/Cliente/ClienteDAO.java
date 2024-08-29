
package Cliente;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import Cliente.Cliente;
import Fornecedores.Fornecedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteDAO implements DAO {

    @Override
   public void insert(Object o) {
        Cliente c = (Cliente) o;

        // Corrija o nome da tabela se necessário (por exemplo, para 'Cliente')
        String sql = "INSERT INTO Cliente (NomeCompleto, CPF, Endereco, Telefone, Email,"
                   + " DataNasc, Sexo, EstadoCivil, Profissao)"
                   + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNomeCompleto());
            ps.setString(2, c.getCPF());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDataNasc());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstadoCivil());
            ps.setString(9, c.getProfissao());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Cliente gravado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao gravar cliente.");
            }
            
            ps.close();  // Feche o PreparedStatement

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro: " + e.getMessage());
            e.printStackTrace();  // Imprima o stack trace para depuração
        }
    }
    
      @Override
    public void update(Object o) {
        
        Cliente c = (Cliente) o;
        String sql = "update set cliente set NomeCompleto=?, CPF=?, Endereco=?,"
                + "Telefone=?, Email=?, DataNasc=?, Sexo=?, EstadoCivil=?,"
                + "Profissao=? where cod=?"; 
        try{
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNomeCompleto());
            ps.setString(2, c.getCPF());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDataNasc());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstadoCivil());
            ps.setString(9, c.getProfissao());
            
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
        String sql = "delete from cliente where cod="+cod;
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

    public ArrayList<Cliente> selectALL() {
            
        ArrayList<Cliente> Arrayc = new ArrayList<>();
        String sql = "select * from cliente";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
              Cliente c = new Cliente();
              c.setCod(rs.getInt("Cod"));
              c.setNomeCompleto(rs.getString("NomeCompleto"));
              c.setCPF(rs.getString("CPF"));
              c.setEndereco(rs.getString("Endereco"));
              c.setTelefone(rs.getString("Telefone"));
              c.setEmail(rs.getString("Email"));
              c.setDataNasc(rs.getString("DataNasc"));
              c.setSexo(rs.getString("Sexo"));
              c.setEstadoCivil(rs.getString("EstadoCivil"));
              c.setProfissao(rs.getString("Profissao"));
              Arrayc.add(c);
           }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error: 456");
        }
        return Arrayc;
    }
}    


    

   

    

   
   

    

