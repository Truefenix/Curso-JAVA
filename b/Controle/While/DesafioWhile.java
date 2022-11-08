package b.Controle.While;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// Desafio de While
		// Desafio Calcular a Média Total de uma Turma.
		
		Scanner entrada = new Scanner(System.in);
	    
		double QuantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				QuantidadeNotas++;
			} else {
				System.out.println("Escreva Certo");
			}
		}
		
		double media = total / QuantidadeNotas;
		System.out.println("Você SAIU: " + media);
		
		entrada.close();
	}
}
