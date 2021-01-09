package ar.edu.unlam.herencia.y.composicion;

public class TestProfesor {

	public static void main(String[] args) throws Exception {
		
		Profesor martin = new Profesor("Martin", 40, null, null);
		martin.setManoDer(5);
		martin.escribirManoDer();
		martin.pararEscribir();
		martin.darClases();
		
		System.out.println("\nUso del Get con composición:");
		System.out.println(martin.getNombre() + " tiene " +
				martin.getManoDer().getCantDedos() + " dedos.");
		
		//  martin.getManoDer().getCantDedos()
	}

}
