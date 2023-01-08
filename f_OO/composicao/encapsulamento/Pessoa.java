package f_OO.composicao.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	// construtor que recebe na var private
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int idade) {
		
		idade = Math.abs(idade); // abs -> transforma tudo em positivo
		
		if(idade >= 0 && idade <= 120) {
			this.idade = idade;
		}
	}
	
	@Override
	public String toString() {
		
		return "Olá eu sou a " + getNome() 
			+ " e tenho " + getIdade() + " anos de idade";
	}
}
