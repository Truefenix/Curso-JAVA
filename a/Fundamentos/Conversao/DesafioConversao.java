package a.Fundamentos.Conversao;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		/*
		 * Desafio do Curso - Scanner Pegar 3 String usando nextLine(); e essas 3 String
		 * vão poder receber os 3 ultimos salarios de um funcionario e calcular a média
		 * dos ultimos 3 salarios de uma pessoa e pondendo escolher na entrada tanto
		 * virgula como ponto
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.print("1 pessoa - Coloque em número seu ultimo salário");
		String um = entrada.nextLine().replace(",", ".");

		System.out.print("2 pessoa - Coloque em número seu ultimo salário");
		String dois = entrada.nextLine().replace(",", ".");

		System.out.print("3 pessoa - Coloque em número seu ultimo salário");
		String tres = entrada.nextLine().replace(",", ".");

		double uum = Double.parseDouble(um);
		double ddois = Double.parseDouble(dois);
		double ttres = Double.parseDouble(tres);

		double soma = uum + ddois + ttres;
		double media = (uum + ddois + ttres) / 3;

		System.out.println("\nO Último Salário da 1 pessoa é: " + um);
		System.out.println("O Último Salário da 2 pessoa é: " + dois);
		System.out.println("O Último Salário da 3 pessoa é: " + tres);

		System.out.printf("\nA soma entre as pessoas 1 2 3 é: %.1f", soma, " reais");
		System.out.printf("\nA média entre as pessoas 1 2 3 é: %.1f", media, " reais");

		entrada.close();
	}

}