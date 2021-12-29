package ejercicio5;
import java.util.LinkedList;

public class Garaje {
	
	LinkedList <Vehiculo> listaVehiculos= new LinkedList<Vehiculo>();
	private String nombre;
	
	
	public Garaje(Vehiculo v1, Vehiculo v2, Vehiculo v3) {
		this.listaVehiculos.add(v1);
		this.listaVehiculos.add(v2);
		this.listaVehiculos.add(v3);
	}
	
	public Garaje(String nombre) {
		this.nombre = nombre;
	}
	
	public void guardarVehiculo(Vehiculo v) {
		listaVehiculos.add(v);
	}

	public LinkedList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public String getNombre() {
		return nombre;
	}
	
}
