package b.Controle;

public class BreakRotulado {

	public static void main(String[] args) {
		
		// Break Rotulado
		// Rótulo (externo:) para nomear um laço
		
		externo: for(int a = 0; a < 3 ; a++) {
			for(int b = 0; b < 3 ; b++) {
				
				if(a == 1) {
					break externo;
				}
				System.out.printf("[%d %d]", a, b);
			}
			System.out.println();
		}
		System.out.println("FIM");
	}
}
