package pruebas;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import ejercicio5.Coche;
import ejercicio5.Persona;
import ejercicio5.Vehiculo;

public class TestJUnit {
	
	
	int potencia;
	int numPlazas;
	int velocidad;
	int gasolina;
	Coche coche;
	
	Vehiculo coche1;
	Vehiculo coche2;
	LinkedList <Persona> listaPersonas;

	
	@BeforeClass
	public static void inicializadorUnico() {
		System.out.println("Inicializador Unico...");
	}	
	
	@AfterClass
	public static void destructorUnico() {
		System.out.println("Destructor Unico...");
	}
	
	@Before
	public void inicializador() {
		System.out.println("Inicializando atributos...");
		
		this.potencia = 200;
		this.numPlazas = 5;
		this.velocidad = potencia * numPlazas;
		this.gasolina = 30;
		this.coche = new Coche(potencia, numPlazas);
		
		this.coche1 = coche;
		this.coche2 = new Coche (coche.numPlazas, coche.potencia);
		this.listaPersonas= new LinkedList<Persona>();
	}
	
	@After
	public void destructor() {
		System.out.println("Destruyendo atributos...");
		this.coche = null;
		this.coche1 = null;
		this.coche2 = null;
		this.listaPersonas= null;
	}
	
	@Test
	public void testEquals() {
		assertEquals(velocidad, coche.getVelocidadMaxima());
	}
	
	
	@Test
	public void testTrue() {
		assertTrue(coche.esVehiculo());
	}
	
	
	@Test
	public void testFalse() {
		assertFalse(coche.esMoto());
	}
	
	
	@Test
	public void testNotNull() {
		assertNotNull(coche.calcularDistanciaMaxima(gasolina));
	}
	
	
	@Test
	public void testNull() {
		assertNull(null);
	}
	
	
	@Test
	public void testSame() {
		assertSame(coche, coche2);
	}
	
	@Test
	public void testNotSame() {
		assertNotSame(coche, coche1);
	}
	
	//@Ignore
	@Test
	public void testArrayEquals() {
		assertArrayEquals(listaPersonas.toArray(), (coche.addPersona(new Persona("Prueba", "Prueba")).toArray()));
	}
	
	
	
	
}
