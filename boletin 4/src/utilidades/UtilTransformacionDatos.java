package utilidades;
import java.util.Scanner;
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


}
