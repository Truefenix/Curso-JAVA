package z_Desafios_Testes.Colecoes.Produto;
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<>();
		
		// Colocar Abaixo Produtos na Lista.
		// nome, descrição, Código de Barras e preço.
		
		lista.add(new Produto("Arroz", "Comida", 124567, 8.00));
		lista.add(new Produto("Feijão", "Comida", 124569, 10.00));
		
		for(Produto produtos: lista) {
			System.out.printf("Nome: %s \nTipo: %s \nPreço: %f$  \nCódigo de Barras: %d\n\n", produtos.nome, 
					produtos.descricao, produtos.preco, produtos.CodigoBarras);
		}
	}
}
