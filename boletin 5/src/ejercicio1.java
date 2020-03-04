import java.util.ArrayList;

public class ejercicio1 {

	public static void main(String[] args) {
	//Apartado 1	
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		listaPersonas.add(new Persona("Jose","Martinez Granda",55));
		listaPersonas.add(new Persona("Katy","Ruiz Gomez",24));
		listaPersonas.add(new Persona("Jose Manuel","Blanco Garrido",18));
		listaPersonas.add(new Persona("Jose Luis","Rodriguez Vázquez",72));
		listaPersonas.add(new Persona("Borja","López López",11));
		listaPersonas.add(new Persona("Lourdes","Neira Arias",62));
		listaPersonas.add(new Persona("Josefa","Martinez Seoane",57));

	String letra="J";
	ArrayList<String> solucionNombre=ArrayPersona(listaPersonas,letra);
	
	//Apartado 2
	int edad=60;
	ArrayList<String> solucionEdad=BorradoDeEdad(listaPersonas,edad);
	
	//Apartado 3
	for(Persona i: listaPersonas) {
		System.out.println(i.toString());
	}
	
	}
	public static ArrayList ArrayPersona(ArrayList<Persona> listaPersonas, String letra) { //Apartado 1
		ArrayList<Persona> arrayPersonasJ=new ArrayList<Persona>();
		for(int i=0; i< listaPersonas.size();i++) {
			if(listaPersonas.get(i).getNombre().equals(letra)) {
				arrayPersonasJ.add(listaPersonas.get(i));
			}	
		}
		return arrayPersonasJ;
		
	}
	public static ArrayList BorradoDeEdad(ArrayList<Persona> listaPersonas, int edad) {
		
		for(int i=0;i<listaPersonas.size();i++) {
			if(edad< listaPersonas.get(i).getEdad()) {
				listaPersonas.remove(i);
				
			}
		}
		
		
		
		
		return listaPersonas;
		
	}

}
