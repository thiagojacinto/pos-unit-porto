package br.com.bcbackend.model;

import br.com.bcbackend.entity.Cliente;
import br.com.bcbackend.repository.ClienteRepositorio;
import br.com.bcbackend.repository.exceptions.ConexaoException;
import br.com.bcbackend.repository.exceptions.RepositorioException;

public class RegraNegClienteRemover {
	
	/**
	 * Remove um cliente da base de dados.
	 * @param cliente
	 * @throws Exception
	 */
	public void remover(Cliente cliente) throws Exception {
		
		validarDados(cliente);
		
		ClienteRepositorio repositorio = new ClienteRepositorio();
		
		try {
			repositorio.excluir(cliente);
			
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui a 12horas)<br/> [REMOVER] Erro: " + e.getMessage());
		} catch (RepositorioException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo.<br/>[REMOVER] Erro: " + e.getMessage());
		}
	}
	
	/**
	 * Valida os dados necessários, preenchimento, valores
	 * @param cliente
	 * @throws Exception
	 */
	protected static void validarDados(Cliente cliente) throws Exception {
		if ((cliente.getId() == null) || !(cliente.getId() instanceof Integer)) {
			throw new Exception("ID inválido.");
		}
	}
}
