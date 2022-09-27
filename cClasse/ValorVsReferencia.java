package cClasse;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a; // Atribuição por valor (Tipo Primitivo)
		
		a++; b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(2, 2, 2022);
		Data d2 = d1; // Atribuição por Referência (objeto)
		
		d1.dia = 3;
		d2.mes = 1;
		d1.ano = 2025;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		// teste da Atribuição de Referência
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		// teste de atribuição de Valor Primitivos
		int y = 5;
		voltarPrimitivoValor(y);
		System.out.println(y);
	}
	// Atribuição de Referência	
	static void voltarDataParaValorPadrao(Data d) { // void (nenhum Tipo Primitivo)
		d.dia = 0; 
		d.mes = 0; // Gerou impacto na modificação do endereço do objeto
		d.ano = 0;
	}
	
	// Atribuição de Valor Primitivos
	static void voltarPrimitivoValor(int y) {
		y++;
	}
}
