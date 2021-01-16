package ar.finaal.variables.metodos.clases;

public class Final {
	
	final int MAX = 11;
	
	final public void sayHi() {
		System.out.println("Hi!");
	}
	
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.MAX);
		
		f.sayHi();
	}

}

//no se puede modificar un final method - metodo constante
/* 
class OtherClass extends Final {
	public void sayHi() {
		System.out.println("Hello!");
	}
}*/