
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
	public void calcularArea() {
		area=(int) (base * altura / 2.0);
		
	}
	@Override
	public String toString() {
		
		return String.format("TRIANGULO\nBase:%d\n Altura:%d\n Area:%d\nPerimetro:%d", base,altura,area,perimetro);
	}
	@Override
	public void calcularPerimetro() {
		perimetro = base * 3;
	}
	public void imprimirDatosFigura() {
		System.out.println(this.toString());
	}

}
