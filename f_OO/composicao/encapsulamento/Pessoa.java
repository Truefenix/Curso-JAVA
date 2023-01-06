package f_OO.composicao.encapsulamento;

public class Pessoa {

	private int idade;
	
	// construtor que recebe na var private
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	// método que vísuliza em o private em outra classe
	public int lerIdade() {
		return idade;
	}
	
	// métodos que recebe a idade na var private
	public void alterarIdade(int idade) {
		this.idade = idade;
	}
}
