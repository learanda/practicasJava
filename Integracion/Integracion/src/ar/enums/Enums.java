package ar.enums;

enum Level {
	LOW, MEDIUM, HIGH;
}

public class Enums {
	
	// LOS ENUM SE UTILIZAN COMO LISTA DE COSAS QUE NO CAMBIAN
	
	public static void main(String[] args) {
		
		Level l = Level.LOW;
		
		System.out.println(l);
		
		switch(l) {
			case LOW:
				System.out.println("Low level");
				break;
			case MEDIUM:
				System.out.println("Medium level");
				break;
			case HIGH:
				System.out.println("High level");
				break;
		}
	}

}
