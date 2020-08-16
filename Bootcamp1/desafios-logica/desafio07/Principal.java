package desafio07;

public class Principal {

	public static void main(String[] args) {
		
		Desafio07 desafio07 = new Desafio07();
		
		int[] exemplo = new int[2];
		exemplo[0] = 1;
		exemplo[1] = 6;
		desafio07.exibirResultadoCalculoComposto(exemplo);
		
		exemplo[0] = 1;
		exemplo[1] = 10;
		desafio07.exibirResultadoCalculoComposto(exemplo);

		exemplo[0] = 1;
		exemplo[1] = 50;
		desafio07.exibirResultadoCalculoComposto(exemplo);

	}

}
