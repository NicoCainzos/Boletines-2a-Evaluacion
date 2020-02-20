package utilidades;

public class UtilLogueo {
	public static Usuario realizarLogin(Usuario a) {
		Usuario[] arrayUsuarios= {
				new Usuario("fer1", "123456"),
				new Usuario("luis86", "000000"),
				new Usuario("ana_cps2002", "AzLmR56"),
				new Usuario("MariaFernandez", "655786995"),
				new Usuario("JZm46Y", "zxcvbnm"),
				new Usuario("___121aZ", "qwerty"),
				new Usuario("M.Rajoy", "password"),
				new Usuario("", "666666"),
				};
		boolean encontroUsu=false;
		for(Usuario i:arrayUsuarios) {
			if(i.nombre.equals(a.nombre)) {
				encontroUsu=true;
				if(i.password.equals(a.password)) {
					//return a;
				}
				else {
					throw new LoginUsuarioPassErroneo(a);
				}
				
			}
			
			
		}
		
		if(!encontroUsu) {
			throw new LoginUsuarioNoExistente(a);
		}
		return a;
		
		
	}
}


