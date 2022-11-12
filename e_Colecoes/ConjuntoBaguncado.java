package e_Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto =  new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		
		System.out.println("Tamanho é: " + conjunto.size()); // 3
		
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size()); // 5
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é: " + conjunto.size()); // 1
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains(true) + "\n");
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // União entre 2 conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // interseção
		System.out.println(conjunto);
		
		conjunto.clear(); // limpar 
		System.out.println(conjunto);
	}
}
