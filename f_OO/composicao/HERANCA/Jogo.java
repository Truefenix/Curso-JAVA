package f_OO.composicao.HERANCA;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi j1 = new Heroi(); // objeto Heroi
		
		// Posição de y e x;
		j1.x = 10;
		j1.y = 10;
		
		Monstro j2 = new Monstro(); // objeto Monstro
		
		// Posição de y e x;
		j2.x = 10;
		j2.y = 11;
		
		// Método atacar do Jogador
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println(j1.vida); // vida 100 -> 90
		System.out.println(j2.vida);
	}
}
