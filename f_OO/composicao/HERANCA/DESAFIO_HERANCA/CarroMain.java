package f_OO.composicao.HERANCA.DESAFIO_HERANCA;

public class CarroMain {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		civic.acelerar(); // -> 5
		civic.acelerar(); // -> 10
		civic.frear(); // -> 5
		
		System.out.println("Velocidade Atual -> " 
				+ civic.VelocidadeAtual);
		
		civic.frear();
		civic.frear(); // -> 0
		civic.frear();
		System.out.println("Velocidade Atual -> " 
				+ civic.VelocidadeAtual);
		
		Ferrari ferrari = new Ferrari();
		ferrari.acelerar(); // -> 15
		ferrari.acelerar(); // -> 30
		
		ferrari.frear(); // -> 25
		
		System.out.println("Velocidade Atual -> " 
				+ ferrari.VelocidadeAtual);
	}
}
