package fundamentos.ExerciciosBasicos;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia o peso e a altura do usuário
		// e imprima no console o IMC.
		
		String peso1 = JOptionPane.showInputDialog("Escreva seu peso ").trim();
		
		double peso = Double.parseDouble(peso1);
		
		String altura1 = JOptionPane.showInputDialog("Escreva sua Altura ")
				.trim().replace(",", ".");
		
		double altura = Double.parseDouble(altura1);
		
		double ptaltura = Math.pow(altura, 2);
		double imc = peso / ptaltura;
		
		System.out.println("O peso é: " + peso);
		System.out.println("A altura é: " + altura1);
		
		System.out.printf("\n O IMC é: %.2f", imc);
	}
}
