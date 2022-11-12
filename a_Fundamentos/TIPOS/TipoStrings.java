package a_Fundamentos.TIPOS;

public class TipoStrings {
	public static void main(String[] args) {
		//.charAt procura e mostra em numero onde ta
	System.out.println("Bom dia".charAt(4));//.charAt(); procura no numero a letra
	  
	   String s = "Bom dia";
	   System.out.println(s.concat("!!!")); // concat e + junta  a mesma coisa .
	   System.out.println(s + "!!!");
	   
	   //.startsWith
	   String r = "Bom dia";
	   System.out.println(r.startsWith("Bom")); // true pq ta "Bom" igual
	   System.out.println(r.startsWith("bom")); //false pq ta "bom" em minusculo
	   System.out.println(r.toLowerCase().startsWith("bom"));//true LowerCase e starsWith "bom" estão igual e minusculo.
	   System.out.println(r.toUpperCase().startsWith("BOM"));//true LowerCase e starsWith "BOM" estão igual e maiúculo.
	   
	   //.length
	   String x = "Boa tarde";
	   System.out.println(x.length()); //length retorna quantos caractere tem.
	   
	   //.endsWith
	   System.out.println(x.endsWith("tarde")); //.endsWith termina com= sem sim true / se não false.
	   System.out.println(x.toUpperCase().endsWith("TARDE"));//true UpperCase e endsWith "TARDE"
	   System.out.println(x.toLowerCase().endsWith("TADE"));//false LowerCase e endsWith "TARDE"
	   
	   //.equals
	   System.out.println(x.equals("boa tarde")); //false porque x não ta igual a "boa tarde" minusculo
	   System.out.println(x.toLowerCase().equals("boa tarde")); //true porque x ta igual "boa tard" com LowerCase
	   
	   //IgnoreCase
	   System.out.println(x.equalsIgnoreCase("boa tarde")); //IgnoreCase ignora UpperCase e LowerCase
	   
	   // %s %d %f e Stem.out.printf();
	   var nome = "Pedro";
	   var sobrenome = "Santos";
	   var idade = 33;
	   var salario = 12345.123;
	   //fica muito grande escrever normalmente no println();
	   /* System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome +
			   "\nidade: " + idade + "\nsalario: " + salario); */
	   
	   //atalho pra escrever é o printf();
	   /* System.out.printf(" O senhor %s %s \n tem %d de idade \n e R$ %.2f de dinheiro",
			   nome, sobrenome, idade, salario); */
	   
	   //String.format(" "); guardar o formato da String em uma variavel
	   String frase = String.format(" O senhor %s %s \n tem %d de idade \n e R$ %.2f de dinheiro",
			   nome, sobrenome, idade, salario);
	   System.out.println(frase);
	   
	   //.contains(" "); se contém tal frase true, se não false
	   System.out.println("\nfrase Qualquer".contains("Qual"));
	   
	   //indexOf(" "); indice vai procurar a palavra e mostrar a posição 123...
	   System.out.println("frase qualquer".indexOf("qual"));
	   
	   //.substring(comesso, final); comesse a partir de e pare a partir de
	   System.out.println("frase qualquer".substring(6));
	   System.out.println("frase qualquer".substring(6, 8));
	}

}
