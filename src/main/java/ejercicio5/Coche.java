package ejercicio5;

import java.util.LinkedList;

public class Coche extends Vehiculo{
	
	public int numPlazas;
	public int velocidadMinima;
	public LinkedList <Persona> listaPersonas= new LinkedList<Persona>();
	
	
	
	public Coche(int potencia, int numPlazas) {
		super(potencia);
		this.numPlazas=numPlazas;
		this.velocidadMinima = potencia / numPlazas;
		
	}

	@Override
	public int cuotaMensual() { //NUMPLAZAS
		return this.numPlazas*this.potencia;
	}
	
	public boolean esVehiculo() {
		
		if(this instanceof Vehiculo) {
			return true;
		}
		
		return false;
	}
	
	public boolean esMoto() {  //NUMPLAZAS
		if(this.numPlazas == 2) {
			return true;
		}
		
		return false;
	}
	
	public LinkedList<Persona> addPersona(Persona p) { //listapersonas
		this.listaPersonas.add(p);
		return listaPersonas;
	}
	
	public int getVelocidadMaxima() { //numplazas
		return this.potencia * this.numPlazas;
		
	}
	
	public int calcularDistanciaMaxima(int gasolina) {
		return this.potencia / gasolina;
	}
	
	public int calcularVelocidadMinima() { //VELOCIDAD M�NIMA
		return this.velocidadMinima;
	}
	
	
	
}
