package ar.oop;

public class Lapicera {
	
	String tipo = "gel";
	String color = "azul";
	int punto = 10;
	
	static boolean clickeada = false;
	
	public static void click() {
		clickeada = true;
	}
	
	public static void noClickeada() {
		clickeada = false;
	}

}
