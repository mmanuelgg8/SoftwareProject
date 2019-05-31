package pqIssProject;

import java.util.SortedMap;

public class Usuario_prueba {
	private String nombre;
	private String email;
	private String contrasena;
	private String[] registrados=new String[100];
	private static int cont = 0;// controla la posicion de registrados
	private SortedMap<String, Usuario> usuarios;
	public Usuario_prueba() {
		super();
	}
	public Usuario_prueba(String email, String contrasena){
		super();
		this.email = email;
		this.contrasena = contrasena;
		if((email == null)|| (email.length() == 0)) {
			throw new AppException("Email no valido");
		}
		if((contrasena == null)||(contrasena.length() ==0)) {
			throw new AppException("Obligatorio introducir contraseña");
		}
	}
	public Usuario_prueba(String nombre, String email, String contrasena) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		if((email == null)|| (email.length() == 0)) {
			throw new AppException("Email no valido");
		}
		if((contrasena == null)||(contrasena.length() ==0)) {
			throw new AppException("Obligatorio introducir contraseña");
		}
		if((nombre == null)||(nombre.length() ==0)) {
			throw new AppException("Nombre, por favor");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void iniciarSesion() throws AppException{
		int i = 0;
		boolean encontrado = false;
		while(i<cont && !encontrado) {
			if(registrados[i].equalsIgnoreCase(email)) encontrado = true;
			else i++;
			
		}
		if(!encontrado) throw new AppException("Usuario no registrado");
	//	Usuario_prueba usr  = new Usuario_prueba(email, pswd);
		/*if(e null) {
			if(pswd.equals(usuarios.get(email).getContrasena())) {
				usuarioActivo = usr;
			}else {
				throw new AppException("Contraseña no valida");
			}
		}else {
			throw new AppException("Usuario 404");
		}
	*/	
	}
	
	public void registrar() {
		int i = 0;
		boolean encontrado = false;
		while(i<cont && !encontrado) {
			if(registrados[i].equalsIgnoreCase(email)) encontrado = true;
			else i++;
			
		}
		if(!encontrado) {
			registrados[cont] = email;
			cont++;
		}else {
			throw new AppException("Usuario existente");
		}
		
	}

}
