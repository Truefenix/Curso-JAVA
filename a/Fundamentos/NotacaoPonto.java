package a.Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora"); //.replace troca um valor
		s = s.concat(" Junto Legal");  //.concat junta um valor
		s = s.toUpperCase();  //.toUpperCase Deixa tudo Maiúsculo
		                     //.toLowerCase deixa tudo Minusculo
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase().replace("O", "wwwww"));
		//frase direto no syso no replace "O" deixar maiúsculo por causa do UpperCase.
		
		String r = "Legal".replace("L", "JJ");
		System.out.println(r);
		
		String e = "bom Dia T"
				.replace("bom", "Otimo")  // A ordem de funções é muito importante
				.replace("T", "hehe")     // vai dizer oque vem primeiro
				.concat(" Incrivelmente")
				.toUpperCase();
		System.out.println(e);
		
		//Tipos Primitivos não tem o Operador "." pois ele só receve valor.
	}

}
