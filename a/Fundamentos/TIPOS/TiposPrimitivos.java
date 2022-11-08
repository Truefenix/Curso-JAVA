package a.Fundamentos.TIPOS;

// TIPOS NUMÉRICOS INTEIROS

public class TiposPrimitivos {
	public static void main(String[] args) {

		byte anoDeEmpresa = 23;
		short numeroDeVoos = 512;
		int id = 56789;
		long pontosAcumulados = 2_134_845_222L;
		
		//Tipos Numéricos reais
		float salario = 11_000.44F;
		double vendasAcumulados = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = true; //em JAVA ñ se pode colocar 0 ou 1 no boolean
		
		//Tipo Caractere
		char status = 'I'; //Inativo erro colocar 2 caractere.
		
		System.out.println("Ele tem " + anoDeEmpresa * 362 + " dias na Empresa");
		System.out.println("ele fez " + numeroDeVoos + " viagens");
		System.out.println("A pessoa " + id + " tem pontos " + pontosAcumulados);
		System.out.println("Ele recebeu por tudo ate agora " + (salario * 12) * anoDeEmpresa);
		System.out.println("ele vendeu por tudo " + vendasAcumulados);
		System.out.println("Ferias = " + estaDeFerias);
		System.out.println("ele ta " + status + "    ('A' de Ativo e 'I' de Inativo)");
	}

}
