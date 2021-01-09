package ar.clases.impresoras.sistema;

public class Impresora {
	
	private String tamanioHoja;
	private Integer cantidadHojas;
	private Integer impresionesPorMinuto;
	private String tipoImpresion;
	private Boolean color, negro;
	
	public Impresora(String tamanioHoja, Integer cantidadHojas, Integer impresionesPorMinuto,
			String tipoImpresion, Boolean color, Boolean negro) {
		this.tamanioHoja = tamanioHoja;
		this.cantidadHojas = cantidadHojas;
		this.impresionesPorMinuto = impresionesPorMinuto;
		this.tipoImpresion = tipoImpresion;
		this.color = color;
		this.negro = negro;
	}
	
	public String getTamanioHoja() {
		return tamanioHoja;
	}
	
	public void setTamanioHoja(String tamanioHoja) {
		this.tamanioHoja = tamanioHoja;
	}

	public Integer getCantidadHojas() {
		return cantidadHojas;
	}

	public void setCantidadHojas(Integer cantidadHojas) {
		this.cantidadHojas = cantidadHojas;
	}

	public Integer getImpresionesPorMinuto() {
		return impresionesPorMinuto;
	}

	public String getTipoImpresion() {
		return tipoImpresion;
	}
	
	public Boolean getColor() {
		return color;
	}
	
	public Boolean getNegro() {
		return negro;
	}
	
	public void imprimir() {
		System.out.println("La impresora está imprimiendo");
	}

}
