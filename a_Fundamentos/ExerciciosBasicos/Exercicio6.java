package a_Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		// Criar um programa que resolve equações de segundo grau
		
		// 1 parte
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva o Número o A: ");
		double a = entrada.nextDouble();
		System.out.print("Escreva o Número o B: ");
		double b = entrada.nextDouble();
		System.out.print("Escreva o Número o C: ");
		double c = entrada.nextDouble();
		
		// 2 parte Delta
		double delta1 = Math.pow(b, 2);
		double delta2 = a * c;
		double delta3 = delta2 * -4;
		double delta = delta1 + delta3;
		
		System.out.println("O Delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nO x2 da equação é: %.2f" ,x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		entrada.close();
		
	}

}
