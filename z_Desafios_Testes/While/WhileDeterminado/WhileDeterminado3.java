package z_Desafios_Testes.While.WhileDeterminado;

import javax.swing.JOptionPane;

public class WhileDeterminado3 {
	
	public static void main(String[] args) {
		
		// Um JOption para comessar o número do while e outro para terminar.
		
		String comesso1 = JOptionPane.showInputDialog(
				"Número de Comesso: ");
		String fim1 = JOptionPane.showInputDialog(
				"Número final");
		
		int comesso = Integer.parseInt(comesso1);
		int fim = Integer.parseInt(fim1);
		
		while(comesso <= fim) {
			System.out.println(comesso);
			comesso += 1;
		}
	}
}
