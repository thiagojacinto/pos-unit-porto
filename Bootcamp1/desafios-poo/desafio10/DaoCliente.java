package desafio10;

import java.util.ArrayList;

public interface DaoCliente {
	
	/**
	 * Insere um novo cliente na base de dados.
	 * @param cliente
	 * @return
	 */
	public Cliente incluir(Cliente cliente);
	
	/**
	 * Remove um cliente da base a partir de seu código.
	 * @param codigo 
	 */
	public void excluir(Integer codigo);
	
	/**
	 * Altera as informações de um cliente já presente na base de dados.
	 * @param cliente
	 * @return
	 */
	public Cliente alterar(Cliente cliente);
	
	/**
	 * Exibe a lista de clientes presentes no banco de dados.
	 * @return {@code ArrayList de Clientes}
	 */
	public ArrayList<Cliente> listar();
	
	/**
	 * Exibe um cliente.
	 * @return
	 */
	public Cliente get();
}
