package ar.edu.unlam.herencia;

public class Producto {
	
	private String fechaCaducidad;
	private Integer numeroLote;
	
	
	public Producto(String fechaCaducidad, Integer numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}


	public String getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public Integer getNumeroLote() {
		return numeroLote;
	}


	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}
	
}
