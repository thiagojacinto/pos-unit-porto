package desafio12;

public class Teste {
	public static void main(String[] args) {
		
		System.out.println(">>>>> Testando Radio relógio... \n");
		
		RadioRelogio radioRelogio = new RadioRelogio();
		radioRelogio.ajustarAlarme();
		radioRelogio.ajustarHora();
		radioRelogio.mudarEstacao();
		radioRelogio.tocar();
		
		System.out.println(">>>>> Fim do teste do Radio relógio... \n");
		System.out.println(">>>>> Testando implementação do relógio... \n");
		
		RelogioImpl relogio = new RelogioImpl();
		relogio.ajustarAlarme();
		relogio.ajustarHora();
		System.out.println(">>>>> Fim do teste da implem. relógio... \n");
		
		System.out.println(">>>>> Testando o relógio de pulso... \n");
		RelogioPulso relogioPulso = new RelogioPulso();
		relogioPulso.ajustarAlarme();
		relogioPulso.ajustarHora();
		System.out.println(">>>>> Fim do teste do relógio de pulso... \n");
	}
}
