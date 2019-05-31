package pqIssProject;

import java.util.LinkedList;

public class Tarifa extends Producto{
	private int permanencia;
	public Comentario comentarioTemporal;
	private LinkedList<Comentario> comentarios = new LinkedList<Comentario>();
	public Tarifa() {
		super();
		int suma = 0;
		for(int i =0; i<comentarios.size();i++) {
			suma += comentarios.get(i).getPuntuacion();
		}
		puntuacionMedia = suma/comentarios.size();
	}
	public String mostrarComentarios() {
		String str = "";
		for(int i=0;i<comentarios.size();i++) {
			str += comentarios.get(i).toString() + "\n";
		}
		return str;
	}
	public void almacenarComentario(Comentario coment) {
		//Crea una variable temporal para comprobar que el usuario esta logueado antes de publicar el comentario
		comentarioTemporal = coment;
	}
	protected void añadirComentario(Comentario coment) {
		comentarios.add(coment);
	}
	
}
