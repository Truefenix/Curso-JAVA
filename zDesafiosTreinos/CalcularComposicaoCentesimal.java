package zDesafiosTreinos;

/*Calcular a Composição Centesimal
  C=12g; H=1g; O=16g; Massa Molar=60g/mol;
  C2 / H4 / O2
 */

public class CalcularComposicaoCentesimal {
	public static void main(String[] args) {
		final int Carbono = 24;
		final int Hidrogeneo = 4;
		final int Oxigenio = 32;
		final int MassaGeral = Carbono + Hidrogeneo + Oxigenio;
		
		//Calculo de Carbono;
		double Calcarbono = (Carbono * 100.0) / MassaGeral;
		System.out.println("O Calculo de CARBONO e " + Calcarbono);
		
		//Calculo de Hidrogenêo;
		double Calhidrogeneo = (Hidrogeneo * 100.0) / MassaGeral;
		System.out.println("O Calculo de Hidrogeneo e " + Calhidrogeneo);
		
		//Calculo de Oxigeneo;
		double Caloxigenio = (Oxigenio * 100.0) / MassaGeral;
		System.out.println("O Calcuclo de Oxgenio e " + Caloxigenio);
	}

}
