package Capitulo5;

public class Publicacion {
    public int NumeroDePaginas;
 public float Precio;

 public Publicacion(){
    this.NumeroDePaginas=0;
    this.Precio=0;
 }

public Publicacion(int numeroDePaginas, float precio) {
    NumeroDePaginas = numeroDePaginas;
    Precio = precio;
}
public int getNumeroDePaginas() {
    return NumeroDePaginas;
}
public void setNumeroDePaginas(int numeroDePaginas) {
    NumeroDePaginas = numeroDePaginas;
}
public float getPrecio() {
    return Precio;
}
public void setPrecio(float precio) {
    Precio = precio;
}
 
}

