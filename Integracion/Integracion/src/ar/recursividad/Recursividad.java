package ar.recursividad;

public class Recursividad {

	public static void main(String[] args) {
		decirHola(3);
		System.out.println("-------------");
		contarParaAtras(5);
	}
	
	// Siempre se necesita un caso base para que no entre en bucle infinito
	// El caso base en este caso es el tope de cuando n sea 0 
	
	public static void decirHola(int n) {
		if(n == 0) {
			System.out.println("Listo!");
		} else {
			System.out.println("Hola Boris!");
			n--;
			decirHola(n);
		}
	}
	
	public static void contarParaAtras(int n) {
		if(n == 0) {
			System.out.println("Listo!");
		} else {
			System.out.println(n);
			n--;
			contarParaAtras(n);
		}
	}

}
