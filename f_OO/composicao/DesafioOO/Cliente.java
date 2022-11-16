package f_OO.composicao.DesafioOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	
	List<Compra> compra = new ArrayList<>();
	
	Cliente(Compra compra) {
		this.compra.add(compra);
	}
}
