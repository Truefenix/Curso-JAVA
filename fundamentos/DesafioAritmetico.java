package fundamentos;

public class DesafioAritmetico {

	public static void main(String[] args) {

		// Desafio de Operadores Aritméticos

		// 1- Parte
		double parteUM = (3 + 2) * 6;
		double ptum = Math.pow(parteUM, 2);
		int divum = 3 * 2;

		// 2- Parte
		int partedois = (1 - 5) * (2 - 7);
		int divdois = partedois / 2;
		double ptdois = Math.pow(divdois, 2);

		// Divisão
		double divparteum = ptum / divum;

		// 3- Parte
		double dividir = divparteum - ptdois;

		// 4- Parte
		double x = dividir / 10;
		int a = (int) Math.pow(x, 3);

		System.out.println(a);
	}

}
