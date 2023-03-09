package poo23.ejemplo1;

public class VehiculoAlquilado {
	
	//atributos
	private Cliente cliente;
	private Vehiculo vehiculo;
	
	//atributos int
	private int diaAlquiler;
	private int mesAlquiler;
	private int añoAlquiler;
	private int totalDiasAlquiler;

	public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler,
			int totalDiasAlquiler) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.diaAlquiler = diaAlquiler;
		this.mesAlquiler = mesAlquiler;
		this.añoAlquiler = añoAlquiler;
		this.totalDiasAlquiler = totalDiasAlquiler;
	}

	// los métodos ‘get’ de los atributos de tipo objeto
	// Cliente y Vehiculo
	public Cliente getCliente() {
		return this.cliente;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public int getAñoAlquiler() {
        return añoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado [cliente=" + cliente + ", vehiculo=" + vehiculo + ", diaAlquiler=" + diaAlquiler
                + ", mesAlquiler=" + mesAlquiler + ", añoAlquiler=" + añoAlquiler + ", totalDiasAlquiler="
                + totalDiasAlquiler + "]";
    }

    
    
}
