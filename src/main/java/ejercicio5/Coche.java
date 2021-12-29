package ejercicio5;

public class Coche extends Vehiculo{
	
	public int numPlazas;
	
	public Coche(int potencia, int numPlazas) {
		super(potencia);
		this.numPlazas=numPlazas;
	}

	@Override
	public int cuotaMensual() {
		return this.numPlazas*this.potencia;
	}
	
	
}
