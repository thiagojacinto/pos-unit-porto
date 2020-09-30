package br.com.bcbackend.repository;

import java.util.List;

import br.com.bcbackend.repository.exceptions.ConexaoException;
import br.com.bcbackend.repository.exceptions.RepositorioException;

public interface Repositorio<Objeto> {
	
	/**
	 * Armazena um dado objeto no repositório
	 * @param Objeto 
	 * @throws ConexaoException
	 * @throws RepositoryException
	 */
	public void inserir(Objeto objeto)throws ConexaoException, RepositorioException;
	
	/**
	 * Busca no repositório e retorna um objeto 
	 * @param obObjetoj 
	 * @return
	 * @throws ConexaoException
	 * @throws RepositoryException
	 */
	public Objeto consulta(Objeto objeto)throws ConexaoException, RepositorioException;
	
	/**
	 * Busca no repositório e remove um objeto 
	 * @param Objeto
	 * @throws ConexaoException
	 * @throws RepositorioException
	 */
	public void excluir(Objeto objeto)throws ConexaoException, RepositorioException;
	
	/**
	 * Busca no repositório e altera as propriedades de um determinado objeto
	 * @param Objeto
	 * @throws ConexaoException
	 * @throws RepositorioException
	 */
	public void alterar(Objeto objeto)throws ConexaoException, RepositorioException;
	
	/**
	 * Retorna uma lista de todos os objetos contidos no repositório.
	 * @return
	 * @throws ConexaoException
	 * @throws RepositorioException
	 */
	public List<Objeto> listarTudo()throws ConexaoException, RepositorioException;
}
