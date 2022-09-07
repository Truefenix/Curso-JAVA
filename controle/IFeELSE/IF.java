package controle.IFeELSE;

import java.util.Locale;
import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		// Mudar o Locale do java
		Locale.setDefault(new Locale("en", "US"));

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a média: ");

		// Recebe em String os números
		String mediaString = entrada.next().replace(",", ".");

		// Converte String ára Número
		double media = Double.parseDouble(mediaString);

		if (media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		boolean teste = media < 7.0 && media >= 5.0;
		if (teste) {
			System.out.println("Recuperação");
		}

		entrada.close();
	}
}
