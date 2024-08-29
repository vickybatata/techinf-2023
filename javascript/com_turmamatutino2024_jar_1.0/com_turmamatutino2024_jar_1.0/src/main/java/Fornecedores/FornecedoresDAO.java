
package Fornecedores;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import exercicio2805.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FornecedoresDAO implements DAO{

    @Override
    public void insert(Object o) {
        Fornecedores f = (Fornecedores) o;//conversão direta do Object para Fornecedor
      
        String sql = "insert into fornecedores(NomeEmpresa,CNPJ,Endereco, Telefone,"
                + "Email, NomeContato, TipoProdServ, CondPag, PrazoEntrega) "
                + "values(?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1,f.getNomeEmp());
            ps.setString(2,f.getCNPJ());
            ps.setString(3,f.getEndereco());
            ps.setString(4,f.getTelefone());
            ps.setString(5,f.getEmail());
            ps.setString(6,f.getNomeContato());
            ps.setString(7,f.getTipoProdServ());
            ps.setString(8,f.getCondPag());
            ps.setString(9,f.getPrazoEnt());
            
            int atual = ps.executeUpdate();
            if(atual>0){
               JOptionPane.showMessageDialog(null,"Gravado com sucesso!!");  
            }else{
                JOptionPane.showMessageDialog(null,"Não Houve gravação!!");
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error: 448");
        }
        
    }   

    @Override
    public void update(Object o) {
        Fornecedores f = (Fornecedores) o;
        //JOptionPane.showMessageDialog(null,f.getCod());
        String sql = "update fornecedor set NomeEmp=?, cnpj=?, Endereco=? "
                + "Telefone=?, Email=?, NomeContato=?, TipoProdServ=? "
                + "CondPag=?, PrazoEnt=? where cod=?";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           ps.setString(1,f.getNomeEmp());
           ps.setString(2,f.getCNPJ());
           ps.setString(3,f.getEndereco());
           ps.setString(4,f.getTelefone());
           ps.setString(5,f.getEmail());
           ps.setString(6,f.getNomeContato());
           ps.setString(7,f.getTipoProdServ());
           ps.setString(7,f.getCondPag());
           ps.setString(7,f.getPrazoEnt());
           ps.setInt(10,f.getCod());
          
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
        String sql = "delete from fornecedores where cod="+cod;
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

   public void deleteCnpj(long cnpj){
       String sql = "delete from fornecedores where cnpj = ?";
       try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           ps.setLong(1, cnpj);
            int atual =   ps.executeUpdate();
            if(atual > 0){
             JOptionPane.showMessageDialog(null,"Exlusão com sucesso!"); 
         }else{
             JOptionPane.showMessageDialog(null,"Não houve a Exlusão");
         }
       }catch(SQLException e ){
           JOptionPane.showMessageDialog(null,"error: 451");
       }
   }
   
    public ArrayList<Fornecedores> SelectAll() {
        ArrayList<Fornecedores> Arrayf = new ArrayList<>();
        String sql = "select * from fornecedores";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
              Fornecedores f = new Fornecedores();
              f.setCod(rs.getInt("Cod"));
              f.setNomeEmp(rs.getString("NomeEmpresa"));
              f.setCNPJ(rs.getString("CNPJ"));
              f.setEndereco(rs.getString("Endereco"));
              f.setTelefone(rs.getString("Telefone"));
              f.setEmail(rs.getString("Email"));
              f.setNomeContato(rs.getString("NomeContato"));
              f.setTipoProdServ(rs.getString("TipoProdServ"));
              f.setCondPag(rs.getString("CondPag"));
              f.setPrazoEnt(rs.getString("PrazoEntrega"));
              Arrayf.add(f);
           }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error: 452");
        }
        return Arrayf;
    }

//    public ArrayList<Object> selectALL() {
//               ArrayList<Object> Arrayf = new ArrayList<>();
//        String sql = "select * from fornecedores";
//        try{
//           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
//           ResultSet rs = ps.executeQuery();
//           
//           while(rs.next()){
//               
//              Fornecedores f = new Fornecedores();
//              
//              f.setNomeEmp(rs.getString("NomeEmpresa"));
//              f.setCNPJ(rs.getString("CNPJ"));
//              f.setEndereco(rs.getString("Endereco"));
//              f.setTelefone(rs.getString("Telefone"));
//              f.setEmail(rs.getString("Email"));
//              f.setNomeContrato(rs.getString("NomeContrato"));
//              f.setTipoProdServ(rs.getString("TipoProdServ"));
//              f.setCondPag(rs.getString("ConPag"));
//              f.setPrazoEnt(rs.getString("PrazoEntrega"));
//              Arrayf.add(f);
//           }
//           
//           
//        }catch(SQLException e){
//             JOptionPane.showMessageDialog(null,"error: 452");
//        }
//        
//        return Arrayf;
//    }

   

   

    

    }
 
