
public class Ejercicio1 {

	public static void main(String[] args) {
		Coche ferrari = new Coche("1111 AAA","Deportivo", 400,2);
		Conductor nico = new Conductor("48119935W","Nico");
		ferrari.setConductor(nico);
		Remolque remolque1 = new Remolque();
		remolque1.longitud=2;
		remolque1.matricula="2222 BBB";
		
		Camion camion1 = new Camion(2, remolque1);
		ferrari.mostrarDatos();
		camion1.mostrarDatos();
		
		System.out.println("\n");
		
		impresionPoliformismo(camion1);
	}
	
	public static void impresionPoliformismo(Vehiculo audi) {
		audi.mostrarDatos();
			
	}
	public static void impresionPiliformismo2(Vehiculo a) {
		
	}

}
