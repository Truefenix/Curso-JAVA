package b_Controle;

public class BreakFor {

	public static void main(String[] args) {
		
		// break; no for ele quebra o laço de repetição quando o if é atendido.
		
		for(int a = 0; a < 10; a++) {
			
			if(a == 5) {
				break;
			}
			System.out.println(a);
		}
	}
}
