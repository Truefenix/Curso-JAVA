package f_OO.composicao.Polimorfismo;

public class Pessoa {

private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	// Polimorfismo estático
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
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
