	public class Remolque{
		
		public String matricula;
		public int longitud;
	
		public String getmatricula(){
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula=matricula;
		}
		
		public int getLongitud(){
			return longitud;
		}
		public void setlongitud(int longitud) {
			this.longitud=longitud;
		}
		@Override
		public String toString() {
			
			return "Matricula: "+matricula+"\n"+"longitud: "+ longitud;
		}
	}