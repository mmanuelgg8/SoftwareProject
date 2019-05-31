package pqIssProject;

public class Comentario {
	private String opinion;
	private int puntuacion;
	public Comentario(String opinion, int puntuacion) {
		super();
		this.opinion = opinion;
		this.puntuacion = puntuacion;
		if((opinion == null)|| (opinion.length() == 0)) {
			throw new AppException("Es obligatorio introducir un comentario");
		}
		if((puntuacion<0)|| (puntuacion>5)) {
			throw new AppException("Puntuacion no valida");
		}
	}
	public String getOpinion() {
		return opinion;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public Comentario getComentario(Comentario coment) {
		return coment;
	}
	public void publicarComentario(Tarifa tar, Comentario Com) {
		//almacena el comentario en la lista de comentarios almacenada en tarifa
		tar.a�adirComentario(Com);
	}
	public String toString() {
		return "Puntuacion: "+ puntuacion + "\n"+ "Opinion: "+ opinion;
	}
}
