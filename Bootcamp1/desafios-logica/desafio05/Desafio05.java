package desafio05;

public class Desafio05 {
	
	/**
	 * Dado um {@code int} numero, o valor da sequencia de Fibonacci
	 * @param numero
	 * @return
	 */
	public int fibonacci(int numero) {
		
		if (numero < 2) {
			return 1;
		}
		
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
	
	/**
	 * Exibe no console a sequencia do numero de Fibonacci
	 * @param numero
	 */
	public void exibirSequenciaFibonacci(int numero) {
		for (int i = 0; i < numero; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
