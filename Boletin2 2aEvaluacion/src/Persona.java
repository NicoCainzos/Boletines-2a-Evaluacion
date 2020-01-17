import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {
	public  String nombre;
	public  String apellidos;
	public  LocalDate fechaNacimiento;
	public  int estatura;
	
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
	}
	public Persona() {
	
	}
	public  void  mostrarDatos() {
		 System.out.println(nombre);
		 System.out.println(apellidos);
		 System.out.println(fechaNacimiento);
		 System.out.printf("mide %d cm\n",estatura);
		 long edad=mostrarEdad();
		 System.out.printf("tiene %d años\n\n",edad);
		 
		 mostrarEdad();
		 
	}
	public  long mostrarEdad() {
		return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
		//System.out.printf("tiene %d años\n\n",edad);
	}
	
	/*public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura=estatura;
	}*/
	
	

}
