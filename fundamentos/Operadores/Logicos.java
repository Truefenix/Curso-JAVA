package fundamentos.Operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		//tabela exemplos
		boolean teste1 = true;
		boolean teste2 = 1 > 2; // 1 maior que 2 == false
		
		System.out.println(teste1 && teste2); // false porque tem false.
		System.out.println(teste1 && !teste2); // true porque ! not false, fica dois true.
		System.out.println(teste1 || teste2); // true porque teste1 é true.
		System.out.println(!!teste1); // true porque tem dupla negação dando o mesmo valor.
		System.out.print("\n");
		
		// TABELA VERDADE E && (AND)
		System.out.println(true && true); // true / para dar true no E && tem que ter 2 true.
		System.out.println(true && false); // false
//		System.out.println(false && true); // false
//		System.out.println(false && false); // false
		System.out.print("\n");
		
		// TABELA VERDADE OU || (OR)
//		System.out.println(true || true); // true
//		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false / para dar false no OU || tem que ter 2 false.
		System.out.print("\n");
		
		// TABELA VERDADE OU EXCLUSIVO ^ (XOR)
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
		System.out.print("\n");
		
		// TABELA VERDADE NOT" Negação !
		System.out.println(!true); // false / ! da resultado ao contrario
		System.out.println(!false); // true
		System.out.print("\n");
		
		// TABELA VERDADE NOT" !! dupla Negação
		System.out.println(!!true); // true / !! da o mesmo valor
		System.out.println(!!false); // false
	}

}
