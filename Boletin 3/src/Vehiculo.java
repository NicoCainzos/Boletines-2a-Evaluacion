
public class Vehiculo {
	protected String matricula;
	protected String tipo;
	protected int velocidadMaxima;
	protected Conductor conductor;
	
	public String getMatricula(){
		return matricula;
}
	public void setMatricula(String matricula) {
		this.matricula=matricula;
}	
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor=conductor;
	}
	
	public void mostrarDatos() {
		System.out.println("matricula: "+matricula);
		System.out.println("tipo: "+tipo);
		System.out.println("velocidad maxima: "+velocidadMaxima);
		System.out.println(conductor.toString());
	}

	
}
