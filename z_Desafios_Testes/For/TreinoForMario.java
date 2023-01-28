package z_Desafios_Testes.For;

import java.util.Scanner;

public class TreinoForMario {

	public static void main(String[] args) {
		
		// criar uma piramide conform solicitado
		// a altura
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva a altura: ");
		int altura = entrada.nextInt();
		int comeco = 1;
		int espaco = comeco;
		int chaar = 1;
		
			for(; comeco <= altura; comeco += 1) {
				for (; espaco < comeco; espaco += 1) {
					System.out.print(" ");
				}
				for (;chaar <= altura; chaar += 1) {
					System.out.print("#");
				}
				
				System.out.println("\n");
			}
			
		
		entrada.close();
	}
}


/*for(int comeco = 0; comeco <= altura; comeco++) {
	System.out.println("#");
}*/