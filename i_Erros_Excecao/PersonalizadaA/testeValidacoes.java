package i_Erros_Excecao.PersonalizadaA;

import i_Erros_Excecao.Aluno;

public class testeValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno(" ", -7);
			validar.aluno(aluno);
			
			validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim...");
	}
}
