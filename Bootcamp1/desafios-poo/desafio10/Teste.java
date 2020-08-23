package desafio10;


public class Teste {

	public static void main(String[] args) {
		
		System.out.println(">>>> Conexão com DB >>>>");
		
		ConexaoImpl conexao = new ConexaoImpl();
		conexao.setUri("https://localhost:5151");
		conexao.conectar();
		
		System.out.println(">>>> Novos Clientes >>>>");
		
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo(1);
		cliente1.setNome("Thiago");
		cliente1.setCpf("2222222222-22");
		cliente1.setEndereco("Novo endereço, 22, Olinda");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCodigo(2);
		cliente2.setNome("Jacinto");
		cliente2.setCpf("9925555522-22");
		cliente2.setEndereco("Antigo endereço, 9, Olinda");
		
		System.out.println(cliente1 + "\n" + cliente2);
		
		System.out.println(">>>> DAO Implementation >>>>");
		
		DaoClienteImpl DAOCliente = new DaoClienteImpl();
		DAOCliente.incluir(cliente1);
		System.out.println("Lista apos adição: " + DAOCliente.listar());
		DAOCliente.incluir(cliente2);
		System.out.println("Lista apos adição: " + DAOCliente.listar());
		
		cliente2.setCpf("88888888888-15");
		DAOCliente.alterar(cliente2);
		System.out.println("Lista apos alteração: " + DAOCliente.listar());
		
		DAOCliente.excluir(cliente2.getCodigo());
		System.out.println("Lista apos exclusão: " + DAOCliente.listar());
		
		DAOCliente.get();
		
		System.out.println(">>>> Desconectando do DB >>>>");
		conexao.desconectar(null);
	}

}
