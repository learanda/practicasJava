package ar.superkeyword;

public class Main {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.maxSpeed);
		c.display();
		c.vroom();
		c.vroomParent();
	}

}
