package br.com.bcbackend.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.bcbackend.entity.Cliente;
import br.com.bcbackend.repository.exceptions.ConexaoException;
import br.com.bcbackend.repository.exceptions.RepositorioException;
import br.com.bcbackend.utils.GerenciadorConexaoDB;
import br.com.bcbackend.utils.GerenciadorConexaoDBMySQL;
import br.com.bcbackend.utils.MySQLQueries;

public class ClienteRepositorio implements Repositorio<Cliente> {
	
	private GerenciadorConexaoDB gerenciadorConexaoDB;
	
	@Override
	public void inserir(Cliente cliente) throws ConexaoException, RepositorioException {
		gerenciadorConexaoDB = GerenciadorConexaoDBMySQL.getInstancia();
		Connection conexao = gerenciadorConexaoDB.conectar();
		
		String sqlQuery = MySQLQueries.INSERIR.getQuery();
		
		try {
			
			PreparedStatement statement = conexao.prepareStatement(sqlQuery);
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getEmail());
			statement.setString(3, cliente.getCpf());
			statement.setDate(4, cliente.getDataNascimento());
			statement.setString(5, cliente.getSexo());
			statement.setString(6, cliente.getNomeSocial());
			statement.setString(7, cliente.getApelido());
			statement.setString(8, cliente.getTelefone());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RepositorioException(e.getMessage());
		} finally {
			gerenciadorConexaoDB.desconectar(conexao);
		}
	}

	@Override
	public Cliente consulta(Cliente cliente) throws ConexaoException, RepositorioException {
		
		gerenciadorConexaoDB = GerenciadorConexaoDBMySQL.getInstancia();
		Connection conexao = gerenciadorConexaoDB.conectar();
		
		String sqlQuery = MySQLQueries.CONSULTAR.getQuery();
		Cliente clienteProcurado = null;
		
		try {
			
			PreparedStatement statement = conexao.prepareStatement(sqlQuery);
			statement.setString(1, cliente.getCpf());
			statement.setString(2, cliente.getEmail());
			
			ResultSet resultadoQuery = statement.executeQuery();
			
			if (resultadoQuery.next()) {
				clienteProcurado = 
						new Cliente(
								resultadoQuery.getString("nome"), 
								resultadoQuery.getString("email"), 
								resultadoQuery.getString("cpf"), 
								resultadoQuery.getDate("dataNascimento"), 
								resultadoQuery.getString("sexo"), 
								resultadoQuery.getString("nomeSocial"), 
								resultadoQuery.getString("apelido"), 
								resultadoQuery.getString("telefone"));
				
				clienteProcurado.setId(resultadoQuery.getInt("id"));
			}
			
		} catch (SQLException e) {
			throw new RepositorioException(e.getMessage());
		} finally {
			gerenciadorConexaoDB.desconectar(conexao);
		}
		
		return clienteProcurado;
	}

	@Override
	public void excluir(Cliente cliente) throws ConexaoException, RepositorioException {
		
		gerenciadorConexaoDB = GerenciadorConexaoDBMySQL.getInstancia();
		Connection conexao = gerenciadorConexaoDB.conectar();
		
		String sqlQuery = MySQLQueries.EXCLUIR.getQuery();
		
		try {
			
			PreparedStatement statement = conexao.prepareStatement(sqlQuery);
			statement.setInt(1, cliente.getId());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			throw new RepositorioException(e.getMessage());
		} finally {
			gerenciadorConexaoDB.desconectar(conexao);
		}
		
	}

	@Override
	public void alterar(Cliente cliente) throws ConexaoException, RepositorioException {
		
		gerenciadorConexaoDB = GerenciadorConexaoDBMySQL.getInstancia();
		Connection conexao = gerenciadorConexaoDB.conectar();
		
		String sqlQuery = MySQLQueries.ALTERAR.getQuery();
		
		try {
			
			PreparedStatement statement = conexao.prepareStatement(sqlQuery);
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getEmail());
			statement.setString(3, cliente.getCpf());
			statement.setDate(4, cliente.getDataNascimento());
			statement.setString(5, cliente.getSexo());
			statement.setString(6, cliente.getNomeSocial());
			statement.setString(7, cliente.getApelido());
			statement.setString(8, cliente.getTelefone());
			statement.setInt(9, cliente.getId());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new RepositorioException(e.getMessage());
		} finally {
			gerenciadorConexaoDB.desconectar(conexao);
		}
		
	}

	@Override
	public List<Cliente> listarTudo() throws ConexaoException, RepositorioException {
		
		gerenciadorConexaoDB = GerenciadorConexaoDBMySQL.getInstancia();
		Connection conexao = gerenciadorConexaoDB.conectar();
		
		String sqlQuery = MySQLQueries.LISTARTUDO.getQuery();
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente auxiliar = null;
		
		try {
			
			Statement statement = conexao.createStatement();
			ResultSet resultadoQuery = statement.executeQuery(sqlQuery);
			
			while (resultadoQuery.next()) {
				auxiliar = 
						new Cliente(
								resultadoQuery.getString("nome"), 
								resultadoQuery.getString("email"), 
								resultadoQuery.getString("cpf"), 
								resultadoQuery.getDate("dataNascimento"), 
								resultadoQuery.getString("sexo"), 
								resultadoQuery.getString("nomeSocial"), 
								resultadoQuery.getString("apelido"), 
								resultadoQuery.getString("telefone"));
				
				auxiliar.setId(resultadoQuery.getInt("id"));
				
				clientes.add(auxiliar);
				
			}
			
		} catch (SQLException e) {
			throw new RepositorioException(e.getMessage());
		} finally {
			gerenciadorConexaoDB.desconectar(conexao);
		}
		
		return clientes;
	}
	
	public Cliente consultaPorId(Cliente cliente) throws ConexaoException, RepositorioException {
		
		gerenciadorConexaoDB = GerenciadorConexaoDBMySQL.getInstancia();
		Connection conexao = gerenciadorConexaoDB.conectar();
		
		String sqlQuery = MySQLQueries.CONSULTARPORID.getQuery();
		Cliente clienteProcurado = null;
		
		try {
			
			PreparedStatement statement = conexao.prepareStatement(sqlQuery);
			statement.setString(1, String.valueOf(cliente.getId()));
			
			ResultSet resultadoQuery = statement.executeQuery();
			
			if (resultadoQuery.next()) {
				clienteProcurado = 
						new Cliente(
								resultadoQuery.getString("nome"), 
								resultadoQuery.getString("email"), 
								resultadoQuery.getString("cpf"), 
								resultadoQuery.getDate("dataNascimento"), 
								resultadoQuery.getString("sexo"), 
								resultadoQuery.getString("nomeSocial"), 
								resultadoQuery.getString("apelido"), 
								resultadoQuery.getString("telefone"));
				
			}
			
		} catch (SQLException e) {
			throw new RepositorioException(e.getMessage());
		} finally {
			gerenciadorConexaoDB.desconectar(conexao);
		}
		
		return clienteProcurado;
	}

}
