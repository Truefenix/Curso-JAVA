package darrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int a = 0; a < quantidadeNotas; a++) {
			System.out.print("Informe a nota " + (a + 1) + ": ");
			notas[a] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double soma = 0;
		for(double nota1: notas) {
			soma += nota1;
		}
		
		double media = soma / notas.length;
		System.out.println("\na media é: " + media);
		
		
		entrada.close();
	}
}
