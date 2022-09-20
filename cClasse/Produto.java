package cClasse;

public class Produto { // Tipo Produto
	
	// 3 atributos do produto
	String nome;
	double preco;
	double desconto;
	
	// Construtor Padrão
	Produto () {
		// No objeto recebe nenhum parâmetro
	}
	
	// Construtor EXPLICITO
	Produto (String nomeInicial, double precoInicial, // 3 parâmetro de entrada
			double descontoInicial) {
		nome = nomeInicial; // 3 paramêtro que vão ser recebidos no objeto.
		preco = precoInicial;
		desconto = descontoInicial;
	}

	// Método sem parâmetro de entrada e retorna um double
	double precoDesconto () {
		return preco * (1 - desconto);
	}
	
	// Método que recebe um parâmetro de entrada
	double precoDesconto (double descontoGerente) {
		return preco * (1 - (desconto + descontoGerente));
	}
}
