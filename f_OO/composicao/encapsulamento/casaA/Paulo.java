package f_OO.composicao.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcesso() {
		
		//System.out.println(esposa.segredo); Erro está privado
		
		System.out.println(esposa.DentroDeCasa);
		System.out.println(esposa.falar);
		System.out.println(esposa.todosSabem);
	}
}
