package zDesafiosTreinos.Colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class FilaCliente {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Bia 01:50 - 01");
		fila.add("Ana 01:50 - 02");
		fila.add("Lia 01:50 - 03");
		fila.add("Nea 01:50 - 04");
		fila.add("Lea 01:50 - 05");
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.contains("Bia"));
	}
}
