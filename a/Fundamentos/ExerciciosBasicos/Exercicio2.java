package a.Fundamentos.ExerciciosBasicos;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		// Exercicio de Conversão de Fahrenheit para Célsius
		
		double num = 22;
		double far = (num - 32) / 9;
		int tc = 5;
		
		double resultado = far * tc;
		
		System.out.println("Fahrenheit " + num + " em Celsius é: " + resultado);
	}
}
