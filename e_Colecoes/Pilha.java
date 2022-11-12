package e_Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("livro 1");
		livros.push("livro 2");
		livros.push("livro 3");
		
		// saida de elementos
		System.out.println(livros.peek());
		System.out.println(livros.element() + "\n");
		
		// saida dos elementos conforme a sequência
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll()  + "\n");
		
		livros.push("livro 2");
		System.out.println(livros.remove("livro 2") + "\n");
		
		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
		
		livros.add("livro A");
		livros.push("livro B");
		livros.push("livro C");
		
		// Foreach da Pilha
		for(String livro: livros) {
			System.out.println(livro);
		}
	}
}
