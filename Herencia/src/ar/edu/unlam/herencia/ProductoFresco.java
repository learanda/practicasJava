package ar.edu.unlam.herencia;

public class ProductoFresco extends Producto{
	
	private String fechaEnvasado;
	private String paisOrigen;

	public ProductoFresco(String fechaCaducidad, Integer numeroLote) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	public void getDatosProductoFresco() {
		System.out.println("Fecha de caducidad: " + getFechaCaducidad() + "\n" + "Número de lote: " + getNumeroLote()
		+ "\n" + "Fecha de Envasado: " + getFechaEnvasado() + "\n" + "País de origen: " + getPaisOrigen());
	}

}
