package a.Fundamentos.Conversao;

public class ConversaoEntreOsTipoPrimitivoNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // Implicita
		System.out.println(a + "\n");
		
		float r = (float) 123.456; // Explicita
		System.out.println(r);
		
		// (CAST) Conversão Explicita
		int b = 5;
		byte c = (byte) b;
		System.out.println(c + "\n");
		
		double d = 3.99999; //Double para int ocorre perda de dados
		int e = (int) d;
		System.out.println(e + "\n");
	}

}
