package z_Desafios_Testes.Colecoes.ListaCliente;

import java.util.ArrayList;

public class dados {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Bia", "1:50"));
		lista.add(new Usuario("Ana", "2:50"));
		lista.add(new Usuario("Lia", "3:50"));
		lista.add(new Usuario("Rey", "4:50"));
		lista.add(new Usuario("Yoa", "5:50"));
		
		int soma = 0;
		for(Usuario a: lista) {
			System.out.printf("Nome do Cliente%d: %s |"
					+ " Horário: %s | ID: %d \n", soma + 1, a.nome, 
					a.hora, a.id + soma);
			
			soma += 1;
		}
	}
}
