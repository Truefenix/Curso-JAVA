package bcontrole.While;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		// While indeterminado é quando eu paro de repetir até
		// que eu cumpro a função
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("saida")) {
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
