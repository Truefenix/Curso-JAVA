package i_Erros_Excecao;

import java.util.Objects;

public class Aluno {

	public final String nome;
	public final double nota;
	public final boolean comportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean comportamento) {
		this.nome = nome;
		this.nota = nota;
		this.comportamento = comportamento;
	}
	
	public String toString() {
		return nome + " nota de: " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comportamento, nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return comportamento == other.comportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
}
