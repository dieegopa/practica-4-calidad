package ejercicio5;

public abstract class Vehiculo {
	
	public int potencia;
	
	public Vehiculo(int potencia) {
		this.potencia=potencia;
	}
	
	public abstract int cuotaMensual();
	
}
