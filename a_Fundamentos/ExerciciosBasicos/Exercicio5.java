package a_Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		// Crie um programa que leia o valor da base e da altura de um
		// triângulo e calcule a área.
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.print("Escreva a Altura do Triângulo: ");
		String base1 = scaner.nextLine().trim();
		double base = Double.parseDouble(base1);
		
		System.out.print("Escreva a Base do Triângulo: ");
		String altura1 = scaner.nextLine().trim();
		double altura = Double.parseDouble(altura1);
		
		double area = (base * altura) / 2;
		
		System.out.printf("\nA área do Triângulo é: %.2f", area);
		
		scaner.close();
	}
}
