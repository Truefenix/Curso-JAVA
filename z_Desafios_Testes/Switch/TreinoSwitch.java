package z_Desafios_Testes.Switch;
import javax.swing.JOptionPane;

public class TreinoSwitch {

	public static void main(String[] args) {
		
		// Fazer uma calculadora com Switch
		
		String botao1 = JOptionPane.showInputDialog(
				"Escreva o número");
		
		String operador = JOptionPane.showInputDialog(
				"Escreva o Operador");
		
		String botao3 = JOptionPane.showInputDialog(
				"Escreva o número");
		
		int numero1 = Integer.parseInt(botao1);
		int numero2 = Integer.parseInt(botao3);
		
		switch(operador) {
		case "+":
			System.out.println(botao1 + operador + botao3 + " = " + (numero1 + numero2));
			break;
		case "-":
			System.out.println(botao1 + operador + botao3 + " = " + (numero1 - numero2));
			break;
		case "x": case "*":
			System.out.println(botao1 + operador + botao3 + " = " + (numero1 * numero2));
			break;
		case "/":
			System.out.println(botao1 + operador + botao3 + " = " + (numero1 / numero2));
			break;
		default:
			System.out.println("Escreva Certo");
			break;
		}
	}
}
