package h_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		// 1 forma
		Stream<String> langs = Stream.of("A ", "B ", "C\n");
		langs.forEach(print);
		
		// 2 forma
		String[] maisLangs = {"A ", "B ", "C\n"};
		Stream.of(maisLangs).forEach(print);
		
		// 3 forma
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print); // lê do 1 e para no 3.
		
		// 4 forma
		List<String> outrasLangs = Arrays.asList("A ", "B ", "C\n");
		outrasLangs.stream().forEach(print);
		
		// Stream Paralelo
		outrasLangs.parallelStream().forEach(print);
		
		// Gerar Stream Infinitamente
		// Stream.generate(() -> "a").forEach(print);
		
		// Stream.iterate(0, n -> n + 1).forEach(print);
	}
}