package poo23;

public class Vehiculo {
    private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double tarifa;
	private boolean disponible;

	public Vehiculo(String matricula, String marca, String modelo, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa = 0.0;
		this.disponible = false;
	}

	public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa = tarifa;
		this.disponible = false;
	}

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
                + ", tarifa=" + tarifa + ", disponible=" + disponible + "]";
    }
    

    
}
