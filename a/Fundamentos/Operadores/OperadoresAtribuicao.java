package a.Fundamentos.Operadores;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		// Operadores de Atribuição
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;  Operador Aditivo
		c -= a; // c = c - a;  Operador Subtrativo
		c *= b; // c = c * b;  Operador Multiplicativo
		c /= a; // c = c / a;  Operador Divisivo
		
		System.out.println(c);
		
		// Operador Modular.
	    // Para saber se o Operador é par ou Impar por 0 ou 1.
		
		c %= a; // c = c % a;  Operador Modular
		
		System.out.println(c);
	}

}
