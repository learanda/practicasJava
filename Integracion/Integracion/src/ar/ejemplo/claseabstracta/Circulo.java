package ar.ejemplo.claseabstracta;

public class Circulo extends Figura{
	
	public Float radio;

	@Override
	public Float area() {
		
		return 3.1415f * (this.radio * this.radio);
	}

}
