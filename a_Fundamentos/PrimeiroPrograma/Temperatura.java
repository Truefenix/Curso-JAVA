package a_Fundamentos.PrimeiroPrograma;

public class Temperatura {
	public static void main(String[] args) {
		/*(°F - 32) x 5.0/9.0 = °C  */
		final double fator = 32;
		final double ajuste = 5.0/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - fator) * ajuste;
		
		System.out.println("Grau Celsius de Fahrenheit e " + celsius);	
	}

}
