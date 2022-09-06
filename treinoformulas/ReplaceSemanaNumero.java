package treinoformulas;

import java.util.Scanner;

public class ReplaceSemanaNumero {
	
	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.print("Escreva a Semana: ");
		String semana = scaner.next();
		String resultado = semana.toLowerCase()
				.replace("Domingo", "1")
				.replace("segunda", "2")
				.replace("terça", "3")
				.replace("quarta", "4")
				.replace("quinta", "5")
				.replace("sexta", "6")
				.replace("sabado", "7");
		
			System.out.println(resultado);
		
		System.out.println("\nFim");
		scaner.close();
	}
}
