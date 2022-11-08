package f.OO.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado()); // false
		
		c1.ligar();
		System.out.println(c1.estaLigado()); // true
		
		System.out.println(c1.motor.giros()); // c1 -> Carro -> motor -> giros()
		
		c1.desligar();
		System.out.println(c1.estaLigado());
	}
}
