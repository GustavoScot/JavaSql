package com.mycompany.lojaaluguel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class Operacoes {

    public void inserirVeiculo(String marca, String modelo, int ano, String placa, String status, float precoDiario) {
        String sql = "INSERT INTO Veiculo (Marca, Modelo, Ano, Placa, Status, Preco_Diario) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setInt(3, ano);
            stmt.setString(4, placa);
            stmt.setString(5, status);
            stmt.setFloat(6, precoDiario);
            stmt.executeUpdate();
            System.out.println("Veículo inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir veículo: " + e.getMessage());
        }
    }

    public void listarVeiculos() {
        String sql = "SELECT * FROM Veiculo";
        try (Connection conexao = Conexao2.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_Veiculo"));
                System.out.println("Marca: " + rs.getString("Marca"));
                System.out.println("Modelo: " + rs.getString("Modelo"));
                System.out.println("Ano: " + rs.getInt("Ano"));
                System.out.println("Placa: " + rs.getString("Placa"));
                System.out.println("Status: " + rs.getString("Status"));
                System.out.println("Preço Diário: " + rs.getFloat("Preco_Diario"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar veículos: " + e.getMessage());
        }
    }

    public void atualizarVeiculo(int idVeiculo, String novoStatus) {
        String sql = "UPDATE Veiculo SET Status = ? WHERE ID_Veiculo = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, novoStatus);
            stmt.setInt(2, idVeiculo);
            stmt.executeUpdate();
            System.out.println("Status do veículo atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar status do veículo: " + e.getMessage());
        }
    }

    public void excluirVeiculo(int idVeiculo) {
        String sql = "DELETE FROM Veiculo WHERE ID_Veiculo = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idVeiculo);
            stmt.executeUpdate();
            System.out.println("Veículo excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir veículo: " + e.getMessage());
        }
    }

    public void inserirLocatorio(String nome, String cpf, String telefone, String endereco, Date dataNascimento, String email) {
        String sql = "INSERT INTO Locatorio (Nome, CPF, Telefone, Endereco, Data_Nascimento, Email) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, telefone);
            stmt.setString(4, endereco);
            stmt.setDate(5, dataNascimento);
            stmt.setString(6, email);
            stmt.executeUpdate();
            System.out.println("Locatário inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir locatário: " + e.getMessage());
        }
    }

    public void listarLocatorios() {
        String sql = "SELECT * FROM Locatorio";
        try (Connection conexao = Conexao2.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_Locatorio"));
                System.out.println("Nome: " + rs.getString("Nome"));
                System.out.println("CPF: " + rs.getString("CPF"));
                System.out.println("Telefone: " + rs.getString("Telefone"));
                System.out.println("Endereço: " + rs.getString("Endereco"));
                System.out.println("Data de Nascimento: " + rs.getDate("Data_Nascimento"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar locatários: " + e.getMessage());
        }
    }

    public void atualizarLocatorio(int idLocatorio, String novoNome) {
        String sql = "UPDATE Locatorio SET Nome = ? WHERE ID_Locatorio = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setInt(2, idLocatorio);
            stmt.executeUpdate();
            System.out.println("Locatário atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar locatário: " + e.getMessage());
        }
    }

    public void excluirLocatorio(int idLocatorio) {
        String sql = "DELETE FROM Locatorio WHERE ID_Locatorio = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idLocatorio);
            stmt.executeUpdate();
            System.out.println("Locatário excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir locatário: " + e.getMessage());
        }
    }

    public void inserirFuncionario(String nome, String cpf, String cargo, String telefone, String email) {
        String sql = "INSERT INTO Funcionario (Nome, CPF, Cargo, Telefone, Email) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, cargo);
            stmt.setString(4, telefone);
            stmt.setString(5, email);
            stmt.executeUpdate();
            System.out.println("Funcionário inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir funcionário: " + e.getMessage());
        }
    }

    public void listarFuncionarios() {
        String sql = "SELECT * FROM Funcionario";
        try (Connection conexao = Conexao2.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_Funcionario"));
                System.out.println("Nome: " + rs.getString("Nome"));
                System.out.println("CPF: " + rs.getString("CPF"));
                System.out.println("Cargo: " + rs.getString("Cargo"));
                System.out.println("Telefone: " + rs.getString("Telefone"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
        }
    }

    public void atualizarFuncionario(int idFuncionario, String novoCargo) {
        String sql = "UPDATE Funcionario SET Cargo = ? WHERE ID_Funcionario = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, novoCargo);
            stmt.setInt(2, idFuncionario);
            stmt.executeUpdate();
            System.out.println("Funcionário atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar funcionário: " + e.getMessage());
        }
    }

    public void excluirFuncionario(int idFuncionario) {
        String sql = "DELETE FROM Funcionario WHERE ID_Funcionario = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idFuncionario);
            stmt.executeUpdate();
            System.out.println("Funcionário excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir funcionário: " + e.getMessage());
        }
    }

    public void inserirPagamento(int idLocacao, float valor, Date dataPagamento, String metodo, String status) {
        String sql = "INSERT INTO Pagamento (ID_Locacao, Valor, Data_Pagamento, Metodo, Status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idLocacao);
            stmt.setFloat(2, valor);
            stmt.setDate(3, dataPagamento);
            stmt.setString(4, metodo);
            stmt.setString(5, status);
            stmt.executeUpdate();
            System.out.println("Pagamento inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir pagamento: " + e.getMessage());
        }
    }

    public void listarPagamentos() {
        String sql = "SELECT * FROM Pagamento";
        try (Connection conexao = Conexao2.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_Pagamento"));
                System.out.println("ID Locação: " + rs.getInt("ID_Locacao"));
                System.out.println("Valor: " + rs.getFloat("Valor"));
                System.out.println("Data Pagamento: " + rs.getDate("Data_Pagamento"));
                System.out.println("Método: " + rs.getString("Metodo"));
                System.out.println("Status: " + rs.getString("Status"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar pagamentos: " + e.getMessage());
        }
    }

    public void excluirPagamento(int idPagamento) {
        String sql = "DELETE FROM Pagamento WHERE ID_Pagamento = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idPagamento);
            stmt.executeUpdate();
            System.out.println("Pagamento excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir pagamento: " + e.getMessage());
        }
    }

    public void inserirDevolucao(int idLocacao, Date dataDevolucao, int quilometragem, String condicaoVeiculo, float multa) {
        String sql = "INSERT INTO Devolucao (ID_Locacao, Data_Devolucao, Quilometragem, Condicao_Veiculo, Multa) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idLocacao);
            stmt.setDate(2, dataDevolucao);
            stmt.setInt(3, quilometragem);
            stmt.setString(4, condicaoVeiculo);
            stmt.setFloat(5, multa);
            stmt.executeUpdate();
            System.out.println("Devolução registrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao registrar devolução: " + e.getMessage());
        }
    }

    public void listarDevolucoes() {
        String sql = "SELECT * FROM Devolucao";
        try (Connection conexao = Conexao2.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_Devolucao"));
                System.out.println("ID Locação: " + rs.getInt("ID_Locacao"));
                System.out.println("Data Devolução: " + rs.getDate("Data_Devolucao"));
                System.out.println("Quilometragem: " + rs.getInt("Quilometragem"));
                System.out.println("Condição do Veículo: " + rs.getString("Condicao_Veiculo"));
                System.out.println("Multa: " + rs.getFloat("Multa"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar devoluções: " + e.getMessage());
        }
    }

    public void excluirDevolucao(int idDevolucao) {
        String sql = "DELETE FROM Devolucao WHERE ID_Devolucao = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idDevolucao);
            stmt.executeUpdate();
            System.out.println("Devolução excluída com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir devolução: " + e.getMessage());
        }
    }

    public void inserirLocacao(Date dataInicio, Date dataFim, int idVeiculo, int idLocatorio, int idFuncionario, String status) {
        String sql = "INSERT INTO Locacao (Data_Inicio, Data_Fim, ID_Veiculo, ID_Locatorio, ID_Funcionario, Status) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setDate(1, dataInicio);
            stmt.setDate(2, dataFim);
            stmt.setInt(3, idVeiculo);
            stmt.setInt(4, idLocatorio);
            stmt.setInt(5, idFuncionario);
            stmt.setString(6, status);
            stmt.executeUpdate();
            System.out.println("Locação inserida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir locação: " + e.getMessage());
        }
    }

    public void listarLocacoes() {
        String sql = "SELECT * FROM Locacao";
        try (Connection conexao = Conexao2.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID_Locacao"));
                System.out.println("Data Início: " + rs.getDate("Data_Inicio"));
                System.out.println("Data Fim: " + rs.getDate("Data_Fim"));
                System.out.println("ID Veículo: " + rs.getInt("ID_Veiculo"));
                System.out.println("ID Locatário: " + rs.getInt("ID_Locatorio"));
                System.out.println("ID Funcionário: " + rs.getInt("ID_Funcionario"));
                System.out.println("Status: " + rs.getString("Status"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar locações: " + e.getMessage());
        }
    }

    public void excluirLocacao(int idLocacao) {
        String sql = "DELETE FROM Locacao WHERE ID_Locacao = ?";
        try (Connection conexao = Conexao2.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idLocacao);
            stmt.executeUpdate();
            System.out.println("Locação excluída com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir locação: " + e.getMessage());
        }
    }
}