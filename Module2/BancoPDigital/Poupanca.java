package BancoPortoDigital;

public class Poupanca extends Conta {
	// Already has the attributes of 'Conta' class

	// add a new and specific method:
	double renderJuros(int meses, double taxa) {
		double juros,montante = 0;

		// Formula: M = C * (1 + i)^t
		montante = this.getSaldo()*Math.pow((1 + taxa*0.01), meses/12);

		// Round montante value:
		montante = Math.round(montante);
		juros = montante - this.getSaldo();
		
		// When 'saldo' is private, 1st way:
//		double sald = this.getSaldo();
//		this.creditar(montante); 		// Add the montante to the user's account
//		this.debitar(sald);				// Remove the previous 'saldo' value
		
		// When 'saldo' is private, 2nd way:
		this.creditar(juros);
		
		// This works when 'saldo' is NOT private
//		this.setSaldo(montante);
		// Return the amount of interest in 'meses' time:
		return juros;
	}
}
