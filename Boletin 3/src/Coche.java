
public class Coche extends Vehiculo {
		private int numeroPlazas;
		
		public Coche(String matricula, String tipo, int velocidadMaxima, int numeroPlazas) {
			this.matricula=matricula;
			this.tipo=tipo;
			this.velocidadMaxima=velocidadMaxima;
			this.numeroPlazas=numeroPlazas;
			
		}
		public int getNumeroPlazas(){
			return numeroPlazas;
		}
		public void setNumeroPlazas(int numeroPlazas) {
			this.numeroPlazas=numeroPlazas;
		}
		
		public void mostrarDatos() {
			super.mostrarDatos();
			System.out.println("numero de plazas: "+numeroPlazas);
		} 

}

