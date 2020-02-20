package utilidades;

public class mainBoletin4 {

	public static void main(String[] args) {
		String entero="c";
		if(UtilTransformacionDatos.esValorNumerico(entero))
			System.out.println("Es numerico");
		else
			System.out.println("No es numerico");
		
		String doble="c";
		
		try {
			double b=UtilTransformacionDatos.obtenerValorDouble(doble);
			System.out.println("Es doble");
		}catch(NumberFormatException exc)
		{
			System.out.println("No es doble");
		}
		try {
			int numero=2;
			int num=UtilObtencionDatos.obtenerValorNumerico(numero);
		}
		catch(ValorNumericoNegativoException ex){
			System.out.println(ex.getMessage());
		}
			
		
		
			

	}

}