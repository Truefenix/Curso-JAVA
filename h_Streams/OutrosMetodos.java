package h_Streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Luna", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		// tem que ter equals e hashcode na classe Alunos para o distinct funcionar.
		
		System.out.println("distinct..."); // retira os que são iguais
		alunos.stream().distinct().forEach(System.out::println);
		System.out.println();
		
		System.out.println("skip/limit...");
		alunos.stream()
				.distinct()
				.skip(2)
				.limit(2)
				.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("takeWhile..");
		alunos.stream()
				.distinct()
				.skip(2)
				.limit(2)
				.forEach(System.out::println);
	}
}
