package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		/* Desafio do Curso - Scanner
		 * Pegar 3 String usando nextLine();
		 * e essas 3 String vão poder receber os 3 ultimos salarios de um funcionario
		 * e calcular a média dos ultimos 3 salarios de uma pessoa
		 * e pondendo escolher na entrada tanto virgula como ponto*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 pessoa - Coloque em numero seu ultimo salario");
		String um = entrada.nextLine().replace(",", ".");
		
		System.out.println("2 pessoa - Coloque em numero seu ultimo salario");
		String dois = entrada.nextLine().replace(",", ".");
		
		System.out.println("3 pessoa - Coloque em numero seu ultimo salario");
		String tres = entrada.nextLine().replace(",", ".");
		
		double uum = Double.parseDouble(um);
		double ddois = Double.parseDouble(dois);
		double ttres = Double.parseDouble(tres);
		
		double soma = uum + ddois + ttres;
		double media = (uum + ddois + ttres) / 3;
		
		System.out.println("\nO Ultimo Salario da 1 pessoa e: " + um);
		System.out.println("O Ultimo Salario da 2 pessoa e: " + dois);
		System.out.println("O Ultimo Salario da 3 pessoa e: " + tres);
		
		System.out.printf("\nA soma entre as Pessoas 1 2 3 e: %.1f", soma);
		System.out.printf("\nA media entre as Pessoas 1 2 3 e: %.1f", media);
		
		entrada.close();
	}

}
