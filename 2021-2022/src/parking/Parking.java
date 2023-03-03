package parking;

public class Parking {

	private int capacidad;
	private int huecos;
	
	Parking(int capacidad){
		this.capacidad=capacidad;
		this.huecos=capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getHuecos() {
		return huecos;
	}

	@Override
	public String toString() {
		return "Parking [capacidad=" + capacidad + ", huecos=" + huecos + "]";
	}
	
	// metodo meter
		public void meter() {
			if (huecos > 0) {
				huecos--;
				System.out.println(this.toString());
			} else
				System.out.println("no hay sitio en este parking");
		}

		// metodo sacar

		public void sacar() {
			if (huecos < capacidad) {
				huecos++;
				System.out.println(this.toString());
			} else
				System.out.println("el parking está vacío");
		}
	
	
}
