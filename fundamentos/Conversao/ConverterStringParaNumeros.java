package fundamentos.Conversao;

import javax.swing.JOptionPane; // Import do JOption

public class ConverterStringParaNumeros {
	
	public static void main(String[] args) {
		
		// caixa de String JOption
		String valor1 = JOptionPane.showInputDialog(
				"Digite o Primeiro número");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o Segundo número");
		
		//Saida do valor 1 e valor 2 escrito na caixa do JOption
		System.out.println((valor1) + " " + (valor2));
		
		// parseDouble = Troca a String para Double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//recebe a soma das variaveis double
		double soma = numero1 + numero2;
		
		System.out.println("A soma e " + soma);
		System.out.println("A média e " + soma / 2);
	}

}
