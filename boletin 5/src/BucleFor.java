
public class BucleFor implements IBucle{

	@Override
	public void mostrar(int valorHasta) {
		for(int i=0; i<valorHasta;i++) {
			System.out.println(i);
		}
	}

	@Override
	public void mostrar(int valorDesde, int valorHasta) {
		for(int i=valorDesde; i<valorHasta;i++) {
			System.out.println(i);
		}
		
	}

}
