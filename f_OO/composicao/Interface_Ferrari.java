package f_OO.composicao;

public class Interface_Ferrari extends Interface_Carro implements Interface_Esportivo{

	Interface_Ferrari() {
		super(0);
	}
	// Sobreescrever o Método da classe Carro
	void acelerar() {
		if(VelocidadeAtual <= 400) {
			this.VelocidadeAtual += 15.0;
		} 
	}
	
	@Override
	public void ligarTurbo() {
		delta = 25;
		
	}
	
	@Override
	public void desligarturbo() {
		delta = 15;
		
	}
}