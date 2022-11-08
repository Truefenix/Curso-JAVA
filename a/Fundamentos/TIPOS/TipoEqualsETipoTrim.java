package a.Fundamentos.TIPOS;

import java.util.Scanner;

public class TipoEqualsETipoTrim {
	
	public static void main(String[] args) {
		// Comparação de igual entre String
		// Tem que usar .equals() / se usar == em string da erro demais
		// .trim(); tira os espaços em branco da String
		
		String s = new String("2");
		System.out.println("2" == s); // erro da false
		
		System.out.println("2".equals(s)); // true deu certo
		
		
		// No Scanner o mesmo teste
		Scanner entrada = new Scanner(System.in);
		
		// nextLine(); ele deixa com a linha em branco next(); retira as linha em branco da string
		String s2 = entrada.nextLine();
		System.out.println("2".equals(s2.trim())); // true modo certo de igualar
		// .trim(); retira as linha me branco tbm
		
		System.out.println("2" == s2); // false modo errado de igualar
		
		
		entrada.close();
	}

}
