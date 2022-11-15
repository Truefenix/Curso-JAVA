package f_OO.composicao.DesafioOO;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<item> itens = new ArrayList<>();
	
	Compra() {
		
	}
	Compra(item quantidade) {
		this.itens.add(quantidade);
	}
}
