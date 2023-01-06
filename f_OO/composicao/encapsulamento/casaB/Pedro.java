package f_OO.composicao.encapsulamento.casaB;

// precisa importar, pois não esta no mesmo pacote
import f_OO.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	// Visíblidade Herança -> herança e public
	
	void testeAcesso() {
		
		//System.out.println(mae.segredo); Erro está privado
		
		//System.out.println(DentroDeCasa); Só pode ver dentro do mesmo pacote
		
		System.out.println(falar); // herança
		System.out.println(todosSabem); // Public
	}
}
