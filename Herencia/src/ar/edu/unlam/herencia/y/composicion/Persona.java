package ar.edu.unlam.herencia.y.composicion;

public class Persona {
	
	private String nombre;
	private Integer edad;
	private Mano manoIzq, manoDer;
	
	public Persona(String nombre, Integer edad, Integer cantDedosManoIzq, Integer cantDedosManoDer) {
		this.nombre = nombre;
		this.edad = edad;
		this.manoIzq = new Mano(cantDedosManoIzq);
		this.manoDer = new Mano(cantDedosManoDer);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Mano getManoIzq() {
		return manoIzq;
	}

	public void setManoIzq(Integer manoIzq) {
		this.manoIzq.setCantDedos(manoIzq);
	}

	public Mano getManoDer() {
		return manoDer;
	}

	public void setManoDer(Integer manoDer) {
		this.manoDer.setCantDedos(manoDer);
	}
	
	public void escribirManoIzq() {
		
		try {
			if(this.manoIzq.getCantDedos() >= 3) {
				System.out.println("Está escribiendo con la mano izquierda.");
			} else if(this.manoIzq.getCantDedos() < 3 && this.manoIzq.getCantDedos() >= 0) {
				System.out.println("No puede escribir con menos de 3 dedos.");
			} else {
				System.out.println("Cantidad inválida.");
			}
		}
		
		catch (NullPointerException e) {
			
			System.out.println("Para poder escribir debe settear cantidad de dedos.");
			
		}
	}	// NO SIRVE, NO TIRA ERROR DE NULLPOINTER
		// EN EL UNIT TEST SE TESTEA UN EJEMPLO DE NPE
	
	public void escribirManoDer() {
		
		try {
			if(this.manoDer.getCantDedos() >= 3) {
				System.out.println("Está escribiendo con la mano derecha.");
			} else if(this.manoDer.getCantDedos() < 3 && this.manoDer.getCantDedos() >= 0) {
				System.out.println("No puede escribir con menos de 3 dedos.");
			} else {
				System.out.println("Cantidad inválida.");
			}
		}
		
		catch (NullPointerException e) {
			
			System.out.println("Para poder escribir debe settear cantidad de dedos.");
			
		}
		
		
	}
	
	public void pararEscribir() {
		System.out.println("Dejó de escribir.");
	}
	
	public void soloEscribir() {
		
	}

}
