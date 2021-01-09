package ar.clases.integracion;

public class Superheroe extends Persona implements Acciones {
	
	private String apodo;

	public Superheroe(String nombre, Integer peso, Integer manoIzq, Integer manoDer, String apodo) {
		super(nombre, peso, manoIzq, manoDer);
		this.apodo = apodo;
	}

	
	@Override
	public String toString() {
		return "El superhéroe se llama " + getNombre() + " y pesa " + getPeso() + " KG";
	}


	@Override
	public void atacar() {
		System.out.println("Ataca ferózmente");;
	}


	@Override
	public void defender() {
		System.out.println("Se defiende con sus garritas");
	}


	@Override
	public String saludar(String nombre) {
		return "WOF " + nombre;
	}
	

}
