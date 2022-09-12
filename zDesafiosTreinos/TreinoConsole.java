package zDesafiosTreinos;

import java.util.Scanner;

public class TreinoConsole {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Escreva seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Qual sua idade ? ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos de idade.", 
				nome, sobrenome, idade);
		entrada.close();
	}

}
