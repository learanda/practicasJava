package ar.edu.unlam.herencia;

public class ProductoRefrigerado extends Producto {

	private String codOrgSupAlim;
	
	public ProductoRefrigerado(String fechaCaducidad, Integer numeroLote) {
		super(fechaCaducidad, numeroLote);
		this.codOrgSupAlim = codOrgSupAlim;
	}

	public String getCodOrgSupAlim() {
		return codOrgSupAlim;
	}

	public void setCodOrgSupAlim(String codOrgSupAlim) {
		this.codOrgSupAlim = codOrgSupAlim;
	}
	
	public void getDatosProductoRefrigerado() {
		System.out.println("Fecha de caducidad: " + getFechaCaducidad() + "\n" + "N�mero de lote: " + getNumeroLote()
		+ "\n" + "C�digo de organismo de supervisi�n alimentaria: " + getCodOrgSupAlim());
	}
}
