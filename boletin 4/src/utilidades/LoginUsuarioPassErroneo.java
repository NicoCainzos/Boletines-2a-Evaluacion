package utilidades;

public class LoginUsuarioPassErroneo extends IllegalArgumentException {
	public LoginUsuarioPassErroneo(Usuario pw) {
		super("La contraseña introducida para el usuario XXX es errónea"+pw.nombre);
	}

}
