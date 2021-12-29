package ejercicio5;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		
		LinkedList <Vehiculo> listaVehiculos= new LinkedList<Vehiculo>();
		Vehiculo v1=new Coche(200,5);
		Vehiculo v2=new Moto(250);
		Vehiculo v3=new Coche(150,6);
		
		
		Garaje g=new Garaje("Prueba");
		g.guardarVehiculo(v1);
		g.guardarVehiculo(v2);
		g.guardarVehiculo(v3);
		
		listaVehiculos=g.getListaVehiculos();
		
		for(Vehiculo v:listaVehiculos) {
			System.out.println(v.cuotaMensual());
		}
		
	}

}
