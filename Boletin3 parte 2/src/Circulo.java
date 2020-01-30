
public class Circulo extends Figura {
	private int radio;
	private static final double PI=3.1416;
	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio=radio;
	}
	
	public Circulo (int radio) {
		this.radio=radio;
	}
	@Override
	protected void calcularArea() {
		area = (int) (PI*Math.pow(radio,2));
		
	}
	@Override
	public String toString() {
		
		return String.format("CIRCULO\nRadio:%d\nArea:%d",radio,area);
	}

}
