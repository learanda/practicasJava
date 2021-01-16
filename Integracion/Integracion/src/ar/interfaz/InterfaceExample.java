package ar.interfaz;

//La interfaz asume que todos sus métodos son abstractos, por eso
//no hace falta aclararlo como en las clases abstractas
//Nunca se especificará el cómo
//La interfaz funciona mas bien como una lista de caracteristicas
interface WaterBottleInterface {
	
	String color = "Blue";
	
	void fillUp();
	void pourOut();
}

public class InterfaceExample implements WaterBottleInterface {

	public static void main(String[] args) {
		
		System.out.println(color);
		
		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();
		ex.pourOut();
	}

	@Override
	public void fillUp() {
		System.out.println("It is filled");
	}

	@Override
	public void pourOut() {
		System.out.println("It is poured");
		
	}

}
