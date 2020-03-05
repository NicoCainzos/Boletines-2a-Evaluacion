import java.util.ArrayList;

public class ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Automovil>Vehiculos=new ArrayList<Automovil>();
		Automovil a1=new Automovil("Ferrari","Coche",TipoCombustible.GASOLINA);
		Automovil a2=new Automovil("Audi","Coche",TipoCombustible.DIESEL);
		Automovil a3=new Automovil("Mercedes","Coche",TipoCombustible.ELECTRICO);
		Automovil a4=new Automovil("Honda","Moto",TipoCombustible.HIBRIDO);
		Vehiculos.add(a1);
		Vehiculos.add(a2);
		Vehiculos.add(a3);
		Vehiculos.add(a4);
		
		ImprimirVehiculo(Vehiculos);

	}
	public static void ImprimirVehiculo(ArrayList<Automovil> Vehiculos) {
		
		
		for(int i=0;i<Vehiculos.size();i++) {
			TipoCombustible C=Vehiculos.get(i).tipo;
			
			if(C== TipoCombustible.DIESEL)
				System.out.println(Vehiculos.get(i).toString());
		}
		
	}

}
