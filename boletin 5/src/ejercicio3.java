
public class ejercicio3 {

	public static void main(String[] args) {
		IPila impPila= new PilaLinkedList();
		impPila.apilar("7");
		impPila.apilar("8");
		impPila.apilar("9");
		
		impPila.desapilar();
		
		impPila.cima();
		
		ICola impCola= new ColaLinkedList();
		impCola.encolar("1");
		impCola.encolar("2");
		impCola.encolar("3");
		
		impCola.desencolar();
		
		impCola.frente();
		
	}

}
