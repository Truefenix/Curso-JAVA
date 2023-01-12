package g_Lambdas.InterfacesFuncionais;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		return nome + " tem o preco " + preco + " deconto de " + desconto;
	}
}
