package f_OO.composicao.HERANCA.DESAFIO_HERANCA;

public class Ferrari extends Carro { // Herança

	Ferrari() {
		super(0);
	}
	// Sobreescrever o Método da classe Carro
	void acelerar() {
		if(VelocidadeAtual <= 400) {
			this.VelocidadeAtual += 15.0;
		} 
	}
}
