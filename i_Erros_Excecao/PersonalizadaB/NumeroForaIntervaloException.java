package i_Erros_Excecao.PersonalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception{

	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s esta fora do intervalo", 
				nomeDoAtributo);
	}
}
