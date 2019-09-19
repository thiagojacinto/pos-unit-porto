package bancoPortoDIgital;

public class Poupanca extends Conta{
	// Already has the attributes of 'Conta' class
	
	// add a new and specific method:
	double renderJuros(int meses, double taxa) {
		double juros,montante = 0;
		
		// Formula: M = C * (1 + i)^t
		montante = this.getSaldo()*Math.pow((1 + taxa*0.01), meses/12);
		
		// Round montante value:
		montante = Math.round(montante);
		juros = montante - this.getSaldo();
		
		this.setSaldo(montante);
		// Return the amount of interest in 'meses' time:
		return juros;
	}
	
	
}
