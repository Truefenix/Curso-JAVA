package f_OO.composicao.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Julia", 30);
		
		// método que manda a idade
		p1.setIdade(-45);
		
		System.out.println(p1.getIdade());
		System.out.println(p1); //toString
	}
}
