package objetosT333;

/*
 *  Sus atributos son titulo, numero de temporadas, entregado, genero y
creador.
 Por defecto, el numero de temporadas es de 3 temporadas y
entregado false. El resto de atributos serán valores por defecto según el
tipo del atributo.
 Los constructores que se implementaran serán:
 Un constructor por defecto.
 Un constructor con el titulo y creador. El resto por defecto.
 Un constructor con todos los atributos, excepto de entregado.
 Los métodos que se implementara serán:
 Métodos get de todos los atributos, excepto de entregado.
 Métodos set de todos los atributos, excepto de entregado.
 Sobrescribe los métodos toString.
 */
public class Serie implements Entregable {

	private final int TEMP_DEF = 3;
	private final boolean ENTREGADO_DEF = false;

	String titulo;
	int temp;
	boolean entregado;
	String genero;
	String creador;

	/*
	 * -  Un constructor por defecto. 
	 * - Un constructor con el titulo y creador. El resto por defecto. 
	 * -  Un constructor con todos los atributos, excepto de entregado.
	 */
	Serie(){
		temp=TEMP_DEF;
		entregado=ENTREGADO_DEF;
	}
	
	Serie(String t, String c){
		titulo=t;
		temp=TEMP_DEF;
		entregado=ENTREGADO_DEF;
		creador=c;
	}
	
	Serie(String t,int te,String g, String c){
		titulo=t;
		temp=te;
		entregado=ENTREGADO_DEF;
		genero=g;
		creador=c;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temp=" + temp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
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
		Serie s = (Serie) obj;
		return this.temp -s.getTemp();
	}
	
}
