package c.Classe.DesafioComida;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa() {
		
	}
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) { // criei uma var comida no tipo Comida
		if(comida != null) {
			this.peso += comida.peso; // chamei o atributo .peso pela var comida
		}
	}
	String apresentar() {
		String formatado = "Eu sou " + nome + " estou com " + peso + " KGs.";
		return formatado;
	}
}
