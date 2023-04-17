package Capitulo5.Ejemplo1;

public class Libro extends Publicacion{
    public String Titulo;
    public String TipoPortada;
    public String ISBN;
    public String NombreAutor;
    public String Editorial;

    public Libro(int numeroDePaginas, float precio, String titulo, String tipoPortada, String iSBN, String nombreAutor,
            String editorial) {
        super(numeroDePaginas, precio);
        Titulo = titulo;
        TipoPortada = tipoPortada;
        ISBN = iSBN;
        NombreAutor = nombreAutor;
        Editorial = editorial;
    }
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
        return NombreAutor;
    }
    public void setNombreAutor(String nombreAutor) {
        NombreAutor = nombreAutor;
    }
    public String getEditorial() {
        return Editorial;
    }
    public void setEditorial(String editorial) {
        Editorial = editorial;
    }
    @Override
    public String toString() {
        return "Libro [Titulo=" + Titulo + ", TipoPortada=" + TipoPortada + ", ISBN=" + ISBN + ", NombreAutor="
                + NombreAutor + ", Editorial=" + Editorial + "]";
    }
   

    
}
