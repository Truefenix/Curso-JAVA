package a.Fundamentos.Operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a';

		// true porque "97" é igual a "A" um erro.
		System.out.println(a == b);

		// Operadores Relacionais.
		System.out.println(1 != 0); // != diferente.
		System.out.println(1 > 0); // > Maior.
		System.out.println(1 >= 0); // >= Maior e igual.
		System.out.println(1 < 0); // < Menor.
		System.out.println(1 <= 0); // <= Menor e igual.
		
		// 01- Exercicio de Lógica
		double valor = 5.0;
		boolean BomComportamento = true;
		boolean MaisQue = valor >= 7.0;
		boolean nota = BomComportamento && MaisQue;
		String resultado = nota ? "OK" : "Não";
		
		System.out.println("\n\nEle Tirou Nota \"Boa\"? " + resultado);
	}

}
