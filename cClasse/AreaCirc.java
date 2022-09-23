package cClasse;

public class AreaCirc {

	double raio;
	static double pi = 3.14; // Atributo Estático está ligado a classe e ñ obj.
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}
}
