package a_Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		// Crie um programa que leia uma valor e apresente os resultados
		// ao quadrado e ao cubo.
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.print("Escreva um valor ");
		double valor = scaner.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.println("\nElevado ao Quadrado é: " + quadrado);
		System.out.println("Elevado ao Cubo é: " + cubo);
		
		scaner.close();
	}
}
