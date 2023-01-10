package f_OO.composicao;

public class Interface_Carro {

	final int VELOCIDADEMAXIMA;
	double VelocidadeAtual = 0;
	int delta = 5;
	
	Interface_Carro(int velocidadeMaxima) {
		VELOCIDADEMAXIMA = velocidadeMaxima;
	}
	void acelerar() {
		if(VelocidadeAtual + delta > VELOCIDADEMAXIMA) {
			VelocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			this.VelocidadeAtual += delta;
		}
	}
	void frear() {
		if(VelocidadeAtual >= 5) {
			this.VelocidadeAtual -= 5.0;
		} else {
			VelocidadeAtual = 0;
		}
	}
}
