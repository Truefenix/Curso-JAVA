package c.Classe;

public class DesafioPrimeiroTrauma {
	
	// desafio trazer os atributos para o console 
	
	int a = 3; // não pode mexer aqui
	static int c = 5;

	public static void main(String[] args) {
		
		// só pode mexer no corpo main
		DesafioPrimeiroTrauma b = new DesafioPrimeiroTrauma();
		System.out.println(b.a);
		
		// valor static então não precisa de objeto
		System.out.println(c);
	}
}
