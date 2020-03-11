enum tipoAmbito{
	CIENTIFICO, DEPORTIVO, ESPECTACULOS, CORAZON 
}
public class Revista extends superClase {
	public tipoAmbito ambito;
	
	public Revista(tipoAmbito ambito,String titulo, int anhoPublicacion) {
		this.ambito=ambito;
		this.titulo=titulo;
		this.anhoPublicacion=anhoPublicacion;
	}
	public String toString() {
		String mensaje=ambito+ "\n" +titulo+"\n"+anhoPublicacion+"\n";
		return mensaje;
		
	}

}
