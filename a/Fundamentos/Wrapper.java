package a.Fundamentos;

import java.util.Scanner;

public class Wrapper {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		// Wrapper de Tipos primitivos
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 1000000L; // L no final de Literal se n da erro
		Float f = 123.456F; // F no final de wrapper Float
		Double d = 1234.5678; // Wrapper Double

		System.out.println(b.toString().replace("1", "AAA"));// transforma em "String" troca "1" para "AAA"
		System.out.println(s.equals(b)); // s igual a b ? false
		System.out.println(i); // Integer
		System.out.println(l); // Long
		System.out.println(f); // Float
		System.out.println(d); // Double
		
		// Wrapper char Character
		String c = "#";
		
		System.out.println(c.toString() + ("!!!"));

		// Wrapper Boolean
		Boolean bo = Boolean.parseBoolean("false");// parseBooLean= transforma String em Boolean

		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		System.out.println(bo.toString().replace("a", "AAA"));
		System.out.println(bo.toString().equalsIgnoreCase("false"));
		System.out.println(bo.toString().replace("f", "xxx").replace("s", "GGG"));

		// Scanner com Integer e Long
		Scanner entrada = new Scanner(System.in);

		System.out.println("Inteiro");
		Integer in = entrada.nextInt();

		System.out.println("Long");
		Long ln = entrada.nextLong();

		System.out.println(in * ln);

		entrada.close();
	}

}
