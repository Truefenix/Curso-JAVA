package f.OO.composicao.UM_PRA_MUITOS;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Item> lista = new ArrayList<>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.lista.add(item);
		item.compra = this;
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Item item: lista) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
