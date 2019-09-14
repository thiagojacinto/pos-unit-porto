package PharmacyStore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREATING a 'Cliente':
		Cliente novoCliente = new Cliente();
		novoCliente.documentoString = "09837841";
		novoCliente.nomeString = "Thiago";
		//novoCliente.nfe = 79585;
		//novoCliente.quantiaGasta = (float) 35.96;
		
		// CREATING a 'Funcionario':
		Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.cargo = 1;
		novoFuncionario.cpf = "123415123";
		novoFuncionario.salario = (float) 2456.70;
		novoFuncionario.matricula = novoFuncionario.cpf;
		novoFuncionario.senha = "AbsHs134G98";
		novoFuncionario.nome = "John";
		novoFuncionario.numeroDeVendas = 0;
	
		// CREATING a 'Fornecedor':
		Fornecedor novoFornecedor = new Fornecedor();
		novoFornecedor.cnpjString = "0129837410";
		novoFornecedor.contrato = 438310958;
		novoFornecedor.identifier = 213;
		novoFornecedor.nomeString = "Nivea";
		//novoFornecedor.produto
		novoFornecedor.quantiaPaga = (float) 35.96;

		// CREATING a 'Produto':
		Produto p1 = new Produto();
		p1.validade = "20.09.2021";
		p1.preco = 13.98f;
		p1.quantidade = 25;
		p1.tipo = 1;
		p1.descricaoString = "Radioflex 700 mg";
		p1.fornecedor = novoFornecedor;
			// And now links to 'Fornecedor'
		novoFornecedor.produto = p1;
		
		// CREATING A 'Venda':
		Venda novaVenda = new Venda();
		
		novaVenda.nfe = 795852135;
		novaVenda.valor = p1.preco;
		novaVenda.funcionario = novoFuncionario;
		novaVenda.cliente = novoCliente;
		novaVenda.produto = p1;
		
		System.out.println(novaVenda.toString());
		// Call the sell method
		novoFuncionario.realizarvendaenda(novaVenda);
	}

}
