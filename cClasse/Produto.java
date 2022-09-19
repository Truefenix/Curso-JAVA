package cClasse;

public class Produto {
	
	// criei um Tipo produto
	// Com 3 atributos do produto
	// nome, preço e desconto
	
	String Nome;
	double preco;
	double desconto;

	// Método 
	double precoDesconto () {
		return preco * (1 - desconto);
	}
}
