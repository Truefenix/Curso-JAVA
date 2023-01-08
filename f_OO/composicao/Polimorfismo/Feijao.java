package f_OO.composicao.Polimorfismo;

public class Feijao {

private double peso;
	
	public Feijao(double peso) {
		setPeso(peso);
	}

	// Getter -> ler
	public double getPeso() {
		return peso;
	}

	// Setter -> alterar
	public void setPeso(double peso) {
		
		if(peso > 0) {
			this.peso = peso;
		}
	}
}
