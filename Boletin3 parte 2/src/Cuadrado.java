
public class Cuadrado extends Figura {
	protected int lado;
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado=lado;
	}
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	@Override
	public final void calcularArea() {
		area = lado*lado;
		
	}
	@Override
	public String toString() {
		
		return String.format("CUADRADO\nLado:%d\nArea:%d\nParimetro:%d", lado,area,perimetro);
	}
	@Override
	public void calcularPerimetro(){
		perimetro = lado * 4;
	}
	public void imprimirDatosFigura() {
		System.out.println(this.toString());
	}

}
