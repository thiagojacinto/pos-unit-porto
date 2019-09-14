package PharmacyStore;

public class Funcionario {
	String nome, cpf, matricula, senha;
	float salario;
	int cargo, numeroDeVendas;
	
	// CARGO details:
	// 0 - Manager 
	// 1 - Seller 1
	// 2 - Seller 2
	// 3 - Pharmacy Specialist
	
	// Create a method to sell
	void realizarvendaenda(Venda venda1) {
		
		venda1.produto.quantidade--;
		venda1.funcionario.numeroDeVendas++;
		
		System.out.println("Produto: " + venda1.produto.descricaoString);
		System.out.println("Valor = " + venda1.valor);
		System.out.println("venda realizada, parabéns!");
	}
	
}
