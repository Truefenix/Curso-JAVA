package c_Classe.DesafioComida;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("OVO", 0.300);
		Comida c2 = new Comida("Carne", 5.0);
		
		Pessoa p1 = new Pessoa("Alvo", 98.8);
		
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
