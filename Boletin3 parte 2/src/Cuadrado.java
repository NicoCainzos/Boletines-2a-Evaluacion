
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
	protected void calcularArea() {
		area = lado*lado;
		
	}
	@Override
	public String toString() {
		
		return String.format("CUADRADO\nLado:%d\nArea:%d", lado,area);
	}

}
