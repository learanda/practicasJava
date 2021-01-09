package ar.edu.unlam.herencia.y.composicion;

public class TestPersona {

	public static void main(String[] args) throws Exception {
		
		Persona boris = new Persona("Boris", 4, null, null);
		boris.setManoDer(5);
		boris.setManoIzq(2);
		boris.escribirManoDer();
		boris.pararEscribir();
		boris.escribirManoIzq();
		boris.setManoIzq(3);
		boris.escribirManoIzq();

	}

}
