package f_OO.composicao.HERANCA.DESAFIO_HERANCA;

public class Carro {

	final int VELOCIDADEMAXIMA;
	double VelocidadeAtual = 0;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
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
