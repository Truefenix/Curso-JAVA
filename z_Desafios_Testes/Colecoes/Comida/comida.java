package z_Desafios_Testes.Colecoes.Comida;

import javax.swing.JOptionPane;

public class comida {

	public static void main(String[] args) {

		usuario comer = new usuario();
		
		String comida = comer.nome;
		@SuppressWarnings("unused")
		double peso = comer.peso;
		
		String senha = "";
		while (!senha.equals("-1")) {

			comida = JOptionPane.showInputDialog("Oque você quer comer?");
			String pesoComida = JOptionPane.showInputDialog("qual o peso da comida?");
			
			System.out.printf("Comida %s com o peso de %s kg.\n", comida, pesoComida);
			
			String saida = JOptionPane.showInputDialog("SAIDA: -1?");
			
			peso = Double.parseDouble(pesoComida);
			
			senha = saida;
		}
		

	}
}
