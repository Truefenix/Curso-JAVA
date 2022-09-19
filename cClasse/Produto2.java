package cClasse;
// não precisa colocar import do produto pq está no mesmo pacote

public class Produto2 {

	public static void main(String[] args) {
		
		Produto1 p1 = new Produto1();
		// Tipo Produto nome da var p1
		// construtor new instância um objeto que é Prpduto1();	
		p1.Nome = "Nootbook"; // dar valor aos atributos do objeto p1 tipo Produto1
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		
		
		// criar uma var para instânciar outro objeto com os mesmos atributos
		// assim como uma casa o tipo Produto1 é o molde, e
		// com o molde eu posso criar quantos objetos eu quiser (Instâncias).
		var p2 = new Produto1();
		p2.Nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.Nome);
		System.out.println(p2.Nome);
	}
}
