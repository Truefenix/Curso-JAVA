package z.Desafios_Treinos.Colecoes;

import java.util.Objects;

public class Usuario {

	String nome;
	int conta;
	
	Usuario(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
