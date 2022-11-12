package b_Controle.IFeELSE;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Desafio - Usuário escrever a semana.
		// e retornar em if/else o número associado.
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.print("Escreva a semana: ");
		String semana = scaner.next();
		
		if (semana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (semana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (semana.equalsIgnoreCase("terça") 
				|| semana.equalsIgnoreCase("terca")) {
			System.out.println("3");
		} else if (semana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (semana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (semana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (semana.equalsIgnoreCase("sabádo") 
				|| semana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("ERROR, ESCREVA DIA DE SEMANA");
		}
		System.out.println("\nFIM");
		
		scaner.close();
	}
}
