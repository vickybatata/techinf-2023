package login;

import ClasseConexao.conexao;
import Fornecedores.FormFornecedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    public Login l = new Login();

    
    public void insert(Object o) {
        l = (Login) o;
        String sql = "INSERT INTO login (Usuario, Senha, Status) VALUES (?, ?, ?)";
            try {
             PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
             ps.setString(1, l.getUsuario());
             ps.setString(2, l.getSenha());
    
    
            String status = l.getStatus();
            if (status.length() > 50) {
                
                JOptionPane.showMessageDialog(null, "Erro: O status excede o comprimento máximo permitido.");
                return; 
            }

            ps.setString(3, status);
            int atual = ps.executeUpdate();

            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir registro: 457");
            }
            ps.close();

            } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao inserir registro: 456 " + e.getMessage());
            }
    }
    
   public void update (Object o) {
        Login l = (Login) o;
        String sql = "UPDATE Login SET Usuario = ?, Senha = ?, Status = ? WHERE Cod = ?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());


            String status = l.getStatus();
            if (status.length() > 50) { // Substitua 50 pelo tamanho máximo permitido no seu banco de dados
                JOptionPane.showMessageDialog(null, "Erro: O status excede o comprimento máximo permitido.");
                return; // ou outra lógica adequada ao seu aplicativo
            }

            ps.setString(3, status);
            ps.setInt(4, l.getCod());

            int atual = ps.executeUpdate();

            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar registro: 457");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro: 456 " + e.getMessage());
        }
   }


   
    public void delete(int cod) {
        String sql = "DELETE FROM Login WHERE Cod = ?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            int atual = ps.executeUpdate();
           
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro: 457");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar registro: 456 " + e.getMessage());
        }
    }

    // Método para desativar um registro de login pelo código (definir Status como 'Inativo')
    public void desativar(int cod) {
        String sql = "UPDATE Login SET Status = 'Inativo' WHERE Cod = ?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            int atual = ps.executeUpdate();
           
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Registro desativado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao desativar registro: 457");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desativar registro: 456 " + e.getMessage());
        }
    }

    // Método para realizar o login
    public void logar(Login user) {
        l = user;
        String sql = "SELECT Usuario, Senha FROM Login WHERE Usuario = ? AND Senha = ?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
                   
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new FormFornecedores().setVisible(true);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Senha ou usuário inválido...");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar login: 455 " + e.getMessage());
        }
    }

    // Método para selecionar todos os registros de login
    public ArrayList<Login> selectAll() {
        ArrayList<Login> arrayLogin = new ArrayList<>();
        String sql = "SELECT * FROM Login";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Login l = new Login();
                l.setCod(rs.getInt("Cod"));
                l.setUsuario(rs.getString("Usuario"));
                l.setSenha(rs.getString("Senha"));
                l.setStatus(rs.getString("Status"));
                arrayLogin.add(l);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros: 452 " + e.getMessage());
        }
        return arrayLogin;
    }

    }


