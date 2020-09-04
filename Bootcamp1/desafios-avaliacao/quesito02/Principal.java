package quesito02;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import quesito01.Almanaque;
import quesito01.Livro;
import quesito01.Pessoa;

public class Principal {
	
	public static void main(String[] args) {
		
		// Item A
		Pessoa pessoa1 = new Pessoa("Clara Lima", 25, "F");
		Pessoa pessoa2 = new Pessoa("Djonga", 27, "M");
		
		// Item B
		Livro livro1 = new Livro("Encarceramento em massa", "Juliana Borges", 144);
		associarLivroALeitor(pessoa1, livro1);
		Livro livro2 = new Livro("Este livro não vai te deixar rico", "Startup da Real", 240);
		associarLivroALeitor(pessoa1, livro2);
		Livro livro3 = new Livro("Rastros de resistência", "Ale Santos", 136);
		associarLivroALeitor(pessoa2, livro3);
		
		// Item C
		Almanaque almanaque1 = new Almanaque("Guerra Civil II", "Mark Millar", 238);
		associarLivroALeitor(pessoa1, almanaque1);
		Almanaque almanaque2 = new Almanaque("Astronauta. Singularidade", "Danilo Beyruth", 80);
		associarLivroALeitor(pessoa2, almanaque2);
		
		// Item D
		StringBuilder itemD = new StringBuilder();
		itemD
			.append("\n > Item D \n")
			.append(livro1.detalhes())
			.append("\n")
			.append(livro2.detalhes())
			.append("\n")
			.append(livro3.detalhes())
			.append("\n")
			.append(almanaque1.detalhes())
			.append("\n")
			.append(almanaque2.detalhes());
		System.out.println(itemD.toString());
		
		// Item E
		System.out.println("\n > Item E");
		List<Livro> publicacoes = Arrays.asList(livro1, livro2, livro3, almanaque1, almanaque2);
		
		for (Livro livro : publicacoes) {
			
			Integer random1 = new Random().nextInt(100) + 15;
			Integer random2 = new Random().nextInt(6) + 3;
			
			Integer div = random1 / random2 ;
			
			if (!livro.isAberto()) {
				livro.abrir();
			}
			
			for (int i = 0; i < 2*div; i++) {
				
				if (livro instanceof Almanaque) {
					((Almanaque) livro).avancarPagina();
				} else {
					
					livro.avancarPagina();
				}
			}
			
			if (livro instanceof Almanaque) {
				((Almanaque) livro).folhear(random1);
			} else {
				
				livro.folhear(random1);
			}
			
			
			for (int i = 0; i < div; i++) {
				livro.voltarPagina();
			}
			
			if (div % 2 == 0) {
				livro.fechar();
			}
		}
		
		
		// Item F
		StringBuilder itemF = new StringBuilder();
		itemF
			.append("\n > Item F \n")
			.append(livro1.detalhes())
			.append("\n")
			.append(livro2.detalhes())
			.append("\n")
			.append(livro3.detalhes())
			.append("\n")
			.append(almanaque1.detalhes())
			.append("\n")
			.append(almanaque2.detalhes());
		System.out.println(itemF.toString());
	}

	/** Associa um livro a um leitor.
	 * @param Pessoa 
	 * @param Livro
	 */
	private static void associarLivroALeitor(Pessoa leitor, Livro livro) {
		try {
			livro.setLeitor(leitor);
			
			leitor.getLivros().add(livro);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
