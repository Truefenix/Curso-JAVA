package bcontrole.ExerciciosDeControle;

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
		int contador = 0;
		int divisor = 0;
		
		while(contador <= num1) {
			while(contador <= num1) {
				
				divisor = contador / contador;
			}
			
			contador++;
		}
		System.out.println(contador + "--" + num1);
		System.out.println(divisor);

		scanner.close();
	}
}
