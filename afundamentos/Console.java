package afundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom ");//.print normal
		System.out.print("dia \n");// no console vai sair td na mesma linha
		
		//Saida de sistema com ln pula linha / print ln
		System.out.println("bom dia");
		
		//Saida de sistema formatado / print f
		System.out.printf("Mega Sena: %d %d %d \n", 1, 2, 3);//\n pula linha
		System.out.printf("Salario: %.1f \n", 1234.1234);//%= troca .1= deixa um centésimo f= float
		
		// Scanner = escanear / entrada = variavel / System.in = estrada de sistema
		/*Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: \n"); //saida para escrever nome
		String nome = entrada.nextLine(); //entrada da String nome 
		
		System.out.print("Digite seu Sobrenome: \n");
		String sobrenome = entrada.nextLine(); //nextLine é para escrever em String
		
		System.out.print("Digite sua idade: \n");
		int idade = entrada.nextInt(); //.nextIn é para escrever em int
		
		System.out.printf("\n%s %s tem %d anos.\n", //saida das variaveis = nome, sobrenome, idade
				nome, sobrenome, idade);
		
		entrada.close(); //fecha o Scanner entrada */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = teclado.nextLine();
		
		System.out.println("Qual o seu sobrenome? ");
		String sobrenome = teclado.nextLine();
		
		System.out.println("Qual a sua idade? ");
		int idade = teclado.nextInt();
		teclado.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		teclado.close();
	}
}
