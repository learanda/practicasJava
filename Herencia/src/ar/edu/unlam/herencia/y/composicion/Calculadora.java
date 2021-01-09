package ar.edu.unlam.herencia.y.composicion;

public class Calculadora {
	
	private int numero1;	//Atributo
	private int numero2;	//Atributo
	private int resultado;	//Atributo
	
	public Calculadora() {	//Metodo constructor
		
	}
	
	public int suma(int numero1, int numero2) {		//Metodo suma
		return resultado = numero1 + numero2;
	}
	
	public void conocerElNumeroMayor(int numero1, int numero2) { //Metodo del mayor
		if(numero1 > numero2) {
			System.out.println("El mayor es el numero 1: " + numero1);
		} else {
			System.out.println("El mayor es el numero 2: " + numero2);
		}
	}
	


public static void main(String[] args) {
		
		Calculadora miCalculadora = new Calculadora();	//Se crea una instancia de Calculadora
														//un objeto calculadora
		
		System.out.println(miCalculadora.suma(2, 5));	//Ejecuto el metodo suma
		miCalculadora.conocerElNumeroMayor(2, 5);		//Ejecuto el metodo del mayor

	}

}
