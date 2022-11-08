package c.Classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		// Desafio Data criar 2 objeto (instância)
		
		Data d1 = new Data(2, 2, 2022);
		
		String DataFormatada1 = d1.dataFormatada();
		System.out.println(DataFormatada1);
		
		var d2 = new Data();
		d2.dia = 3;
		d2.mes = 3;
		d2.ano = 2023;
		
		System.out.println(d2.dataFormatada());
	}
}
