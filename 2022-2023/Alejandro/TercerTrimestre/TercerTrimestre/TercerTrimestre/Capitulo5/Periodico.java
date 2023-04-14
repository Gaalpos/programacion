package Capitulo5;

public class Periodico extends Publicacion{
    public String Nombre;
public String Fecha;


public Periodico(){
    super();
}


public Periodico(int numeroDePaginas, float precio, String nombre, String fecha) {
    super(numeroDePaginas, precio);
    Nombre = nombre;
    Fecha = fecha;
}


}
