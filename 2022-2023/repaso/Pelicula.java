
public class Pelicula extends Producto {
     enum Genero {accion, fantastica, drama, aventuras, puzzle, infantil};

     private Genero genero;
     int year;
     String director;
     String interpretes;



    public Pelicula(Pelicula.Genero genero, int year, String director, String interpretes) {
        this.genero = genero;
        this.year = year;
        this.director = director;
        this.interpretes = interpretes;
    }
    public Pelicula(String titulo, double precio, int plazoDias, boolean alquilado, Pelicula.Genero genero, int year,
            String director, String interpretes) {
        super(titulo, precio, plazoDias, alquilado);
        this.genero = genero;
        this.year = year;
        this.director = director;
        this.interpretes = interpretes;
    }
     
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getInterpretes() {
        return interpretes;
    }
    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }
    @Override
    public String toString() {
        return "Pelicula [genero=" + genero + ", year=" + year + ", director=" + director + ", interpretes="
                + interpretes + "]";
    }

     



}
