package ar.herencia;

public class Main {

	public static void main(String[] args) {
		Mouse1 mouse1 = new Mouse1();
		Mouse2 mouse2 = new Mouse2();
		Mouse3 mouse3 = new Mouse3();
		
		System.out.println(mouse1.textura);
		mouse1.clickIzquierdo();
		mouse1.clickIzquierdo();
		mouse1.scrollUp();
		mouse1.scrollDown();
		
		System.out.println("--------------");
		
		mouse2.conectar();
		
		System.out.println("--------------");
		
		System.out.println(mouse3.ambidiestro);
		
		

	}

}
