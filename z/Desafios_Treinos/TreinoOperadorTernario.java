package z.Desafios_Treinos;

import javax.swing.JOptionPane;

public class TreinoOperadorTernario {
	
	public static void main(String[] args) {
		
		// 3 tentativa
		// Acertou tudo leva maior premio
		// Acertou metade leva metade
		// Errou tudo se fudeu
		
		String pergunta1 = JOptionPane.showInputDialog(
				"Acertou quantas? [nada], [metade], [tudo]")
				.replace("nada", "1")
				.replace("metade", "2")
				.replace("tudo", "3");
		
		int caminho1 = Integer.parseInt(pergunta1);
		
		String saida = caminho1 == 1 ? 
				"Deu Ruim" : caminho1 == 2 ? "Mais ou Menos" : "Acertei Tudo";
		
		System.out.println(saida);
	}

}
