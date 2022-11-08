package b.Controle.While;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Escreva a Palavra Certa");
			System.out.print("Quer sair? ");
			
			texto = entrada.next();
		} while(!texto.equalsIgnoreCase("sim"));
		
		System.out.println("Você Saiu Parabéns!!!");

		entrada.close();
	}
}
