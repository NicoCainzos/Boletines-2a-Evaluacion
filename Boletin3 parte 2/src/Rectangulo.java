
public class Rectangulo extends Cuadrado{
	private int base;
	
	public Rectangulo(int lado, int base) {
		super(lado);
		this.base=base;
				
	}

	protected void calcularArea() {
		area=base*super.lado;
	}
	@Override
	public String toString() {
		
		return String.format("RECTANGULO\nBase:%d\n Altura:%d\n Area:%d", base,lado,area);
	}

}
