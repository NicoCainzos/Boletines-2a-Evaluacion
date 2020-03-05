
enum TipoCombustible{
		DIESEL, GASOLINA, ELECTRICO, HIBRIDO
	}

public class Automovil {
	
	public String marca;
	public String modelo;
	public TipoCombustible tipo;
	
	public Automovil(String marca, String modelo, TipoCombustible tipo) {
		this.marca=marca;
		this.modelo=modelo;
		this.tipo=tipo;
		
	}
	public String toString(){
		String mensaje= marca+"\n" + modelo+"\n" + tipo;
		return mensaje;
	}
}
