import java.util.ArrayList;

public class ColaArrayList implements ICola {
	public ArrayList<Object> cola;
	
	public ColaArrayList() {
		cola=new ArrayList<Object>();
	}

	@Override
	public void encolar(Object a) {
		cola.add(a);
	}

	@Override
	public Object desencolar() {
		return cola.remove(0);
		
	}

	@Override
	public Object frente() {
		return cola.get(0);
		
	}
	

}
