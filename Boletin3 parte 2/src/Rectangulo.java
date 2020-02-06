
public class Rectangulo extends Cuadrado{
	private int base;
	
	public Rectangulo(int lado, int base) {
		super(lado);
		this.base=base;
				
	}

	public void calcularArea() {
		area=base*super.lado;
	}
	@Override
	public String toString() {
		
		return String.format("RECTANGULO\nBase:%d\n Altura:%d\n Area:%d\nPerimetro:%d", base,lado,area,perimetro);
	}
	@Override
	public void calcularPerimetro() {
		perimetro = super.lado *2 + base*2;
	}
	public void imprimirDatosFigura() {
		System.out.println(this.toString());
	}

}
