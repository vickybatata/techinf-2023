package Funcionarios;

import ClasseConexao.conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionariosDAO implements DAO { 

    @Override
    public void insert(Object o) {
        Funcionarios f = (Funcionarios) o;

        String sql = "INSERT INTO funcionario (NomeCompleto, CPF, Endereco, Telefone, "
                   + "Email, DataAdmissao, Cargo, Salario, Departamento) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, f.getNomeCompleto());
            ps.setString(2, f.getCPF());
            ps.setString(3, f.getEndereco());
            ps.setString(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getDataAdmissao());
            ps.setString(7, f.getCargo());
            ps.setString(8, f.getSalario());
            ps.setString(9, f.getDepartamento());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário gravado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível gravar o funcionário.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object o) {
        Funcionarios f = (Funcionarios) o;
        
        String sql = "UPDATE funcionario SET NomeCompleto=?, CPF=?, Endereco=?, Telefone=?, "
                   + "Email=?, DataAdmissao=?, Cargo=?, Salario=?, Departamento=? WHERE Cod=?";
        
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, f.getNomeCompleto());
            ps.setString(2, f.getCPF());
            ps.setString(3, f.getEndereco());
            ps.setString(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getDataAdmissao());
            ps.setString(7, f.getCargo());
            ps.setString(8, f.getSalario());
            ps.setString(9, f.getDepartamento());
            ps.setInt(10, f.getCod());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar o funcionário.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "DELETE FROM funcionario WHERE Cod=?";
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, cod);
            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível excluir o funcionário.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ArrayList<Funcionarios> selectAll() {
        ArrayList<Funcionarios> arrayFuncionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Funcionarios f = new Funcionarios();
                f.setCod(rs.getInt("Cod"));
                f.setNomeCompleto(rs.getString("NomeCompleto"));
                f.setCPF(rs.getString("CPF"));
                f.setEndereco(rs.getString("Endereco"));
                f.setTelefone(rs.getString("Telefone"));
                f.setEmail(rs.getString("Email"));
                f.setDataAdmissao(rs.getString("DataAdmissao"));
                f.setCargo(rs.getString("Cargo"));
                f.setSalario(rs.getString("Salario"));
                f.setDepartamento(rs.getString("Departamento"));
                arrayFuncionarios.add(f);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar funcionários: " + e.getMessage());
            e.printStackTrace();
        }
        
        return arrayFuncionarios;
    }
}
