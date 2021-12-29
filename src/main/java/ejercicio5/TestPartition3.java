package ejercicio5;

import java.util.LinkedList;

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

public class TestPartition3 {

	//Aqui probamos listapersonas
	//usado en addpersonas
	
	LinkedList <Persona> listaPersonas = new LinkedList<Persona>();
	int potencia = 200;
	int numPlazas = 4;
	Coche coche = new Coche(potencia,numPlazas);
	
	@Test
	public void testArrayEquals() {
		assertArrayEquals(listaPersonas.toArray(), (coche.addPersona(new Persona("Prueba", "Prueba")).toArray()));
	}
	


}
