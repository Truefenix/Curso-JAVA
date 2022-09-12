package zDesafiosTreinos.While;

import java.util.Scanner;

public class WhileIndeterminado1 {
	
	public static void main(String[] args) {
		
		// While Indeterminado  é quando repete até que
		// um objetivo é completo.
		
		Scanner entrada = new Scanner(System.in);
		
		String fim = "";
		
		while(!fim.equalsIgnoreCase("SAIDA")) {
			System.out.print("escreva: ");
			
			fim = entrada.nextLine();
		}
		
		entrada.close();
	}

}
