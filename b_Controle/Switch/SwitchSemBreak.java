package b_Controle.Switch;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("escreva uma cor: ");
		String cor = entrada.next().toLowerCase();
		
		switch(cor) {
		case "branco":
		System.out.println("cor branca");
		case "preto":
			System.out.println("cor preto");
		case "azul":
			System.out.println("cor azul");
		case "amarelo":
			System.out.println("cor amarelo");
		case "vermelho":
			System.out.println("cor vermelha");
		case "laranja":
			System.out.println("cor laranja");
			break;
		default:
			System.out.println("Só pode branco, preto, azul, amarelo, "
					+ " vermelho e laranja");
		}
		
		System.out.println("FIM");
		entrada.close();
		
		// teste switch
		int idade = 8;
		
		switch(idade) {
		case 1:
			System.out.println("idade 1");
			break;
		case 2:
			System.out.println("idade 2");
			break;
		case 3:
			System.out.println("idade 3");
			break;
		default:
			System.out.println("idade nenhuma");
			break;
		}
	}
}
