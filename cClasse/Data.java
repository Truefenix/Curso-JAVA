package cClasse;

public class Data {
	
	// Desafio de data criar 3 Atributo dia, mês e ano.
	
	int dia;
	int mes;
	int ano;
	
	// Desafio Método Refatorar a classe data com os atributos.
	String dataFormatada() {
		String formatado = dia + "/" + mes + "/" + ano;
		return formatado;
	}
}
