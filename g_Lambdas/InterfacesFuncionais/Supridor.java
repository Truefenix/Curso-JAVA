package g_Lambdas.InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supridor {

	public static void main(String[] args) {
		
		// ele só fornece algo
		Supplier<List<String>> umLista =
				() -> Arrays.asList("A", "B", "C");
				
		System.out.println(umLista.get());
	}
}
