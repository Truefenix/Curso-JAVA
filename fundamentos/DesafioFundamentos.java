package fundamentos;

import javax.swing.JOptionPane;

public class DesafioFundamentos {

	public static void main(String[] args) {

		// Desafio fazer uma conta com JOption.

		String numero1 = JOptionPane.showInputDialog("Escreva um Numero: ").trim();

		String operador1 = JOptionPane.showInputDialog("Escreva um Operador: ");
		
		String numero2 = JOptionPane.showInputDialog("Escreva um Numero: ").trim();

		double num1 = Double.parseDouble(numero1);
		
		double num2 = Double.parseDouble(numero2);
		
		double operador = "+".equals(operador1) ? num1 + num2 : 0;
		operador = "-".equals(operador1) ? num1 - num2 : operador;
		operador = "/".equals(operador1) ? num1 / num2 : operador;
		operador = "*".equals(operador1) ? num1 * num2 : operador;
		operador = "%".equals(operador1) ? num1 % num2 : operador;
		
		System.out.printf("%f %s %f = %f", num1, operador1, num2, operador);
	}
}
