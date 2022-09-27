package cClasse;

public class AreaCircteste {

	public static void main(String[] args) {
		
		// Construtor recebe paramêtro de entrada
		AreaCirc a = new AreaCirc(4.9);
		
		// Modificador de atributo static
//		AreaCirc.pi = 0;
		
		System.out.println(a.area());
		// saída da função (método) associado ao objeto.
		
		System.out.println(AreaCirc.pi);
		
		// saida do Método static
		System.out.println(AreaCirc.area(100));
	}
}
