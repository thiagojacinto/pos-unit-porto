package br.com.bcbackend.model;

import java.util.ArrayList;
import java.util.List;

import br.com.bcbackend.entity.Cliente;
import br.com.bcbackend.repository.ClienteRepositorio;
import br.com.bcbackend.repository.exceptions.ConexaoException;
import br.com.bcbackend.repository.exceptions.RepositorioException;

public class RegraNegClienteListar {
	
	/**
	 * Exibe a lista de clientes registrados no repositório.
	 * @return
	 * @throws Exception
	 */
	public List<Cliente> listar() throws Exception {
		
		ClienteRepositorio repositorio = new ClienteRepositorio();
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			lista = (ArrayList<Cliente>) repositorio.listarTudo();
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos com dificuldades. Tente novamente mais tarde (daqui h� 12horas)<br/>" + e.getMessage());
		} catch (RepositorioException e) {
			throw new Exception("O programador fez kk. Nem adianta tentar de novo.<br/>" + e.getMessage());
		}
		return lista;
	}
}
