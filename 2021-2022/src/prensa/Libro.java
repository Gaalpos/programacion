package prensa;

public class Libro extends Publicacion {

	protected String Titulo;
	protected String TipoPortada;
	protected String ISBN;
	protected String nombreAutor;
	protected String Editorial;

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getTipoPortada() {
		return TipoPortada;
	}

	public void setTipoPortada(String tipoPortada) {
		TipoPortada = tipoPortada;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		this.Editorial = editorial;
	}

	
	//constructor defecto
	Libro(){
		super();
		 Titulo=null;
		 TipoPortada=null;
		 ISBN=null;
		 nombreAutor=null;
		 Editorial=null;
	}
	
	//constructor completo para Publicacion
	Libro(int paginas, float precio){
		super(paginas,precio);
	}
	
	
	Libro (int paginas, float precio, String tit, String por, String isbn, String aut, String edi){
		this(paginas,precio );
		setTitulo(tit);
		setTipoPortada(por);
		setISBN(isbn);
		setNombreAutor(aut);
		setEditorial(edi);
	}

	@Override
	public String toString() {
		return "Libro [Titulo=" + Titulo + ", TipoPortada=" + TipoPortada + ", ISBN=" + ISBN + ", nombreAutor="
				+ nombreAutor + ", Editorial=" + Editorial + "]";
	}
	
	
	
}
