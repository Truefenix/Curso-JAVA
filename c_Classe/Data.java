package c_Classe;

public class Data {
	
	// Desafio de data criar 3 Atributo dia, mês e ano.
	int dia;
	int mes;
	int ano;
	
	// Construtor Padrão
	Data () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // this método
	}
	
	// Construtor com paramêtros de entrada
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes; // this é utilizado para resolver conflitos nos nomes
		this.ano = ano;
	}
	
	// Desafio Método Refatorar a classe data com os atributos.
	String dataFormatada() {
		String formatado = dia + "/" + mes + "/" + ano;
		return formatado;
	}
}
