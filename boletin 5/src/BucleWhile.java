
public class BucleWhile implements IBucle {

	@Override
	public void mostrar(int valorHasta) {
		int i=0;
		while( i<valorHasta) {
			System.out.println(i);
			i++;
			
		}
	}

	@Override
	public void mostrar(int valorDesde, int valorHasta) {
		int i=valorDesde;
		while(i<valorHasta) {
			System.out.println(i);
		}
		
		
	}
	

}
