package b.Controle;

public class Continue {

	public static void main(String[] args) {
		
		// Continue; ao contrário do brek; ele só quebra a parte referida a ele
		
		for(int a = 0; a < 10; a++) {
			
			if(a % 2 == 1) { // se a for impar
				continue;   // então continue; pulando os impar.
			}
			System.out.println(a);
		}
		
		// OUTRO EXEMPLO DE CONTINUE
		for(int a = 0; a <= 10; a++) {
			
			if(a == 5) { // se a for igual a 5
				continue;// pule o 5
			}
			System.out.printf("\n%d", a);
		}
	}
}
