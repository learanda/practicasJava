package ar.edu.unlam.herencia.y.composicion;

public class Profesor extends Persona {
	
	private Integer idProfesor;

	public Profesor(String nombre, Integer edad, Integer cantDedosManoIzq, Integer cantDedosManoDer) {
		super(nombre, edad, cantDedosManoIzq, cantDedosManoDer);
		this.idProfesor = idProfesor;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public void darClases() {
		System.out.println(getNombre() + " está dando clases.");
	}
	
	public void aMinuscula(String n) {
		System.out.println(n.toLowerCase());
	}
	
	
	

}
