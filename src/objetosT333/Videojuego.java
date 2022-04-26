package objetosT333;
/*
 * Sus atributos son titulo, horas estimadas, entregado, genero y
compañia.
 Por defecto, las horas estimadas serán de 10 horas y entregado false. El
resto de atributos serán valores por defecto según el tipo del atributo.
 Los constructores que se implementaran serán:
 Un constructor por defecto.
 Un constructor con el titulo y horas estimadas. El resto por defecto.
 Un constructor con todos los atributos, excepto de entregado.
 Los métodos que se implementara serán:
 Métodos get de todos los atributos, excepto de entregado.
 Métodos set de todos los atributos, excepto de entregado.
 Sobrescribe los métodos toString.
 */

public class Videojuego implements Entregable{
	
	private final int HORAS_DEF=10;
	private final boolean ENTREGAD_DEF=false;
	String titulo;
	int horas;
	boolean entregado;
	String genero;
	String compañia;
	

	public Videojuego() {
		horas=HORAS_DEF;
		entregado=ENTREGAD_DEF;
	}
	
	public Videojuego(String t,int h) {
		titulo=t;
		horas=h;
		entregado=ENTREGAD_DEF;
	}
	public Videojuego(String t, int h, String g,String c) {
		 titulo=t;
		 horas=HORAS_DEF;
		 genero=g;
		 compañia=c;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", genero=" + genero + ", compañia=" + compañia
				+ "]";
	}
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		entregado=true;
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		entregado=false;
	}
	@Override
	public boolean isEentregado() {
		// TODO Auto-generated method stub
		return entregado;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Videojuego s = (Videojuego) obj;
		return this.horas -s.getHoras();
	}
	
}
