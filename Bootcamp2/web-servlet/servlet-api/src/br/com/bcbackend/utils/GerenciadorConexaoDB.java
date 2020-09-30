package br.com.bcbackend.utils;

import java.sql.Connection;

import br.com.bcbackend.repository.exceptions.ConexaoException;

public interface GerenciadorConexaoDB {
	
	/**
	 * Estabelece uma conexao com o BD
	 * @return Objeto de conexão
	 * @throws ConexaoException
	 */
	public Connection conectar() throws ConexaoException;
	
	/**
	 * Encerra a conexao c com o BD
	 * @param c Objeto de conexão
	 * @throws ConexaoException
	 */
	public void desconectar(Connection c) throws ConexaoException;
}
