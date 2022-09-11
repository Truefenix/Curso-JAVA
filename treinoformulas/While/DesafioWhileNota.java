package treinoformulas.While;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioWhileNota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String botao = JOptionPane.showInputDialog(
				"Iniciar o Programa? [SIM], [NÂO]").trim();
		
		int numdevez = 0;
		double comeco = 0;
		double total = 0;
		
		// se for sim vai para While indeterminado
		if(botao.equalsIgnoreCase("SIM")) {
			
			for(;comeco != -1;) {
				System.out.print("Qual a nota do Aluno: ");
				comeco = entrada.nextDouble();
				
				if(comeco <= 100 && comeco >= 0) {
					total += comeco;
					numdevez++;
				}
			}
			
			System.out.println("\nVocê Saiu do Programa");
			System.out.println("\nO TOTAL é: " + total);
			System.out.println("\nO número de alunos é : " + numdevez);
			System.out.println("A média TOTAL é: " + numdevez / total);
		// se escrever não	
		} else if(botao.equalsIgnoreCase("NÂO") || botao.equalsIgnoreCase("nao")){
			
			System.out.println("Você SAIU F11 para Voltar");	
		} else {
			
			System.out.println("Escreva Certo");
		}

		entrada.close();
	}
}
