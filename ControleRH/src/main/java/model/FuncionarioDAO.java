package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class FuncionarioDAO {

    // Método para adicionar um novo funcionário ao banco de dados
    public void addFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO Funcionarios (nome, email, telefone, data_contratacao, id_cargo) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEmail());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setDate(4, funcionario.getDataContratacao());
            stmt.setInt(5, funcionario.getIdCargo());
            stmt.executeUpdate();
            stmt.close();
        }
    }

    // Método para atualizar os dados de um funcionário no banco de dados
    public void updateFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE Funcionarios SET nome=?, email=?, telefone=?, data_contratacao=?, id_cargo=? WHERE id=?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEmail());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setDate(4, funcionario.getDataContratacao());
            stmt.setInt(5, funcionario.getIdCargo());
            stmt.setInt(6, funcionario.getId());
            stmt.executeUpdate();
            stmt.close();
        }
       
    }

    // Método para excluir um funcionário do banco de dados
    public void deleteFuncionario(int id) throws SQLException {
        String sql = "DELETE FROM Funcionarios WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        }
       
    }

    public List<Funcionario> searchFuncionariosByName(String nome) throws SQLException {
        
        String sql = "SELECT * FROM Funcionarios WHERE nome LIKE ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            List<Funcionario> funcionarios = new ArrayList<>();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setDataContratacao(rs.getDate("data_contratacao"));
                funcionarios.add(funcionario);
            }
            return funcionarios;
        }
        
    }
    
    
    // Método para buscar todos os funcionários no banco de dados
    public List<Funcionario> getAllFuncionarios() throws SQLException {
        String sql = "SELECT * FROM Funcionarios";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            
            List<Funcionario> funcionarios = new ArrayList<>();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setDataContratacao(rs.getDate("data_contratacao"));
                funcionario.setIdCargo(rs.getInt("id_cargo"));
                funcionarios.add(funcionario);
            }
            rs.close();
            stmt.close();
            return funcionarios;
        }
        
    }

    // Método para buscar um funcionário pelo ID no banco de dados
    public Funcionario getFuncionarioById(int id) throws SQLException {
        Funcionario funcionario = new Funcionario();
        String sql = "SELECT * FROM Funcionarios WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            
            if (rs.next()) {
                
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setDataContratacao(rs.getDate("data_contratacao"));
                funcionario.setIdCargo(rs.getInt("id_cargo"));
                rs.close();
                stmt.close();
                return funcionario;
            }          
                
                
    }
        return null;
    
}
}
