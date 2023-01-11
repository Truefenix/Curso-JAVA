package g_Lambdas.Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir =
				p -> System.out.println(p.nome + "!!!");
				
		Produto p1 = new Produto("Caneta", 1.50, 0.15);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 1.000, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.15);
		Produto p4 = new Produto("Borracha", 7.80, 0.15);
		Produto p5 = new Produto("Lapis", 4.39, 0.15);
		
		List<Produto> produtos = Arrays.asList(p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		System.out.println();
		
		produtos.forEach(p -> System.out.println(p.preco));
		System.out.println();
		
		produtos.forEach(System.out::println);
	}
}
