package e.Colecoes;
import java.util.HashSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		HashSet<String> lista = new HashSet<>();
		lista.add("Carla");
		lista.add("Eduardo");
		lista.add("Pedro");
		
		for(String comportado: lista) {
			System.out.println(comportado);
		}
	}
}
