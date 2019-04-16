package ar.edu.unlam.pb2.dado;

import java.util.Random;

public class Dado {
	private Integer caras;// instancia, accesibilida
	public Integer lanzar() {
		Random aleatorio = new Random();
		caras = 1 + aleatorio.nextInt(6);
		// Comportamiento , tipo de retorno
		return caras;
	}
}
