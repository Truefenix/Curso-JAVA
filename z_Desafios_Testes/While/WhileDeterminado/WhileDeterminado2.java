package z_Desafios_Testes.While.WhileDeterminado;

import java.util.Scanner;

public class WhileDeterminado2 {

	public static void main(String[] args) {
		
		// colocar um scanner que coloque um num entre 0 a 20 e comesse
		// a contar a partir desse número até 20
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Coloque um Número entre 0 a 20: ");
		int comesso = entrada.nextInt();
				
		while(comesso <= 20) {
			System.out.println(comesso);
			comesso +=1;
		}
				
		entrada.close();
	}
}
