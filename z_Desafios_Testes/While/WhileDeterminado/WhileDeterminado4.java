package z_Desafios_Testes.While.WhileDeterminado;

import java.util.Scanner;

public class WhileDeterminado4 {
	
	public static void main(String[] args) {
		
		// Controlar o whileDetermiado (Repetidor determinado) nos valores.
		// número de comesso.
		// número final, para repetir até.
		// e número de repetidor em soma.
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva o número de comesso: ");
		int comesso = entrada.nextInt();
		
		System.out.print("Escreva Repetir até: ");
		int fim = entrada.nextInt();
		
		System.out.print("Escrever o Repetidor: ");
		int repetidor = entrada.nextInt();
		
		while(comesso <= fim) {
			System.out.println(comesso);
			comesso += repetidor;
		}
		entrada.close();
	}
}
