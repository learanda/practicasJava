package ar.clases.integracion;

public abstract class Persona{
	
	private String nombre;
	private Integer peso;
	private Mano manoIzq, manoDer;
	
	public Persona(String nombre, Integer peso, Integer manoIzq, Integer manoDer) {
		this.nombre = nombre;
		this.peso = peso;
		this.manoIzq = new Mano(manoIzq);
		this.manoDer = new Mano(manoDer);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Mano getManoIzq() {
		return manoIzq;
	}

	public void setManoIzq(Mano manoIzq) {
		this.manoIzq = manoIzq;
	}

	public Mano getManoDer() {
		return manoDer;
	}

	public void setManoDer(Mano manoDer) {
		this.manoDer = manoDer;
	}

	public abstract String toString();

}
