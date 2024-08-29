package Produtos;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProdutosDAO implements DAO {

   @Override
public void insert(Object o) {
    Produto p = (Produto) o;

    String sql = "INSERT INTO Produtos (NomeProd, CodProd, Descricao, Preco, QuantEstoque, "
               + "Categoria, DataValidade, Fornecedor, LocEstoque) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, p.getNomeProd());

        // Converte CodProd para inteiro
        int codProd;
        try {
            codProd = Integer.parseInt(p.getCodProd());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CodProd inválido: " + p.getCodProd());
            return;  // Aborta a inserção se o CodProd não for um número válido
        }
        ps.setInt(2, codProd);

        ps.setString(3, p.getDescricao());

        // Converte Preco para BigDecimal
        BigDecimal preco;
        try {
            preco = new BigDecimal(p.getPreco());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço inválido: " + p.getPreco());
            return;  // Aborta a inserção se o Preco não for um número válido
        }
        ps.setBigDecimal(4, preco);

        // Converte QuantEstoque para inteiro
        int quantEstoque;
        try {
            quantEstoque = Integer.parseInt(p.getQuantEstoque());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "QuantEstoque inválido: " + p.getQuantEstoque());
            return;  // Aborta a inserção se o QuantEstoque não for um número válido
        }
        ps.setInt(5, quantEstoque);

        ps.setString(6, p.getCategoria());
        ps.setString(7, p.getDataValidade());
        ps.setString(8, p.getFornecedor());
        ps.setString(9, p.getLocEstoque());

        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi Gravado com sucesso!!");
        }
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir registro: 01 " + e.getMessage());
        e.printStackTrace();  // Imprime o stack trace para identificar a origem do erro
    }
}



    @Override
    public void update(Object o) {
        
        Produto p = (Produto) o;
        String sql = "update set produtos set NomeProd=?, CodProd=?, Descricao=?, +"
                + "Preco=?, QuantEstoque=?, Categoria=?, DataValidade=?, Fornecedor=?, +"
                + "LocEstoque=? where cod=?"; 
        
          
        try{
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, p.getNomeProd());
            ps.setString(2, p.getCodProd());
            ps.setString(3, p.getDescricao());
            ps.setString(4, p.getPreco());
            ps.setString(5, p.getQuantEstoque());
            ps.setString(6, p.getCategoria());
            ps.setString(7, p.getDataValidade());
            ps.setString(8, p.getFornecedor());
            ps.setString(9, p.getLocEstoque());
            
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
        String sql = "delete from produtos where cod="+cod;
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

    public ArrayList<Produto> selectALL() {
            
        ArrayList<Produto> Arrayp = new ArrayList<>();
        String sql = "select * from produtos";
        try{
           PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
                             
              Produto p = new Produto();
              p.setCod(rs.getInt("Cod"));
              p.setNomeProd(rs.getString("NomeProd"));
              p.setCodProd(rs.getString("CodProd"));
              p.setDescricao(rs.getString("Descricao"));
              p.setPreco(rs.getString("Preco"));
              p.setQuantEstoque(rs.getString("QuantEstoque"));
              p.setCategoria(rs.getString("Categoria"));
              p.setDataValidade(rs.getString("DataValidade"));
              p.setFornecedor(rs.getString("Fornecedor"));
              p.setLocEstoque(rs.getString("LocEstoque"));
              Arrayp.add(p);
           }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error: 456");
        }
        return Arrayp;
    }
}

    