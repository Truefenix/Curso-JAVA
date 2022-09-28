package cClasse.DesafioComida;

public class Pessoa {
	static String nome;
	static double pesoAntes;
	static double pesoDepois = comer();
	
	Pessoa() {
		
	}
	
	Pessoa(String nome1, double peso1) {
		nome = nome1;
		pesoAntes = peso1;
	}

	static double comer() {
		return Comida.peso + pesoAntes;
	}
	
	static String saida1() {
		String formatado = nome + " tava com peso de " 
	+ pesoAntes + "\ne agora está com " + pesoDepois;
		return formatado;
	}
}
