package utilidades;
import java.io.IOException;
public class UtilTransformacionDatos {

	public static boolean esValorNumerico(String valor) {
		try {
			int num = Integer.parseInt(valor);
			return true;
		}

		catch(NumberFormatException ex) {
			return false;
		}	
	}
	
	public static double obtenerValorDouble(String valor) throws NumberFormatException{
		double doble = Double.parseDouble(valor);
		
		return doble;
	}
}