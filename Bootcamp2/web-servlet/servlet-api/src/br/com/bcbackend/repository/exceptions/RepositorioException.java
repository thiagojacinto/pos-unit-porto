package br.com.bcbackend.repository.exceptions;

public class RepositorioException extends Exception {

	private static final long serialVersionUID = 1L;

	public RepositorioException(String descricao) {
		super(descricao);
	}
	
	public RepositorioException(Exception excecao) {
		super(excecao);
	}
}	
