package f_OO.composicao.DesafioOO;

public class ClienteTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Caneta", 2.5);
		Produto produto2 = new Produto("Caderno", 10.0);
		
		Compra compras = new Compra();
		System.out.println(compras.itens.toString());
	}
}
