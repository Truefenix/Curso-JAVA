package g_Lambdas.InterfacesFuncionais;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isDigito =
				num -> num >= 100 && num <= 999;
				
		System.out.println(isPar.and(isDigito).negate().test(123));
		System.out.println(isPar.or(isDigito).test(123));
	}
}
