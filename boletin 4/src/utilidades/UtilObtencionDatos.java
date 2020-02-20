package utilidades;

public class UtilObtencionDatos {
	
	public static int obtenerValorNumerico(int num)
	{
		boolean valorCorrecto;
		
		valorCorrecto=false;
		while(valorCorrecto==false)//Repetir pedir un número mientras no se introduzca un valor numerico
		{
			
				if(num>=0) {
					
					System.out.println("Es positivo");
					valorCorrecto=true;
				
				
			}
				else {
					throw new ValorNumericoNegativoException();		
				
			}
		}
		return num;
		}
	}


