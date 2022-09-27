package cClasse;
// não precisa colocar import do produto pq está no mesmo pacote

public class ProdutoTeste {

	public static void main(String[] args) {
		
	//  Tipo Produto p1 recebe construtor explicito Produto(3 paramêtros);
		Produto p1 = new Produto("Nootbook", 4356.89);
		
		var p2 = new Produto(); // Construtor Padrão
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50; // modificado do atributo static
		
		System.out.println(p1.nome + " " + p1.precoDesconto());
		System.out.println(p2.nome + " " + p2.precoDesconto());
		
		double precofinal1 = p1.precoDesconto();
		double precofinal2 = p2.precoDesconto(0.1);
		double precomedia = (precofinal1 + precofinal2) / 2;
		
		System.out.printf("\nMedia do Carrinho = Rs%.2f", precomedia);
	}
}
