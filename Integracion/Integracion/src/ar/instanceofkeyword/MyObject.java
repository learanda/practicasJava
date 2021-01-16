package ar.instanceofkeyword;

class Bird {
	public void sing() {
		System.out.println("Singing!");
	}
}

class Eagle extends Bird {
	
}

public class MyObject {

	public static void main(String[] args) {
		
		Eagle e = new Eagle();
		System.out.println(e instanceof Bird);
		//Se usa mas que nada para saber si una clase se relaciona con otra
		//Como para checkear

	}

}
