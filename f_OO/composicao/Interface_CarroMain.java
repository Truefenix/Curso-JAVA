package f_OO.composicao;

public class Interface_CarroMain {

	public static void main(String[] args) {
		
		Interface_Civic civic = new Interface_Civic();
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
		
		Interface_Ferrari ferrari = new Interface_Ferrari();
		ferrari.acelerar(); // -> 15
		ferrari.acelerar(); // -> 30
		
		ferrari.frear(); // -> 25
		
		System.out.println("Velocidade Atual -> " 
				+ ferrari.VelocidadeAtual);
	}
}
