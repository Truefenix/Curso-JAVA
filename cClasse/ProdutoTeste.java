package cClasse;
// não precisa colocar import do produto pq está no mesmo pacote

public class ProdutoTeste {

	public static void main(String[] args) {
		
	//  Tipo Produto p1 recebe construtor explicito Produto(3 paramêtros);
		Produto p1 = new Produto("Nootbook", 4356.89, 0.25);
		
		var p2 = new Produto(); // Construtor Padrão
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.precoDesconto());
		System.out.println(p2.precoDesconto(0.1));
		// no parâmetro (0.1) do Método precoDesconto
		// o java entende que é o atributo descontoGerente
	}
}
