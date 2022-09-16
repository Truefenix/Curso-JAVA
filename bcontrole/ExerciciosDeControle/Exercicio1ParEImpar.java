package bcontrole.ExerciciosDeControle;
import java.util.Scanner;

public class Exercicio1ParEImpar {

	public static void main(String[] args) {
		
		// Criar um programa que receba um número e verifique
		// se ele está entre 0 e 10 e é par.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva de 0 a 10: ");
		int num = entrada.nextInt();
		
		if(num <= 10 && num >= 0) {
			if(num % 2 == 1) {
				System.out.println(num + " é impar");
			} else {
				System.out.println(num + " é par");
			}
		} else {
			System.out.println("Escreva entre 0 e 10");
		}
		
		entrada.close();
	}
}
