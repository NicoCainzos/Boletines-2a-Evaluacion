
public abstract class Figura implements ICalculosFigura, IImpresionFigura{
	protected int area;
	protected int perimetro;
	
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area=area;
	}
	public int getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(int perimetro) {
		this.perimetro=perimetro;
	}
		
	public void imprimirArea() {
		System.out.printf("Area:%d \n",area);
	
	}
	public void imprimirPerimetro() {
		System.out.printf("Perimetro:%d\n,area");
	}
	
}
