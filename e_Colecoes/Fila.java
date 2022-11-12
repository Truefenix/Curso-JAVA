package e_Colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Diferença é o comportamento ocorre
		// Quando a fila está cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança um exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento
		// da fila (sem remover)
		
		// Diferença é o comportamento ocorre
		// Quando a fila está vazia!
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança um exceção
		System.out.println(fila.element());
		
		// Poll e Remove -> obter o próximo elemento
		// da fila e remove
		
		// Diferença é o comportamento ocorre
		// Quando a fila está vazia!
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.poll());
		System.out.println(fila.remove("Carlos")); // removeu da lista o Carlos
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // null -> acabo a lista
		
		fila.clear();
		
		// fila.size(); -> tamanho da fila
		// fila.clear(); -> limpa toda a fila
		// fila.isEmpty(); -> Se a lista está cheia
		// fila.contains(); -> Se contém na fila
	}
}
