package f_OO.composicao.HERANCA.DESAFIO_HERANCA;

public class Carro {

	double VelocidadeAtual = 0;
	
	void acelerar() {
		if(VelocidadeAtual <= 400) {
			this.VelocidadeAtual += 5.0;
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
