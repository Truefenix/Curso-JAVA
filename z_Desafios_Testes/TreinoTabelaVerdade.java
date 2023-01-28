package z_Desafios_Testes;

public class TreinoTabelaVerdade {
	
	public static void main(String[] args) {
		
		// 3 tiros ao alvo.
		// 1- Acertou tudo e ganhou 10 pontos.
		// 2- Acertou 1 e ganhou 5 pontos.
		// 3- Errou e matou alguém.
		
		boolean tiro1 = true;
		boolean tiro2 = true;
		
		// 10 PONTOS só se eu acertei os 2 tiros.
		boolean ponto10 = tiro1 && tiro2;
		
		// 5 PONTOS só se eu acertar 1 tiro.
		boolean ponto5 = tiro1 ^ tiro2;
		
		// FUDEU só se errar tudo e mata alguém.
		boolean fudeu = tiro1 || tiro2;
		
		System.out.println("Acertou 10 \"ponto\"? " + ponto10);
		System.out.println("Acertou 5 \"pontos\"? " + ponto5);
		System.out.println("Errou e Matou \"alguém\"? " + !fudeu); // FATALITY
	}

}
