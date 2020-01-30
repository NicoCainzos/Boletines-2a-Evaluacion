
public abstract class Figura {
	protected int area;
	
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area=area;
	}
	
	protected abstract void calcularArea();
	
		
	protected void imprimirArea() {
		System.out.printf("Area:%d \n",area);
	
	}
	

}
