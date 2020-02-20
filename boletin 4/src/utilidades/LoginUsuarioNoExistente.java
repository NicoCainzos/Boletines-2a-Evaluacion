package utilidades;

public class LoginUsuarioNoExistente extends IllegalArgumentException {
	public LoginUsuarioNoExistente(Usuario u1) {
		super("No se ha encontrado al usuario "+u1.nombre);
	}
	

}
