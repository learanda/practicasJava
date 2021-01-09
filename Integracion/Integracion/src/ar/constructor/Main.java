package ar.constructor;

public class Main {

	public static void main(String[] args) {
		
		Shirt s = new Shirt();
		
		s.setColor("White");
		s.setSize('M');
		s.putOn();
		
		System.out.println(s.color);
		System.out.println(s.size);
		
		System.out.println("-------------------");
		
		Shirt s2 = new Shirt("Black", 'L');
		
		System.out.println(s2.color);
		System.out.println(s2.size);

	}

}
