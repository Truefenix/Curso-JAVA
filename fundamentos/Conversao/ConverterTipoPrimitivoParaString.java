package fundamentos.Conversao;

public class ConverterTipoPrimitivoParaString {
	
	public static void main(String[] args) {
		
		// Wrapper Integer para receber o Tipo Primitivo
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		// Converter direto na saida mas sempre colocando o wrapper
		int num2 = 100;
		System.out.println(Integer.toString(num2).length());
		
		// transformar o tipo primitivo em string concatenando com "" +
		System.out.println(("" + num1).toString().length());
	}

}
