package pqIssProject;

import java.util.*;

public class Sistema {
	private Usuario usuarioActivo;
	private SortedMap<String, Usuario> usuarios;
	private LinkedList<Compañia> compañias;
	
	
	public Sistema() {
		super();
		usuarios = new TreeMap<String, Usuario>();
		usuarioActivo = null;
		//usuarios.put("ADMIN", new Usuario("ADMIN"));
	}
	public void iniciarSesion(String email, String pswd) {
		Usuario usr  = new Usuario(email, pswd);
		if(usuarios.get(usr.getEmail().toUpperCase())== null) {
			if(pswd.equals(usuarios.get(email).getContrasena())) {
				usuarioActivo = usr;
			}else {
				throw new AppException("Contraseña no valida");
			}
		}else {
			throw new AppException("Usuario 404");
		}
	}
	public void registrar(String email, String pswd, String nombre) {
		if(usuarios.get(email.toUpperCase())!= null) {
			throw new AppException("Email ya registrado");
		}else {
			usuarios.put(email.toUpperCase(), new Usuario(nombre, email, pswd));
		}
	}
	public void logout() {
		usuarioActivo = null;
	}
	public boolean comprobarSesion() {
		boolean res = false;
		if((usuarioActivo.getEmail() != null)||(usuarioActivo.getEmail().length()!=0)) {
			res = true;
		}
		return res;
	}
	
}
