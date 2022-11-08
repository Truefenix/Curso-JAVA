package b.Controle;

public class ContinueRotulado {

	public static void main(String[] args) {
		
		// Continue Rotulado
		
		externo: for(int a = 0; a < 3 ; a++) {
			for(int b = 0; b < 3 ; b++) {
				
				if(a == 1) {
					continue externo;
				}
				System.out.printf("[%d %d]", a, b);
			}
			System.out.println();
		}
		System.out.println("FIM");
	}
}
