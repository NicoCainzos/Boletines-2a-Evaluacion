
public class Ejercicio1 {
private final static String COCHE="COCHE";
private final static String CAMION="CAMION";
	public static void main(String[] args) {
		Coche ferrari = new Coche("1111 AAA","COCHE", 400,2);
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
		impresionPoliformismo2(ferrari);
		
		Camion camion2 = new Camion("matricula","CAMION",150,5);
		camion2.mostrarDatos();
	}
	
	public static void impresionPoliformismo(Vehiculo audi) {
		audi.mostrarDatos();
			
	}
	public static void impresionPoliformismo2(Vehiculo a) {
		if(a.equals(COCHE)) {
			a.mostrarDatos();
		}
	}
	
	
	public static void imprimirRemolque(Camion c)
	{
		
	}

}
