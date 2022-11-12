package f_OO.composicao.MUITOS_PRA_MUITOS;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	String nome;
	
	Curso(String curso) {
		this.nome = curso;
	}
	
	List<Aluno> alunos = new ArrayList<>();
	
	void adicionarAlunos(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
