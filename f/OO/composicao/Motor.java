package f.OO.composicao;

public class Motor {

	boolean ligado = false;
	int fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
