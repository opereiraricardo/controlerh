package controller;

import java.sql.SQLException;
import java.util.List;
import model.Cargo;
import model.CargoDAO;
import model.Funcionario;
import model.FuncionarioDAO;

public class FuncionarioController {
    private FuncionarioDAO funcionarioDAO;
    private CargoDAO cargoDAO;

    public FuncionarioController() throws SQLException {
        this.funcionarioDAO = new FuncionarioDAO();
    }

    // Método para adicionar um novo funcionário
    public void addFuncionario(String nome, String email, String telefone, java.sql.Date dataContratacao, int idCargo) throws SQLException {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);
        funcionario.setDataContratacao(dataContratacao);
        funcionario.setIdCargo(idCargo);
        funcionarioDAO.addFuncionario(funcionario);
    }

    // Método para atualizar os dados de um funcionário
    public void updateFuncionario(int id, String nome, String email, String telefone, java.sql.Date dataContratacao, int idCargo) throws SQLException {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);
        funcionario.setDataContratacao(dataContratacao);
        funcionario.setIdCargo(idCargo);
        funcionarioDAO.updateFuncionario(funcionario);
    }

    // Método para excluir um funcionário
    public void deleteFuncionario(int id) throws SQLException {
        funcionarioDAO.deleteFuncionario(id);
    }

    // Método para buscar todos os funcionários
    public List<Funcionario> getAllFuncionarios() throws SQLException {
        return funcionarioDAO.getAllFuncionarios();
    }

    // Método para buscar um funcionário pelo ID
    public Funcionario getFuncionarioById(int id) throws SQLException {
        return funcionarioDAO.getFuncionarioById(id);
    }
    
    public List<Funcionario> searchFuncionariosByName(String nome) throws SQLException {
        return funcionarioDAO.searchFuncionariosByName(nome);
    }

    public List<Cargo> listarCargos() throws SQLException {
    return cargoDAO.getAllCargos();
}

}
