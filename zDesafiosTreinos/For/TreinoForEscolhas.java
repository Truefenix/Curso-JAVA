package zDesafiosTreinos.For;

import javax.swing.JOptionPane;

public class TreinoForEscolhas {
	
	public static void main(String[] args) {
		
		String contador1 = JOptionPane.showInputDialog(
				"Escolha um número para repetir até 100");
		String incremento1 = JOptionPane.showInputDialog(
				"Escolha um Incremento");
		
		double contador = Double.parseDouble(contador1);
		
		if (incremento1.equals("+")) {
			for(; contador <= 20; contador += 1) {
				System.out.println(contador);
			}} else if(incremento1.equals("-")) {
				for(; contador >= -20; contador -= 1) {
					System.out.println(contador);
			}} else {
				System.out.println("é Soma + ou Subtração - até 20");
			}
		}	
 }
