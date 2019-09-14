package introOO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class Aluno
		Aluno a1 = new Aluno();
		/*
		a1.nome = "Thiago";
		a1.matricula = 00001;
		a1.cpf = "010.101.010-10";
		*/
		//		-- Testing getters and setters
		a1.setCpf("010.101.010-10");
		//System.out.println(a1.getCpf());;
		a1.setMatricula(00001);
		//System.out.println(a1.getMatricula());
		a1.setNome("Thiago");
		//System.out.println(a1.getNome());
		System.out.println(a1.toString());
		
		// New Aluno
		Aluno a2 = new Aluno();
		a2.setCpf("010.999.010-09");
		a2.setMatricula(00002);
		a2.setNome("Carlos");
		System.out.println(a2.toString());
		
		// Class Turma
		//Aluno[] alunosT1 = {a1,a1};
		Turma t1Turma = new Turma();
		t1Turma.setDescricao("SPfW - 001");
		t1Turma.setIdentificador(2);
		//t1Turma.setAlunos(alunosT1);
		//System.out.println(t1Turma.getDescricao());
		System.out.println(t1Turma.toString());
		
//		//	Modified array[] to ArrayList:
//		t1Turma.alunos.add(a1);
//		t1Turma.alunos.add(a2);
//		t1Turma.getAlunos();
//		//ArrayList<Aluno> novosAlunos
//		System.out.println(t1Turma.toString());
		
		// Class Disciplina, removes 'alunos' from Turma
		Disciplina d1 = new Disciplina();
		d1.setDescriptionString("Laboratorio de Programacao 1");
		d1.setIdentifier(002);
		d1.setMaterialString("Livros e Videoaulas");
		d1.turmas.add(t1Turma);
		d1.alunos.add(a1);
		d1.alunos.add(a2);
		
		//System.out.println(d1.alunos.toString());
		
		// Class Professor
		Professor p1 = new Professor();
		p1.setNomeString("Romulo Cesar");
		p1.setCpfString("10.293.122-44");
		p1.setMatricula(001);
		p1.disciplinas.add(d1);
		
		d1.prof.add(p1); // add the p1 Professor to Discipline d1
		
		Professor p2 = new Professor();
		p2.setNomeString("Jorge");
		p2.setCpfString("10.222.555-67");
		p2.setMatricula(002);
		p2.disciplinas.add(d1);
		
		d1.prof.add(p2); // add the p2 Professor to Discipline d1
		
		// Get all 'alunos' from every 'discpline'
		for (int i = 0; i < d1.prof.size(); i++) {
			Professor pAux = d1.prof.get(i);
			//System.out.println("Prof = "+pAux);
			for (int j = 0; j < pAux.disciplinas.size(); j++) {
				System.out.println("Dados do Prof.: "+pAux.disciplinas.get(j).prof.get(j));
			}
		}
		
	}

}
