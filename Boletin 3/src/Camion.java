
public class Camion extends Vehiculo {
		private int altura;
		private Remolque remolque;
		
		public Camion(int altura, Remolque remolque) {
			this.altura=altura;
			this.remolque=remolque;
		}
		
	
		public int getAltura(){
			return altura;
		}
		public void setAltura(int altura) {
			this.altura=altura;
		}
		
		public Remolque getRemolque() {
			return remolque;
		}
		public void setRemolque(Remolque remolque) {
			this.remolque=remolque;
		}
		
		public void mostrarDatos() {
			System.out.println("Altura:"+ altura);
			System.out.println(remolque.toString());
		}
	}




