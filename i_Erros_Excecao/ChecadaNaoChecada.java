package i_Erros_Excecao;

public class ChecadaNaoChecada {

	// pode se colocar tbm o -> throws Exception no main.
	public static void main(String[] args) { 
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("--------------");
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nFim...");
	}
	// Exceção Não Checada ou Não Verficada.
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01...");
	}
	
	// Exceção Checada ou Verificada.
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02...");
	}
}
