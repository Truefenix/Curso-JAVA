package b_Controle.IFeELSE;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.print("Escreva sua Nota: ");
		
		Scanner entrada = new Scanner(System.in);		
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inválida");
		} else if (nota >= 8.0) {
			System.out.println("Conceito A");
		} else if (nota >= 6.0) {
			System.out.println("Conceito B");
		} else if (nota >= 4.0) {
			System.out.println("Conceito C");
		} else if (nota >= 2.0) {
			System.out.println("Conceito D");
		} else if (nota >= 0.1) {
			System.out.println("Conceito E");
		}
		
		entrada.close();
	}
}
