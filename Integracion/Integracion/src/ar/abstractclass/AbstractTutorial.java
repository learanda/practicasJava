package ar.abstractclass;

//Un metodo abstracto es un metodo que aun no ha sido implementado
//A traves de estos metodos te aseguras de que se implemente si o si
//En una clase abstracta puedo tener metodos abstractos y no abstractos
//a los que se les especifica el cuerpo, la implementacion.
//A los que serán abstractos se les coloca el public abstract
abstract class Dog {
	
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void poop();
	
}

class Chihuahua extends Dog {
	@Override
	public void poop() {
		System.out.println("Dog pooped!");
	}
}

public class AbstractTutorial {

	public static void main(String[] args) {
		
		
		Chihuahua d = new Chihuahua();
		
		d.bark();
		d.poop();

	}

}
