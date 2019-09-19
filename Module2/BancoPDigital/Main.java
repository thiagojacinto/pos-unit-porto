package bancoPortoDIgital;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta thiagoConta = new Conta();
		Poupanca thiagoPoupanca = new Poupanca();
		int meses = 360;
		double taxa = 5.5;
		
		// Formatting double with 02 decimals:
		DecimalFormat dFormat = new DecimalFormat("#.##");
		
		// Testing 'Conta' class:
		System.out.println("---- Conta bancária ----");
		thiagoConta.setNumero(413701);
		thiagoConta.setSaldo(250.45);
		
		thiagoConta.creditar(55.89);
		thiagoConta.debitar(89.65);
		System.out.println("Saldo = R$ " + dFormat.format(thiagoConta.getSaldo()));
		
		// Testing 'Poupanca' class:
		System.out.println("---- Poupança ----");
		thiagoPoupanca.setNumero(102398);
		thiagoPoupanca.setSaldo(1000);
		
		System.out.println("Saldo Poupança antes dos juros = R$ " + dFormat.format(thiagoPoupanca.getSaldo()));
		System.out.println("Juros no periodo = R$ " + dFormat.format(thiagoPoupanca.renderJuros(meses,taxa)));
		System.out.println("Saldo Poupança após os juros de " + meses + " meses = R$ " + dFormat.format(thiagoPoupanca.getSaldo()));
		
		// Testing transferring within accounts:
		System.out.println("---- Transferencia ----");
		thiagoConta.transferir(189.25, thiagoPoupanca);
		System.out.println("Saldo da " + thiagoConta + "= R$ " + dFormat.format(thiagoConta.getSaldo()));
		System.out.println("Saldo da " + thiagoPoupanca + " = R$ " + dFormat.format(thiagoPoupanca.getSaldo()));
		thiagoPoupanca.transferir(550.67, thiagoConta);
		System.out.println("Saldo da " + thiagoConta + "= R$ " + dFormat.format(thiagoConta.getSaldo()));
		System.out.println("Saldo da " + thiagoPoupanca + " = R$ " + dFormat.format(thiagoPoupanca.getSaldo()));
	}

}
