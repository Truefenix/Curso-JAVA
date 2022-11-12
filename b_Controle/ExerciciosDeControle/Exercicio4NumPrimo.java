package b_Controle.ExerciciosDeControle;

import java.util.Scanner;

public class Exercicio4NumPrimo {

	public static void main(String[] args) {
		
		// Em teste a lógica, em andamento...
		
		/**
		 * 4. Criar um programa que receba um número e diga se ele é um número primo.
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Veja se o número é primo: ");
		int num1 = scanner.nextInt();
		int contador = 1;
		double divisor = 1;
		
		while(contador <= num1) {
			System.out.printf("%d / %d = %.2f\n", num1, contador, divisor);
		contador++;
		divisor += num1 / contador;
		}
		
		System.out.println(divisor);
		scanner.close();
	}
}
