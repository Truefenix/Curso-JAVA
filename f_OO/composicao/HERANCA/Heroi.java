package f_OO.composicao.HERANCA;

public class Heroi extends Jogador {

	// Class que recebeu atributos e comportamentos pelo extends
	
	// Herança sobrescrita
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 30; // sobrescrito
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 30; // sobrescrito
			return true;
		} else {
			return false;
		}
	}
}
