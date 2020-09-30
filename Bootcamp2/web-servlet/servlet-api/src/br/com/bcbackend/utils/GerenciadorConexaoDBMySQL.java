package br.com.bcbackend.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.bcbackend.repository.exceptions.ConexaoException;

public class GerenciadorConexaoDBMySQL implements GerenciadorConexaoDB {
	
	private static GerenciadorConexaoDBMySQL instanciaMySQL ;
	
	private GerenciadorConexaoDBMySQL() {
	}
	
	/**
	 * Retornar uma instância SINGLETON do GerenciadorConexao
	 * @return GerenciadorConexaoDBMySQL
	 */
	public static GerenciadorConexaoDBMySQL getInstancia() {
		if(instanciaMySQL == null) {
			instanciaMySQL = new GerenciadorConexaoDBMySQL();
		}
		return instanciaMySQL;
	}
	
	@Override
	public Connection conectar() throws ConexaoException {
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/lojaunit?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String password = "testando";
		Connection conexao = null;
		
		try {
			
			Class.forName(driverName);
			conexao = DriverManager.getConnection(
					url, 
					user, 
					password
					);
		} catch(SQLException e) {
			throw new ConexaoException(
					e.getErrorCode()
					+ "\n >> Message >>" + e.getMessage()
					+ "\n >> SQL State >>" + e.getSQLState()
					);
		} catch (Exception e) {
			throw new ConexaoException(
					"Erro: O driver especificado não foi encontrado.\n" 
					+ e.getMessage()
					);
		}
		
		return conexao;
	}

	@Override
	public void desconectar(Connection conexao) throws ConexaoException {
		try {
			conexao.close();
		} catch (SQLException e) {
			throw new ConexaoException(e.getMessage());
		}
		
	}

}
