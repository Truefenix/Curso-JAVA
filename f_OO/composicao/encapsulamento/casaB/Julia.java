package f_OO.composicao.encapsulamento.casaB;

import f_OO.composicao.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcesso() {
		//System.out.println(sogra.segredo); // Erro está privado
		//System.out.println(sogra.DentroDeCasa);
		//System.out.println(sogra.falar);
		
		System.out.println(sogra.todosSabem);
	}
}
