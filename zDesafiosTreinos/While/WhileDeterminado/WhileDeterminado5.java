package zDesafiosTreinos.While.WhileDeterminado;

import java.util.Scanner;

public class WhileDeterminado5 {
	
	public static void main(String[] args) {
		
		// Controlar o WhileDeterminado
		// número de começo, número de fim, número de repetidor e o oerador
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva o número de comeco: ");
		int comeco = entrada.nextInt();
		
		System.out.print("Escreva Repetir até: ");
		int fim = entrada.nextInt();
		
		System.out.print("Escreva o Repetidor: ");
		int repetidor = entrada.nextInt();
		
		System.out.print("Coloque a Operação: ");
		String operador = entrada.next();
		
		if(operador.equals("+")) {
			while(comeco <= fim) {
				System.out.println(comeco);
				comeco += repetidor;
			}
		} else if(operador.equals("-")) {
			while(comeco >= fim) {
				System.out.println(comeco);
				comeco -= repetidor;
			}
		} else if(operador.equals("*")) {
			while(comeco >= fim) {
				System.out.println(comeco);
				comeco *= repetidor;
			}
		} else if(operador.equals("/")) {
			while(comeco >= fim) {
				System.out.println(comeco);
				comeco /= repetidor;
			}
		} else {
			System.out.println("Escreva Certo");
		}
		entrada.close();
	}
}