package br.com.bcbackend.repository.exceptions;

public class ConexaoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ConexaoException(String x) {
		super(x);
		System.err.println("Erro: verificar conexão com banco de dados.");
	}
	
	public ConexaoException(Exception x) {
		super(x);
	}
}
