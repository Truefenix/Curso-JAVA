package b_Controle.ExerciciosDeControle;
import java.util.Scanner;

public class Exercicio2Ano {

	public static void main(String[] args) {
		
		// Criar um programa que informa se o ano atual é um ano Bissexto.
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
	}
}
