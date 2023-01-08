package f_OO.composicao.Polimorfismo;

public class Sorvete {

	private double peso;
	
	public Sorvete(double peso) {
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
