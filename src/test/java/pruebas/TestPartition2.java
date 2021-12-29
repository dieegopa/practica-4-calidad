package pruebas;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import ejercicio5.Coche;

public class TestPartition2{

	//Aqui probamos velocidadMinima
	//calcularVelocidadMinima
	
	int potencia = 200;
	int numPlazas = 4;
	int velocidadMinima = 0;
	Coche coche = new Coche(potencia,numPlazas);
	

	@Test
	public void testNotNull() {
		assertNotNull(coche.calcularVelocidadMinima());
	}
	
	@Test
	public void testNull() {
		assertNull(coche.calcularVelocidadMinima());
	}
	

	
	



}
