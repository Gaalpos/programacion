import java.util.List;

public class Cliente {
    int numCliente;
    String nombre;
    String direccion;
    int telefono;
    List <Producto> productosAlquilados;
    public int getNumCliente() {
        return numCliente;
    }
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public List<Producto> getProductosAlquilados() {
        return productosAlquilados;
    }
    public void setProductosAlquilados(List<Producto> productosAlquilados) {
        this.productosAlquilados = productosAlquilados;
    }
    @Override
    public String toString() {
        return "Cliente [numCliente=" + numCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
                + telefono + ", productosAlquilados=" + productosAlquilados + "]";
    }

    
}
