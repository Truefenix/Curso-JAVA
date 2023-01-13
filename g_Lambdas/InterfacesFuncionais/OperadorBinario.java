package g_Lambdas.InterfacesFuncionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media =
				(n1, n2) -> (n1 + n2) / 2;
				
		System.out.println(media.apply(2.5, 3.0));
		
		BiFunction<Double, Double, String> resultado =
				(Double n1, Double n2) -> {
					double notaFinal = (n1 + n2) / 2;
					return notaFinal >= 7 ? "Aprovado" : "Reprovado";
				};
				
		System.out.println(resultado.apply(9.7, 5.1));
	}
}
