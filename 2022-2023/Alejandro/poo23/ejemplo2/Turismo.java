package poo23.ejemplo2;

public class Turismo extends Vehiculo{
    
    private int puertas;
	private boolean marchaAutomatica;

	//para construit un turismo hay que crear PRIMERO un vehiculo es lo que hace super
	public Turismo(String matricula, String marca, String modelo, String color, double tarifa, int puertas,
			boolean marchaAutomatica) {
		//crea primero
		super(matricula, marca, modelo, color, tarifa);
		this.puertas = puertas;
		this.marchaAutomatica = marchaAutomatica;
	}

	// métodos ‘get’ de la subclase Turismo
	public int getPuertas() {
		return this.puertas;
	}

	public boolean getMarchaAutomatica() {
		return this.marchaAutomatica;
	}

	@Override
	public String toString() {
		return "Turismo [puertas=" + puertas + ", marchaAutomatica=" + marchaAutomatica + "]";
	}

}
