import java.util.ArrayList;
import java.util.LinkedList;

public class PilaLinkedList implements IPila {
	public LinkedList<Object> pila;
	
	public PilaLinkedList() {
		pila=new LinkedList<Object>();
	}

	@Override
	public void apilar(Object a) {
		pila.add(a);
		
	}

	@Override
	public Object desapilar() {
		return pila.pollLast();
		
		
	}

	@Override
	public Object cima() {
		return pila.getLast();
		
		
	}

}
