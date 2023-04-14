package Capitulo5;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro MiLibro = new Libro(575,25.2f,"El manifiesto negro","Dura","","Frederick Forsyth","Circulo de lectores");
        MiLibro.NombreAutor = "Frederick Forsyth";
        MiLibro.Titulo = "El manifiesto negro";
        MiLibro.Editorial = "Circulo de lectores";
        MiLibro.TipoPortada = "Dura";
        MiLibro.NumeroDePaginas = 575;
        }
}
