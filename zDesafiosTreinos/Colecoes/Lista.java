package zDesafiosTreinos.Colecoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// Aplicação onde repete o scaner e sai em lista

		Scanner entrada = new Scanner(System.in);

		ArrayList<Usuario> lista = new ArrayList<>();

		String senha = "";
		int conta = 0;
		while (!senha.equals("-1") || conta != -1) {

			System.out.print("Nome: ");
			senha = entrada.nextLine();
			
			System.out.print("Nota: ");
			conta = entrada.nextInt();

			if (senha.equals("-1")) { // retira da lista o -1
				continue;
			}
			if (conta != -1) {
				continue;
			}

			lista.add(new Usuario(senha, conta));
		}

		// Número separados da conta
		boolean menosVinte = conta <= 20;
		boolean menosQuarenta = conta > 20 && conta <= 40;
		boolean menosSessenta = conta > 40 && conta <= 60;
		boolean menosOitenta = conta > 60 && conta <= 80;
		boolean menosCem = conta > 80 && conta <= 100;

		for (Usuario a : lista) {
			System.out.println(a.nome);

			if (menosVinte) {
				System.out.println("Menos de Vinte, Horrivel");
			}
			if (menosQuarenta) {
				System.out.println("Menos de Quarenta, Péssimo");
			}
			if (menosSessenta) {
				System.out.println("Menos de Sessenta, Recuperação");
			}
			if (menosOitenta) {
				System.out.println("Menos de Oitenta, Passou");
			}
			if (menosCem) {
				System.out.println("Menos de Sessenta, Perfeito");
			}
		}

		System.out.println("Você SAIU!!!");

		entrada.close();
	}
}
