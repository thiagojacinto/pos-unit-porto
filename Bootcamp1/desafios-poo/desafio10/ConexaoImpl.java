package desafio10;

import java.sql.Connection;

public class ConexaoImpl implements Conexao {
	
	private String usuario;
	private String senha;
	private String uri;

	@Override
	public Connection conectar() {
		System.out.println(this.getClass().getName() + " > conectar()");

		System.out.println("Conectando ...");
		try {
			Thread.sleep(1500);
			System.out.println("Conexão realizada na URI: " + this.getUri());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void desconectar(Connection con) {
		System.out.println(this.getClass().getName() + " > desconectar");

		System.out.println("Desconectando ...");
		try {
			Thread.sleep(2300);
			System.out.println("Conexão fechada na URI: " + this.getUri());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
