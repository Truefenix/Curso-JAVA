package f_OO.composicao.MUITOS_PRA_MUITOS;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	
	Aluno(String nome) {
		this.nome = nome;
	}
	final List<Curso> cursos = new ArrayList<>();
	
	// relacionamento bilateral
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	public String toString() {
		return nome;
	}
	
	Curso procurarPoCurso(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
}
