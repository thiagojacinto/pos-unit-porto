package BancoPortoDigital;

import java.util.Scanner;

public class Conta {
	// Attributes 
	private String titularString;
	private int numero;
	private double saldo;

	// Methods
	
	// A example Constructor
	Conta(String nome, int n, double s) {
		this.setTitular(nome);
		setNumero(n);
		this.saldo = s;
	}
	
	// Empty Constructor
	Conta() {
	}
	
	void creditar(double credito) {
//		System.out.println("----- OPERAÇÃO DE CRÉDITO -----");
		this.saldo += credito;
		System.out.println("Conta núm.: " + getNumero());
		System.out.println("Crédito adicionado: R$ " + credito);
//		System.out.println("----- FIM DA OPERAÇÃO DE CRÉDITO -----");
	}

	void debitar(double debit) {
//		System.out.println("----- OPERAÇÃO DE DÉBITO -----");
		if (debit >= this.saldo) {
			System.err.println("Este saque é maior que seu saldo, a retirada vai entrar no cheque especial. Deseja proseguir?");
			System.err.println("Digite 0 par SIM, ou 1 para NAO.");
			Scanner inScanner = new Scanner(System.in);	// Allows user input
			int Response = inScanner.nextInt();
			if (Response == 0) {	// User input YES = 0
				this.saldo -= debit;
				System.out.println("Conta núm.: " + getNumero());
				System.out.println("Débito realizado: R$ " + debit);
			} else {				// User input NO = 1
				System.out.println("Operacao cancelada.");
			}
			inScanner.close();
		} else {
			this.saldo -= debit;
			System.out.println("Conta núm.: " + getNumero());
			System.out.println("Débito realizado: R$ " + debit);
		}
//		System.out.println("----- FIM DA OPERAÇÃO DE DÉBITO -----");
	}

	void transferir(double transf, Conta contaDestino) {
//		System.out.println("----- TRANSFERÊNCIA -----");
		if (this.saldo < transf) {
			System.err.println("Saldo insuficiante para transferir");
		} else {
			// The transfer debts from the origin
			this.debitar(transf);
			// And adds the value to the other account 
			contaDestino.creditar(transf);
			System.out.println("Transferencia de R$ " + transf + " para "+ contaDestino + " realizada.");
		}
//		System.out.println("----- FIM DA TRANSFERÊNCIA -----");
	}
	
	
	
	protected String getTitularString() {
		return titularString;
	}

	protected void setTitular(String titularString) {
		if (titularString.trim().isEmpty()) {
			System.out.println("Nome do Titular vazio. Incorreto, tente novamente.");
		}
		this.titularString = titularString;
	}

	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected double getSaldo() {
		return this.saldo;
	}

//	protected void setSaldo(double saldo) {
//		this.saldo = saldo;
//	}
}
