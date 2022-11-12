package z_Desafios_Treinos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumJOption {
	public static void main(String[] args) {
		String salario1 = JOptionPane.showInputDialog(
				"Escreva seu último salario: ").replace(",", ".");
		
		String salario2 = JOptionPane.showInputDialog(
				"Escreva seu penúltimo salario: ").replace(",", ".");
		
		String salario3 = JOptionPane.showInputDialog(
				"Escreva seu Ante-penúltimo salario: ").replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		double media = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("\nO Último Salário da 1 pessoa é: " + salario1);
		System.out.println("O Último Salário da 2 pessoa é: " + salario2);
		System.out.println("O Último Salário da 3 pessoa é: " + salario3);
		
		System.out.printf("\nA soma entre as pessoas 1 2 3 é: %.1f", soma, " reais");
		System.out.printf("\nA média entre as pessoas 1 2 3 é: %.1f", media, " reais");
	}

}
