package ar.edu.unlam.tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;

import ar.edu.unlam.herencia.y.composicion.Mano;
import ar.edu.unlam.herencia.y.composicion.Profesor;

public class TestProfesorJUnit {
	
	@Test
	public void testQueVerificaSeteoDeDedosManoDer() {
		
		Profesor martin = new Profesor("Martin", 40, null, null);
		martin.setManoDer(5);
		
		Integer ve = 5;
		Integer vo = martin.getManoDer().getCantDedos();
		
		Assert.assertEquals(ve, vo);
		
	}
	
	@Test
	public void testQueVerificaSeteoDeDedosManoIzq() {	//Otra forma
		
		String nombre = "Martin";
		Integer edad = 40;
		Integer cantDedosManoIzq = null;
		Integer cantDedosManoDer = null;
		Profesor martin = new Profesor(nombre, edad, cantDedosManoIzq, cantDedosManoDer);
		
		martin.setManoIzq(1);
		
		if(martin.getManoIzq().getCantDedos() > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
	}
	
	/*@Test
	public void testDeNullPointerException() {
		
		Profesor martin = new Profesor("Martin", 40, null, null);
		Boolean valorEsperado = false;
		Boolean valorObtenido = true;
		
		try {
			martin.setManoIzq(1);
			martin.escribirManoIzq();
		}
		catch (NullPointerException e) {
			valorObtenido = false;
			System.out.println("La excepción fue testeada.");
		}
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}*/
	
	@Test
	public void testNullPointerException() {
		Profesor martin = new Profesor("Martin", 40, null, null);
		martin.setNombre(null);
		Assertions.assertThrows(NullPointerException.class, () -> martin.aMinuscula(martin.getNombre()), "por querer convertir a minuscula un null");
		//Assertions.assertThrows(ArithmeticException.class, () -> martin.aMinuscula(martin.getNombre()), "para probar el test de exception, el expected y el obtained");
	}

}
