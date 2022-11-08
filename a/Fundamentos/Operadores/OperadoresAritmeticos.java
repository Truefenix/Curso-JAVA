package a.Fundamentos.Operadores;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		// Operadores Aritméticos
		double a = 1.1;
		double b = 2.2;
		
		System.out.println(a + b); // Mais
		System.out.println(a - b); // Menos
		System.out.println(a * b); // Multiplicação
		System.out.println(a / b); // Divisão
		System.out.println(a / (int) b); // Divisão e Conversão (CAST) para int
		
		// Operador Módulo
		System.out.println(a % b); // % é o simbolo para operador de módulo
		System.out.println(1.1 % 2.2);
		System.out.println(1.1 % (double) 2.2); // também pode colocar conversão (CAST)
		
		// Precedência Aritmética / colocar ( ) para calcular antes
		System.out.println((a + b) / 3); // (a + b) antes e depois a / com 3
		System.out.println((1 + 1) * (a - b)); 
		System.out.println((1 + 1) * (double) (a - b)); 
		
		// Pôtencia / Math.pow(0, 0);
		int x = (3 * 4) - 10; // 2
		int s = (int)Math.pow(x, 3); // x = (2) elevado a 3
		
		System.out.println(s);
	}

}
