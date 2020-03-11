
public class Libro extends superClase{
	public String autor;
	private int edicion;
	
	public Libro(String autor,String titulo, int anhoPublicacion){
		this.autor=autor;
		this.titulo=titulo;
		this.anhoPublicacion=anhoPublicacion;
		this.edicion=1;
	}
	public String toString() {
		String mensaje=autor+ "\n" +titulo+"\n"+anhoPublicacion+"\n"+edicion;
		return mensaje;
		
	}

}
