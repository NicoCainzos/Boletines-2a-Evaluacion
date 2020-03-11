import java.util.ArrayList;
import java.util.LinkedList;

public class ColaLinkedList implements ICola {
	public LinkedList<Object> cola;
	
	public ColaLinkedList() {
		cola=new LinkedList<Object>();
	}

	@Override
	public void encolar(Object a) {
		cola.add(a);
		
	}

	@Override
	public Object desencolar() {
		return cola.pollFirst();
		
		
	}

	@Override
	public Object frente() {
		return cola.getFirst();
		
		
	}

}
