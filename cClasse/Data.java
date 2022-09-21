package cClasse;

public class Data {
	
	// Desafio de data criar 3 Atributo dia, mês e ano.
	int dia;
	int mes;
	int ano;
	
	// Construtor Padrão
	Data () {
		dia = 1; // valores Padrão quando no objeto não receber nenhum paramêtro de entrada
		mes = 1;
		ano = 1970;
	}
	
	// Construtor com paramêtro de entrada
	Data (int diaPadrao, int mesPadrao, int anoPadrao) {
		dia = diaPadrao;
		mes = mesPadrao;
		ano = anoPadrao;
	}
	
	// Desafio Método Refatorar a classe data com os atributos.
	String dataFormatada() {
		String formatado = dia + "/" + mes + "/" + ano;
		return formatado;
	}
}
