package pqIssProject;

public class Usuario {
	private String nombre;
	private String email;
	private String contrasena;
	public Usuario() {
		super();
	}
	public Usuario(String email, String contrasena){
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
	public Usuario(String nombre, String email, String contrasena) {
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
	
}
