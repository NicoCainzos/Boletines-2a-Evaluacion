
public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base=base;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	public Triangulo( int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	protected void calcularArea() {
		area=(int) (base * altura / 2.0);
		
	}
	@Override
	public String toString() {
		
		return String.format("TRIANGULO\nBase:%d\n Altura:%d\n Area:%d", base,altura,area);
	}

}
