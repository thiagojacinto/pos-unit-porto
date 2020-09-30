package br.com.bcbackend.model;

import br.com.bcbackend.entity.Cliente;
import br.com.bcbackend.repository.ClienteRepositorio;
import br.com.bcbackend.repository.exceptions.ConexaoException;
import br.com.bcbackend.repository.exceptions.RepositorioException;

public class RegraNegClienteSalvar {
	
	/**
	 * Salva o cliente no banco de dados.
	 * @param cliente
	 * @throws Exception
	 */
	public void salvar(Cliente cliente) throws Exception {
		validarDados(cliente);
		verificar(cliente);
		inserir(cliente);
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
		if ((cliente.getCpf() == null) || cliente.getCpf().isEmpty()) {
			throw new Exception("CPF inválido");
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
	
	/**
	 * Verifica se existe duplicidade de cadastro
	 * chama a Persistência para ver se já existe o CPF no BD
	 * @param cliente
	 */
	static protected void verificar(Cliente cliente) throws Exception {
		ClienteRepositorio repositorio = new ClienteRepositorio();
		
		try {
			Cliente procurado = repositorio.consulta(cliente);
			if (procurado != null) {
				throw new Exception("CPF duplicado");
			}
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui a 12horas)<br/>" + e.getMessage());
		} catch (RepositorioException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo.<br/>" + e.getMessage());
		}
	}
	
	/**
	 * enviar para o responsável pela persistência
	 * @param cliente
	 * @throws Exception
	 */
	private void inserir(Cliente cliente) throws Exception {
		ClienteRepositorio repositorio = new ClienteRepositorio();
		try {
			repositorio.inserir(cliente);
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui a 12horas)<br/>" + e.getMessage());
		} catch (RepositorioException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo<br/>" + e.getMessage());
		}

	}
}
