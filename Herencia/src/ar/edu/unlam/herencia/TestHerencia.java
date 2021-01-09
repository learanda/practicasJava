package ar.edu.unlam.herencia;

public class TestHerencia {

	public static void main(String[] args) {
		
		ProductoFresco quesoFresco = new ProductoFresco("20-08-2020", 27845);
		quesoFresco.setFechaEnvasado("20-02-2020");
		quesoFresco.setPaisOrigen("Argentina");
		quesoFresco.getDatosProductoFresco();
		
		System.out.println(" ");
		
		ProductoRefrigerado yogurt = new ProductoRefrigerado("10-04-2020", 99654);
		yogurt.setCodOrgSupAlim("2234AR");
		yogurt.getDatosProductoRefrigerado();
		
		System.out.println(" ");

		ProductoCongelado pollo = new ProductoCongelado("15-09-2020", 56123);
		pollo.setTempCongRecomendada(-10.0);
		pollo.getDatosProductoCongelado();

	}

}
