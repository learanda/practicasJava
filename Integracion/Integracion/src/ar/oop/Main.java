package ar.oop;

public class Main {

	public static void main(String[] args) {
		
		Lapicera p = new Lapicera();
		
		System.out.println(p.color);
		System.out.println(p.tipo);
		System.out.println(p.punto);
		
		System.out.println(p.clickeada);
		
		p.click();
		
		System.out.println(p.clickeada);
		
		
		System.out.println("------------------");
		
		
		Auriculares a = new Auriculares();
		
		System.out.println(a.color);
		a.powerOn();
		System.out.println(a.power);
		a.volumeUp();
		a.volumeUp();
		a.volumeUp();
		a.volumeUp();
		a.volumeUp();
		System.out.println(a.volume);

	}

}
