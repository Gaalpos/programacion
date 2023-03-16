package poo23.ejemplo1;

public class Cliente {
    private String nif;
	private String nombre;
	private String apellidos;

	// se omiten los métodos ‘get’ y ‘set’ de la clase
	public Cliente(String nif, String nombre, String apellidos) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

    public String getNif() {

        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Cliente [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }

    
}
