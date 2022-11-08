package z.Desafios_Treinos.Colecoes.Produto;

import java.util.Objects;

public class Produto {

	String nome;
	String descricao;
	int CodigoBarras;
	double preco;

	Produto() {

	}

	Produto(String nome, String descricao, int CodigoBarras, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.CodigoBarras = CodigoBarras;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CodigoBarras, descricao, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return CodigoBarras == other.CodigoBarras && Objects.equals(descricao, other.descricao)
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
}
