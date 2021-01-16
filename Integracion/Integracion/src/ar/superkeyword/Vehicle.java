package ar.superkeyword;

class Vehicle {
	
	int maxSpeed = 120;
	
	public void vroom() {
		System.out.println("Vroom vroom");
	}
	
	
}

class Car extends Vehicle {
	
	int maxSpeed = 100;
	
	public void display() {
		//Así es como se usa super en una variable
		System.out.println(super.maxSpeed);
	}
	
	public void vroom() {
		System.out.println("SKUUUUURT");
	}
	
	//Así se usa super para usar un metodo del padre
	public void vroomParent() {
		super.vroom();
	}
	
}
