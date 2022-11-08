package a.Fundamentos;

public class Inferencias {
	public static void main(String[] args) {
		double a = 2.2;
		System.out.println(a);
		var b = 3.3;
		System.out.println(b);
		
		String teste = "isso ae";
		
		System.out.println(teste);
		
		double x; // 1-linha declarou
		x = 2.2;  // 2-linha inicializou
		System.out.println(x); // 3-linha usada
		
	/*	var m;      erro declarou sem tipo
		m = 1.1;    erro recebeu o valor sem tipo;
		System.out.println(m);  usou a var sem tipo por isso n
		                        aparece no console  */
	}

}
