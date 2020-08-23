package desafio10;

import java.util.ArrayList;

public class DaoClienteImpl implements DaoCliente {

	private ArrayList<Cliente> clientes;

	public DaoClienteImpl() {
		clientes = new ArrayList<Cliente>();
	}

	public DaoClienteImpl(ArrayList<Cliente> lista) {
		clientes = lista;
	}

	@Override
	public Cliente incluir(Cliente cliente) {
		System.out.println(this.getClass().getName() + " > incluir");
		return clientes.add(cliente) ? cliente : null;
	}

	@Override
	public void excluir(Integer codigo) {
		System.out.println(this.getClass().getName() + " > excluir");

		for (Cliente cliente : clientes) {
			if (cliente.getCodigo().equals(codigo)) {
				this.clientes.remove(cliente);
				System.out.println(
						"Cliente removido, id = " + cliente.getCodigo()
						+ ", nome = " + cliente.getNome()
						);
				return;
			}
		}
		System.out.println("Não foi possível realizar a exclusão.");
	}

	@Override
	public Cliente alterar(Cliente cliente) {
		System.out.println(this.getClass().getName() + " > alterar");

		for (Cliente clienteCadastrado : clientes) {

			if (clienteCadastrado.getCodigo().equals(cliente.getCodigo())) {
				
				clienteCadastrado.setCpf(cliente.getCpf());
				clienteCadastrado.setEndereco(cliente.getEndereco());
				clienteCadastrado.setNome(cliente.getNome());
				
			}
		}
		return null;
	}

	
	@Override
	public ArrayList<Cliente> listar() {
		System.out.println(this.getClass().getName() + " > listar");
		return this.clientes;
	}

	@Override
	public Cliente get() {
		System.out.println(this.getClass().getName() + " > get()");
		
		Integer tamanho = this.clientes.size();
		if (tamanho > 0)
			return this.clientes.get(this.clientes.size() - 1);
		
		return null;
	}

}
