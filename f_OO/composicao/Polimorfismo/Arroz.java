package f_OO.composicao.Polimorfismo;

public class Arroz {

private double peso;
	
	public Arroz(double peso) {
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
