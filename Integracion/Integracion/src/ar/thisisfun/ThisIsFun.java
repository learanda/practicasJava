package ar.thisisfun;

public class ThisIsFun {
	
	String comida;
	char tamanio;
	
	public void setData(String comida, char tamanio) {
		this.comida = comida;
		this.tamanio = tamanio;
	}

	public static void main(String[] args) {
		
		ThisIsFun t = new ThisIsFun();
		t.setData("sopa", 'L');
		
		System.out.println(t.comida);
		System.out.println(t.tamanio);

	}

}
