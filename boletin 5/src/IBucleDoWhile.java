
public class IBucleDoWhile implements IBucle {

	@Override
	public void mostrar(int valorHasta) {
		int i=0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<valorHasta);
		
	}

	@Override
	public void mostrar(int valorDesde, int valorHasta) {
		int i=valorDesde;
		do {
			System.out.println(i);
			i++;
		}
		while(i<valorHasta);
	}

}
