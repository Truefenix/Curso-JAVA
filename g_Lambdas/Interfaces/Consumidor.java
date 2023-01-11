package g_Lambdas.Interfaces;

import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir =
				p -> System.out.println(p.nome + "!!!");
				
		Produto p1 = new Produto("Caneta", 1.50, 0.15);
		imprimir.accept(p1);
	}
}
