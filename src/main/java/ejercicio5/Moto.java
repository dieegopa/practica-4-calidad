package ejercicio5;

public class Moto extends Vehiculo{

	public Moto(int potencia) {
		super(potencia);
	}

	@Override
	public int cuotaMensual() {
		return this.potencia*2;
	}

}
