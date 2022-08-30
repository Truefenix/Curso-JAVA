package fundamentos.Operadores;

public class DesafioLogico {	
	public static void main(String[] args) {
		// Desafio de Operadores Lógicos
		// Trabalho na Terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		/*
		 * 1 cenário - Conseguiu 2 Trabalho;
		 * 2 cenário - Conseguiu 1 Trabalho;
		 * 3 cenário - Conseguiu 0 Trabalho;
		 */
		
		// Cenario 01 "Conseguiu 2 Trabalho" = TV50
		boolean trabalho1 = true;
		boolean trabalho2 = false;		
		boolean cenario1 = trabalho1 && trabalho2; // false = porque "&&" só da true quando tem todos true
		
		System.out.println("Comprou a \"TV50\"? = " + cenario1);
		
		// Cenario 02 "Conseguiu 1 Trabalho" = TV32
		boolean trabalho01 = true;
		boolean trabalho02 = false;
		boolean cenario2 = trabalho01 || trabalho02; // true = porque "OU" só tem que ter 1 true
		
		System.out.println("\nComprou \"TV32\"? " + cenario2);
		
		// Cenario 03 "Comprou sorvete se Conseguiu 2 ou 1 trabalho?
		boolean trabalho001 = true;
		boolean trabalho002 = false;
		boolean cenario3 = trabalho001 ^ trabalho002; // true = porque XOR só da true quando tem TRUE e FALSE.
		
		System.out.println("\nComprou \"Sorvete\"? " + cenario3);
		
		// Cenario 04 "Não Conseguiu nenhum Emprego"
		boolean trabalho0001 = false;
		boolean trabalho0002 = false;
		boolean cenario4 = !trabalho0001 || !trabalho0002; // TRUE porque tem 2 Negação false no OU
		
		System.out.println("\nNão Conseguiu nenhum Emprego " + cenario4);
	}
}
