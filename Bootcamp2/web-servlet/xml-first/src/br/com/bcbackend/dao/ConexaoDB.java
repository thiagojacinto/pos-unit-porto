package br.com.bcbackend.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	
	private static boolean status;
	
	public ConexaoDB() {
		status = false;
	}
	
	/**
	 * Abrir a conexão com banco de dados.
	 * @return
	 */
	public static Connection abrirConexao() {
		
		Connection conexao = null;
		
		try {

			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/mysql", 
					"root", 
					"123456"
					);
			
			if (conexao != null) {
				System.out.println(">>>> Sucesso na conexão com banco de dados.");
				status = true;
			}
			
			status = false;
			
		} catch (ClassNotFoundException e) {
			System.err.println("Erro: O driver especificado não foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.err.println("Erro: não foi possível conectar com banco de dados.");
			return null;
		}
		
		return conexao;
	}
	
	/**
	 * Retorna o status da conexão com banco de dados.
	 */
	public static boolean getStatus() {
		return status;
	}
	
	public static void fecharConexao() {
		
	}
}
