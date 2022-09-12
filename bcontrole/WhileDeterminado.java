package bcontrole;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		// While Determinado
		int contador = 1;
		
		// Enquanto (contador menor e igual a 10) { vai repetir }
		while (contador <= 10) {
			System.out.printf("i= %d\n", contador);
			
			// incremento contador +2 até 10.
			contador += 2;
		}
	}
}
