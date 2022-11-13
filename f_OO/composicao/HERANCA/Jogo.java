package f_OO.composicao.HERANCA;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi monstro = new Heroi(); // objeto Heroi
		
		// Posição de y e x;
		monstro.x = 10;
		monstro.y = 10;
		
		Monstro heroi = new Monstro(); // objeto Monstro
		
		// Posição de y e x;
		heroi.x = 10;
		heroi.y = 11;
		
		// Método atacar do Jogador
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem -> " + monstro.vida);
		System.out.println("Herói tem -> " + heroi.vida);
	}
}
