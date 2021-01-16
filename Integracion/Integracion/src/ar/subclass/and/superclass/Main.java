package ar.subclass.and.superclass;

public class Main {

	public static void main(String[] args) {
		Shoe s = new Shoe("Nike", 10);
		System.out.println(s.brand);
		
		Walking w = new Walking("Adidas", 12, true);
		System.out.println(w.goreTex);
		
		Running r = new Running("Converse", 11, 5.5);
		System.out.println(r.weight);
		
	}

}
