package utilidades;

public class LoginUsuarioPassErroneo extends IllegalArgumentException {
	public LoginUsuarioPassErroneo(Usuario pw) {
		super("La contrase�a introducida para el usuario XXX es err�nea"+pw.nombre);
	}

}
