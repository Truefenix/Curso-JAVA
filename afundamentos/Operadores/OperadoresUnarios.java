package afundamentos.Operadores;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		// Operadores Unários
		
		int a = 1;
		int b = 2;
		
		// Operadores PostFix
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		// Operadores Prefix
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a); // 1
		System.out.println(b); // 2
		
		// Tentar adivinhar oque vai sair no console abaixo.
		System.out.println("\nMini Desafio...?");
		System.out.println(++a == b--);
		
		// ++a vem antes por causa dos operadores antes do a.
		// --b vem depois por causa dos operadores depois do b.
	}

}
