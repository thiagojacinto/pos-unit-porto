package bancoPortoDIgital;



public class Conta {
	// Attributes 
	private String titularString;
	private int numero;
	private double saldo;
	
	// Methods
	void creditar(double credito) {
		this.saldo += credito;
		System.out.println("Crédito adicionado: R$ " + credito);
	}
	
	void debitar(double debit) {
		this.saldo -= debit;
		System.out.println("Débito realizado: R$ " + debit);
	}
	
	void transferir(double transf, Conta contaDestino) {
		if (this.saldo < transf) {
			System.err.println("Saldo insuficiante para transferir");
		} else {
			// The transfer debts from the origin
			this.debitar(transf);
			// And adds the value to the other account 
			contaDestino.creditar(transf);
			System.out.println("Transferencia de R$ " + transf + " para "+ contaDestino + " realizada.");
		}
	}

	protected String getTitularString() {
		return titularString;
	}

//	protected void setTitularString(String titularString) {
//		this.titularString = titularString;
//	}

	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected double getSaldo() {
		return this.saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
