package cClasse;

public class DataTeste {
	
	public static void main(String[] args) {
		
		// Desafio Data criar 2 objeto (instância)
		
		Data d1 = new Data();
		d1.dia = 2;
		d1.mes = 2;
		d1.ano = 2022;
		
		System.out.printf("A Data é %d/%d/%d", d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data();
		d2.dia = 3;
		d2.mes = 3;
		d2.ano = 2023;
		
		System.out.printf("\nA Data é %d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
