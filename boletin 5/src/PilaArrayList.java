import java.util.ArrayList;
import java.util.LinkedList;

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
	public Object desapilar() {
		return pila.remove(pila.size()-1);
		
	}

	@Override
	public Object cima() {
		return pila.get(pila.size()-1);
		
		
	}

}
