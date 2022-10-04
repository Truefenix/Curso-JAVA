package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
//		double[] [] notasAluno = new double[3][3];  Array 2 dimensões
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		String a = Arrays.toString(notasAlunoA); // Conv. de array p/ string	
		System.out.println(a);
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// .length - 1 por padrão ele acessa a ultima memória
		
		// Array no for
		double totalAlunoA = 0;
		for(int i = 0; i < 3; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA);
		
		// Outro tipo de iniciar array
		double teste = 3.3;
		double[] notasAlunoB = {5.5, teste, 8.8, 6.7};
		
		double totalAlunoB = 0;
		for(int i = 0; i < 3; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB);
	}
}
