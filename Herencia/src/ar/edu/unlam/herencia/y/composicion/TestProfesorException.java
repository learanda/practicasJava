package ar.edu.unlam.herencia.y.composicion;

public class TestProfesorException {

	public static void main(String[] args) {
		
		Profesor martin = new Profesor("Martin", 40, null, null);
		
		martin.escribirManoDer();
		
		martin.setManoDer(null);
		martin.escribirManoDer();
		
		martin.darClases();
		
		martin.setManoDer(2);
		martin.escribirManoDer();
		System.out.println(" ");
		
		martin.setManoDer(3);
		martin.escribirManoDer();
		
		// Como no se setteo la cantidad de dedos me va a dar null cantidad de dedos.
		System.out.println("\nUso del Get con composición:");
		System.out.println(martin.getNombre() + " tiene " +
				martin.getManoDer().getCantDedos() + " dedos.");
		
		//  martin.getManoDer().getCantDedos()

	}

}
