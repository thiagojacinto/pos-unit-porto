package ProfMain;

public class Main {

	public static void main(String[] args) {
		

		Aluno a1 = new Aluno();
		a1.nome = "Elton";
		a1.matricula = 001;
		a1.cpf = "111.444.555-11";
		
		Aluno a2 = new Aluno();
		a2.nome = "Stella";
		a2.matricula = 2;
		a2.cpf = "222.222.222-22";
		
		Disciplina d1 = new Disciplina();
		d1.adicionarAluno(a1);
		d1.adicionarAluno(a2);
		d1.nome = "Programacao 1";
		
		Disciplina d2 = new Disciplina();
		d2.nome = "Programacao 2";
		d2.adicionarAluno(a1);
		d2.adicionarAluno(a2);
		
		Turma t1 = new Turma();
		t1.identificador = 001;
		t1.descricao = "SPW - 001";
		
        t1.disciplinas.add(d1);
        t1.disciplinas.add(d2);
        
	    
        for(int i=0; i < t1.disciplinas.size() ; i=i+1) {
        	Disciplina dAux = t1.disciplinas.get(i);
        	
        	System.out.println("Disciplina = " + dAux.nome);
        	
        	for(int j=0 ; j < dAux.qtdAlunos(); j=j+1) {
            	System.out.println("Nome Aluno = " + dAux.pegarAluno(j).nome);
        	}
        	
        	System.out.println("-----------");
        }
        
        
        

	
	}
	
	

}
