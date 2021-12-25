package ejercicio5;
import java.util.LinkedList;

public class Garaje {
	
	LinkedList <Vehiculo> listaVehiculos= new LinkedList<Vehiculo>();
	private String nombre;
	
	
	public Garaje(String nombre) {
		this.nombre=nombre;
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
