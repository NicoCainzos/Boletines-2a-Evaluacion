import java.util.ArrayList;

public  class PilaArrayList implements IPila {
	public ArrayList<Object> pila;
	
	public PilaArrayList() {
		pila=new ArrayList<Object>();
	}

	@Override
	public void apilar(Object a) {
		pila.add(a);
		
	}

	@Override
	public void desapilar(Object a) {
		
		
	}

	@Override
	public void cima(Object a) {
		
		
	}

}
