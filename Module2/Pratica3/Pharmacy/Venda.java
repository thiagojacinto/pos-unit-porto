package PharmacyStore;

public class Venda {
	float valor;
	int nfe;

	Funcionario funcionario;
	Cliente cliente;
	Produto produto;
	

	@Override
	public String toString() {
		return String.format("Venda [valor=%s, nfe=%s, funcionario=%s, cliente=%s, produto=%s]", valor, nfe,
				funcionario, cliente, produto);
	}
	
}

