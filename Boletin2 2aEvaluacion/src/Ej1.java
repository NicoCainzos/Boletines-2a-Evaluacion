import java.time.LocalDate;

public class Ej1 {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre="Juan";
		p1.apellidos="Rodriguez Mata";
		p1.fechaNacimiento= LocalDate.of(1965, 1, 15);
		p1.estatura=165;
		
		Persona p2 = new Persona();
		p2.nombre="Maria";
		p2.apellidos="Sánchez Gómez";
		p2.fechaNacimiento=LocalDate.of(1980,12,26);
		p2.estatura=170;
		
		Persona p3 = new Persona();
		p3.nombre="Alejandro";
		p3.apellidos="Gomez Gomez";
		p3.fechaNacimiento=LocalDate.of(2001,11,1);
		p3.estatura=190;
		
		Persona p4 = new Persona();
		p4.nombre="Jose Manuel";
		p4.apellidos="Perez Pons";
		p4.fechaNacimiento=LocalDate.of(2010,5,1);
		p4.estatura=127;
		
		Persona p5 = new Persona("Lorena", "Remeseiro Neira",LocalDate.of(2000,6,12));
		Persona p6 = new Persona("Patricia", "Seoane Alvarez",LocalDate.of(1976, 8, 23));
		
		
		p1.mostrarDatos();
		p2.mostrarDatos();
		p3.mostrarDatos();
		p4.mostrarDatos();
		p5.mostrarDatos();
		p6.mostrarDatos();
		
		Persona [] arrayPersona= {p1,p2,p3,p4,p5,p6};
		datosArray(arrayPersona);
	}
	
	public static void datosArray(Persona [] arrayPersona) {
		 long edad;
		 System.out.println("Mayores de 18:");
		for(int i=0; i<arrayPersona.length;i++) {
			Persona p=arrayPersona[i];
			edad=p.mostrarEdad();
			if(edad>=18) {
				arrayPersona[i].mostrarDatos();
			}
		}
	}
}
