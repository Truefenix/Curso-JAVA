package bcontrole.ExerciciosDeControle;
import javax.swing.JOptionPane;

public class Exercicio3Notas {

	public static void main(String[] args) {
		
		/**
		 * 3. Criar um programa que receba duas notas parciais, calcular a média
		 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
		 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
		 * "Recuperação", caso contrário imprime no console "Reprovado".
		 */
		
		String botao1 = JOptionPane.showInputDialog(
				"Escreva a nota de 1 a 10").trim();
		
		double botao= Double.parseDouble(botao1);
		
		if(botao <= 10 && botao >= 0) {
			if(botao <= 10 && botao >= 7.0) {
				System.out.println(botao + " Aprovado");
			} else if(botao < 7.0 && botao >= 4.0) {
				System.out.println(botao + " Recuperação");
			} else {
				System.out.println(botao + " Reprovado");
			}
		} else {
			System.out.println("Nota só entre 0 a 10");
		}
	}
}
