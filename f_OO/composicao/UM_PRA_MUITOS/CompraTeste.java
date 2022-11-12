package f_OO.composicao.UM_PRA_MUITOS;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Ana";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.lista.add(new Item("Borracha", 12, 3.89));
		compra1.lista.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.lista.size() + " COMPRAS");
		
		System.out.println("Valor total é: " + compra1.valorTotal());
	}
}
