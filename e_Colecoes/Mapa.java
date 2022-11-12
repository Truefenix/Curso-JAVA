package e_Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "Valor 0"); // colocar valor e chave.
		usuarios.put(1, "Valor 1"); // substitui por ser da mesma chave.
		usuarios.put(2, "Valor 2");
		usuarios.put(3, "Valor 3");

		System.out.println(usuarios.size()); // tamanho
		System.out.println(usuarios.isEmpty() + "\n");

		System.out.println(usuarios.keySet()); // todas as chaves
		System.out.println(usuarios.values()); // todos os valores
		System.out.println(usuarios.entrySet() + "\n"); // todas as chaves e valores

		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Valor 3") + "\n");

		System.out.println(usuarios.get(2) + "\n"); // pega a chave e retorna o valor

		// Foreach para percorrer só a chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// Foreach para percorre só os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		// Foreach para percorrer juntos as chaves e valores
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
		
		for(Object usuario: usuarios.entrySet()) {
			System.out.println(usuario);
		}
		
	}
}
