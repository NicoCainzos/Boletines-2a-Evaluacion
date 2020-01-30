
public class Ejercicio2 {

	public static void main(String[] args) {
		Circulo circ = new Circulo(10);
		Cuadrado cuad = new Cuadrado(3);
		Triangulo trian = new Triangulo(2,5);
		circ.calcularArea();
		cuad.calcularArea();
		trian.calcularArea();
		
		circ.imprimirArea();
		cuad.imprimirArea();
		trian.imprimirArea();
		
		Figura[] arrayFiguras= {
				new Triangulo(3,2),
				new Cuadrado(5),
				new Triangulo(15,3),
				new Triangulo(8,7),
				new Rectangulo(9,5),
				new Rectangulo(15,6),
				new Circulo(5),
				new Circulo(9),
				new Rectangulo(8,3),
				new Cuadrado(9)
				};
		guardarArray(arrayFiguras);

	}
	public static void  guardarArray(Figura[] arrayFiguras) {
		Circulo[] arrayCirculo = new Circulo[10];
		Cuadrado[] arrayCuadrado = new Cuadrado[10];
		Triangulo[] arrayTriangulo = new Triangulo[10];
		Rectangulo[] arrayRectangulo = new Rectangulo[10];
		int j=0, b=0, c=0,d=0;
		
		for(int i=0; i<arrayFiguras.length;i++) {
			if(arrayFiguras[i] instanceof Triangulo) {				
				arrayTriangulo[j]= (Triangulo) arrayFiguras[i];
				j++;
				}
			else if(arrayFiguras[i] instanceof Cuadrado) {				
				arrayCuadrado[b]= (Cuadrado) arrayFiguras[i];	
				b++;
				}
			else if(arrayFiguras[i] instanceof Circulo) {				
				arrayCirculo[c]= (Circulo) arrayFiguras[i];		
				c++;
				}
			else if (arrayFiguras[i] instanceof Rectangulo) {
				arrayRectangulo[d]= (Rectangulo) arrayFiguras[i];	
				d++;
				}

			}
		for(int i=0; i<arrayCirculo.length;i++) {
			if(arrayCirculo[i]==null) {
				break;
			}
			else{
				arrayCirculo[i].calcularArea();
			 System.out.println(arrayCirculo[i].toString());
			}
		}
		for(int i=0; i<arrayTriangulo.length;i++) {
			if(arrayTriangulo[i]==null) {
				break;
			}
			else{
				arrayTriangulo[i].calcularArea();
				System.out.println(arrayTriangulo[i].toString());
			}
		}
		for(int i=0; i<arrayCuadrado.length;i++) {
			if(arrayCuadrado[i]==null) {
				break;
			}
			else{
				arrayCuadrado[i].calcularArea();
				System.out.println(arrayCuadrado[i].toString()); 
			}
		}
		for(int i=0; i<arrayRectangulo.length;i++) {
			if(arrayRectangulo[i]==null) {
				break;
			}
			else{
				arrayRectangulo[i].calcularArea();
				System.out.println(arrayRectangulo[i].toString()); 
			}
		}
		
		}
		
		
	}


