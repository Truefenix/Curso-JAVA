package cClasse;

public class AreaCirc {

	double raio;
//  static double pi = 3.14; // Atributo Estático está ligado a classe e ñ obj.
	
//  Atributo Constante e static
	final static double pi = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	// Método normal
	double area() {
		return raio * raio * pi;
	}
	
	// Método static
	static double area(double raio) {
		return raio * raio * pi; 
	}
}
