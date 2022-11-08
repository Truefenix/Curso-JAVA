package z.Desafios_Treinos.Colecoes.PilhaLivro;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("livros 1");
		livros.push("livros 2");
		livros.push("livros 3");
		
		System.out.println(livros.contains("livros 1"));
		System.out.println(livros.remove("livros 3"));
		System.out.println(livros.poll());
	}
}
