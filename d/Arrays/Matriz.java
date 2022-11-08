package d.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de Alunos: ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Quantidade de Alunos: ");
		int quantidadeNotas = entrada.nextInt();
		
		double[][] notas = new double[quantidadeAlunos] [quantidadeNotas];
		
		double total = 0;
		for(int a = 0; a < notas.length; a++) {
			for(int n = 0; n < notas[a].length; n++) {
				System.out.printf("Informe a nota %d do Aluno %d: ", n + 1, a + 1);
				
				notas [a] [n] = entrada.nextDouble();
				total = notas [a] [n]; 
			}
		}
		
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("A media e: " + media);
		
		for(double[] nota: notas) {
			System.out.println(Arrays.toString(nota));
		}
		
		entrada.close();
	}
}
