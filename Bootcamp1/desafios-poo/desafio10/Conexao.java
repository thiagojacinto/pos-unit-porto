package desafio10;

import java.sql.Connection;

public interface Conexao {
	/**
	 * Realiza uma conexão;
	 * @return
	 */
	public Connection conectar();
	
	/**
	 * Desconecta de determinada conexão passada como parametro.
	 * @param con {@code Connection}
	 */
	public void desconectar(Connection con);
}
