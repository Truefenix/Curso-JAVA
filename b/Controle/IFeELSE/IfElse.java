package b.Controle.IFeELSE;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		// IF/ELSE
		String valor = JOptionPane.showInputDialog("Escreva o Número: ");
		
		// Converte o valor em int
		int resultado = Integer.parseInt(valor);
		
		// se o valor em módular for igual 1 impar entaõ true / else false
		if (resultado % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}
}
