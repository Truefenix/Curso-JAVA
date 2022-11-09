package f.OO.composicao.MUITOS_PRA_MUITOS;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("a");
		Aluno aluno2 = new Aluno("b");
		Aluno aluno3 = new Aluno("c");
		
		Curso curso1 = new Curso("Curso1");
		Curso curso2 = new Curso("Curso2");
		Curso curso3 = new Curso("Curso3");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou Matriculado no curso " 
					+ curso1.nome + "...");
			System.out.println("e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		Curso procurar = aluno1.procurarPoCurso("curso3");
		
		if(procurar != null) {
			System.out.println(procurar.nome);
			System.out.println(procurar.alunos); // tem que ter toString
			System.out.println(procurar); // erro 
		}
	}
}
