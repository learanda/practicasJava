package ar.clases.integracion;

public class Main {

	public static void main(String[] args) {
		
		Superheroe tipito = new Superheroe("Boris", 30, 4, 4, "Mario");
		
		System.out.println(tipito.toString());
		
		tipito.atacar();
		tipito.defender();
		System.out.println(tipito.saludar("Lan"));
	}

}
