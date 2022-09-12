package bcontrole.For;

public class For3EscopoFOR {

	public static void main(String[] args) {
		
		// ESCOPO FOR
		
      /*as variáveis do FOR que estiverem fora
        do corpo for não funcionão
		
		for(int w = 0; w <= 10; w++) {
			System.out.println(w); // funciona
		}
		
		System.out.println(w); // Não funciona */
		
		// só pode usar uma variável que esteja ligado ao for se
		// ela já estiver fora do for e nunca dentro.
		
		int c = 0;
		for(;c <= 10; c++) {
			System.out.println(c);
		}
		
		System.out.println("\no int C do for recebeu: " + c);
		System.out.println("\n" + c);
	}
}
