package zDesafiosTreinos.Colecoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		// Aplicação onde repete o scaner e sai em lista
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		String senha = "";
		while(!senha.equals("-1")) {
			System.out.print("nome: ");
			
			senha = entrada.nextLine();
			lista.add(new Usuario(senha));
		}
		
		for(Usuario a: lista) {
			System.out.println(a.nome);
		}
		
		System.out.println("Você SAIU!!!");
		
		entrada.close();
	}
}
