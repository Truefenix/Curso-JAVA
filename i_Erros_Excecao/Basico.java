package i_Erros_Excecao;

public class Basico {

	public static void main(String[] args) {
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("não pode dividir por 0");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {	
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		// Erro Silenciado
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {	
			// não mostra nada
		}
	}
}
