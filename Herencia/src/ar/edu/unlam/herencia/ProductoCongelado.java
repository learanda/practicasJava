package ar.edu.unlam.herencia;

public class ProductoCongelado extends Producto {
	
	private Double tempCongRecomendada;

	public ProductoCongelado(String fechaCaducidad, Integer numeroLote) {
		super(fechaCaducidad, numeroLote);
		this.tempCongRecomendada = tempCongRecomendada;
	}

	public Double getTempCongRecomendada() {
		return tempCongRecomendada;
	}

	public void setTempCongRecomendada(Double tempCongRecomendada) {
		this.tempCongRecomendada = tempCongRecomendada;
	}
	
	public void getDatosProductoCongelado() {
		System.out.println("Fecha de caducidad: " + getFechaCaducidad() + "\n" + "Número de lote: " + getNumeroLote()
		+ "\n" + "Temperatura de congelamiento recomendada: " + getTempCongRecomendada() + "ºC");
	}

}
