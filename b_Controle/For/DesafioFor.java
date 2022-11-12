package b_Controle.For;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for(int a = 0; a < 5; a++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão Desafio
		// Fazer a escada do laço for sem número
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
