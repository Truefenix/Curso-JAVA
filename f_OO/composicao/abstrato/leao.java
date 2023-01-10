package f_OO.composicao.abstrato;

public class leao extends Abstrato_Animal{
	
	// Classe Concreta
	
	@Override
	public String respírar() {
		return "Respirando Oxigênio";
	}
	
	@Override
	public String mover() {
		return "Se movendo";
	}
}
