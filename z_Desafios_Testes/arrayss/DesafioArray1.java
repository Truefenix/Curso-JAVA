package z_Desafios_Testes.arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos: ");
		int quantidadeAlunos = entrada.nextInt();
		
		double[] notas = new double[quantidadeAlunos];
		String[] nomes = new String[quantidadeAlunos];
		
		for(int a = 0; a <= quantidadeAlunos; a++) {
			System.out.print("\nQual o nome: ");
			nomes[a] += entrada.next();
			
			System.out.print("Qual a Nota do Aluno " + (a + 1) + ": ");
			notas[a] += entrada.nextDouble();
		}
		
		String nome = "";
		for(String nome1 : nomes) {
			nome += nome1;
		}
		
		System.out.println(Arrays.toString(notas));
		System.out.println(nome);
		
		entrada.close();
	}
}
