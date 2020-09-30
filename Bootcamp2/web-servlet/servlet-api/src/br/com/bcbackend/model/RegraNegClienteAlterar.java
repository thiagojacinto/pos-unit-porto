package br.com.bcbackend.model;

import br.com.bcbackend.entity.Cliente;
import br.com.bcbackend.repository.ClienteRepositorio;
import br.com.bcbackend.repository.exceptions.ConexaoException;
import br.com.bcbackend.repository.exceptions.RepositorioException;

public class RegraNegClienteAlterar {
	
	/**
	 * Altera os dados de um cliente no repositório.
	 * @param cliente
	 * @throws Exception
	 */
	public void alterar(Cliente cliente) throws Exception {
		
		Cliente antigosDados = verificar(cliente);
		cliente.setCpf(antigosDados.getCpf());
		cliente.setDataNascimento(antigosDados.getDataNascimento());
		
		validarDados(cliente);
		RegraNegClienteRemover.validarDados(cliente);
		
		ClienteRepositorio repositorio = new ClienteRepositorio();
		
		try {
			repositorio.alterar(cliente);
			
		} catch (ConexaoException e) {
			e.printStackTrace();
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui a 12horas)<br/> [ALTERAR] Erro: " + e.getMessage());
		
		} catch (RepositorioException e) {
			e.printStackTrace();
			throw new Exception("O programador fez kk. Nem adianta tentar de novo.<br/>[ALTERAR] Erro: " + e.getMessage());
		}
	}
	
	/**
	 * Verificar se existe cliente com ID informado e retorna este objeto.
	 * @param cliente com ID
	 * @return cliente objeto completo
	 * @throws Exception
	 */
	static protected Cliente verificar(Cliente cliente) throws Exception {
		ClienteRepositorio repositorio = new ClienteRepositorio();
		Cliente procurado = null;
		try {
			procurado = repositorio.consultaPorId(cliente);
			
			if (procurado == null) {
				throw new Exception("Cliente inexistente na base de dados.");
			}
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui a 12horas)<br/>[ALTERAR] Erro: " + e.getMessage());
		} catch (RepositorioException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo.<br/>[ALTERAR] Erro: " + e.getMessage());
		}
		
		return procurado;
	}
	
	/**
	 * Valida os dados necessários, preenchimento, valores
	 * @param cliente
	 * @throws Exception
	 */
	static protected void validarDados(Cliente cliente) throws Exception {
		if ((cliente.getNome() == null) || cliente.getNome().isEmpty()) {
			throw new Exception("Nome inválido");
		}
		if ((cliente.getEmail() == null) || cliente.getEmail().isEmpty()) {
			throw new Exception("E-mail inválido");
		}
		if ((cliente.getNomeSocial() == null) || cliente.getNomeSocial().isBlank() || cliente.getNomeSocial().isEmpty()) {
			cliente.setNomeSocial(cliente.getNome());
		}
		if (cliente.getApelido() == null || cliente.getApelido().isBlank() || cliente.getApelido().isEmpty()) {
			cliente.setApelido(cliente.getNome());
		}
	}
	
}
