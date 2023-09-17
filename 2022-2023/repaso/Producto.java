public class Producto {
    String titulo;
    enum tipo {pelicula,videojuego};
    double precio;
    int plazoDias;

    public Producto(){
    }
    

    public Producto(String titulo, double precio, int plazoDias, boolean alquilado) {
        this.titulo = titulo;
        this.precio = precio;
        this.plazoDias = plazoDias;
        this.alquilado = alquilado;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getPlazoDias() {
        return plazoDias;
    }
    public void setPlazoDias(int plazoDias) {
        this.plazoDias = plazoDias;
    }
    public boolean isAlquilado() {
        return alquilado;
    }
    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    boolean alquilado;

    @Override
    public String toString() {
        return "Producto [titulo=" + titulo + ", precio=" + precio + ", plazoDias=" + plazoDias + ", alquilado="
                + alquilado + "]";
    }

    
}