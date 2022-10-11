package darrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {1.1, 2.2, 3.3, 5.5};
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		System.out.println();
		
		// Foreach
		for(double teste : notas) {
			System.out.print(teste + " ");
		}
	}
}
