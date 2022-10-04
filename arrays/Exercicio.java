package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
//		double[] [] notasAluno = new double[3][3];  Array 2 dimensões
		
		double[] notasAluno = new double[3];
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		
		String a = Arrays.toString(notasAluno);
		
		System.out.println(a);
	}
}
