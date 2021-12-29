package pruebas;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import ejercicio5.Coche;

public class TestPartition {
	
	//aqui vamos a probar numPlazas
	//cuotaMensual
	//esMoto
	//getVelocidadMaxima
	
	int potencia = 200;
	int numPlazas = 4;
	int velocidadMaxima = potencia * numPlazas;
	Coche coche = new Coche(potencia,numPlazas);
	
	@Test
	public void testEquals() {
		assertEquals(velocidadMaxima,coche.getVelocidadMaxima());
	}
	
	
	@Test
	public void testTrue() {
		assertTrue(coche.esMoto());
	}
	
	
	@Test
	public void testFalse() {
		assertFalse(coche.esMoto());
	}
	
	
	@Test
	public void testNotNull() {
		assertNotNull(coche.cuotaMensual());
	}
	

	
}
