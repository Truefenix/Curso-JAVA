package z_Desafios_Testes.For;

import javax.swing.JOptionPane;

public class TreinoForMultiplicação {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog(
				"Número da Tabela: ");
		
		int numero = Integer.parseInt(num1);
		int comeco = 0;
		
		for(; comeco <= 10; comeco++) {
			System.out.println(num1 + " X " + comeco + " = " + numero * comeco);
		}
	}
}
