package Contas;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContasDAO implements DAO {

    @Override
    public void insert(Object o) {
    Contas c = (Contas) o;

    String sql = "INSERT INTO Contas (DescricaoConta, Valor, DataVenc, DataPag, Fornecedor, Categoria, StatusPag, MetPag, Observacoes) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, c.getDescricao());

        // Converte o valor para BigDecimal
        BigDecimal valor;
        try {
            valor = new BigDecimal(c.getValor());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido: " + c.getValor());
            return;
        }
        ps.setBigDecimal(2, valor);

        ps.setString(3, c.getDtVenc());
        ps.setString(4, c.getDtPag());
        ps.setString(5, c.getFornecedor());
        ps.setString(6, c.getCategoria());
        ps.setString(7, c.getStatusPag());
        ps.setString(8, c.getMetPag());
        ps.setString(9, c.getObservacoes());

        int atual = ps.executeUpdate();
        if (atual > 0) {
            JOptionPane.showMessageDialog(null, "Conta gravada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não houve gravação da conta.");
        }

        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir registro: 123 " + e.getMessage());
        e.printStackTrace(); // Imprima o stack trace para depuração
    }
}

    @Override
    public void update(Object o) {
        Contas c = (Contas) o;

        String sql = "UPDATE contas SET DescricaoConta=?, Valor=?, DataVenc=?, DataPag=?,"
                   + " Fornecedor=?, Categoria=?, StatusPag=?, MetPag=?, Observacoes=? "
                   + "WHERE cod=?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getDescricao());
            ps.setString(2, c.getValor()); 
            ps.setString(3, c.getDtVenc());
            ps.setString(4, c.getDtPag());
            ps.setString(5, c.getFornecedor());
            ps.setString(6, c.getCategoria());
            ps.setString(7, c.getStatusPag());
            ps.setString(8, c.getMetPag());
            ps.setString(9, c.getObservacoes());
            ps.setInt(10, c.getCod());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Conta atualizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não houve atualização da conta.");
            }

            ps.close(); // Fechar o PreparedStatement

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro: 124 " + e.getMessage());
            e.printStackTrace(); // Imprima o stack trace para depuração
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "DELETE FROM contas WHERE cod=?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Conta excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não houve exclusão da conta.");
            }

            ps.close(); // Fechar o PreparedStatement

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro: 125 " + e.getMessage());
            e.printStackTrace(); // Imprima o stack trace para depuração
        }
    }

   
    public ArrayList<Contas> selectAll() {
        ArrayList<Contas> Arrayc = new ArrayList<>();
        String sql = "SELECT * FROM contas";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Contas c = new Contas();
                c.setCod(rs.getInt("Cod"));
                c.setDescricao(rs.getString("DescricaoConta"));
                c.setValor(rs.getString("Valor")); 
                c.setDtVenc(rs.getString("DataVenc"));
                c.setDtPag(rs.getString("DataPag"));
                c.setFornecedor(rs.getString("Fornecedor"));
                c.setCategoria(rs.getString("Categoria"));
                c.setStatusPag(rs.getString("StatusPag"));
                c.setMetPag(rs.getString("MetPag"));
                c.setObservacoes(rs.getString("Observacoes"));
                Arrayc.add(c);
            }

            rs.close(); 
            ps.close(); 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar registros: 126 " + e.getMessage());
            e.printStackTrace(); 
        }

        return Arrayc;
    }
}
