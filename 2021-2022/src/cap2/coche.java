package cap2;

//un coche no puede sobrepasar velocidad 120
//un coche no puede ir a velocidad menor que 0
public class coche {
	private int velocidad;

	coche() {
		velocidad = 0;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int v) {
		this.velocidad = v;
	}

	void acelera(int more) {
		if (velocidad + more > 120)
			this.velocidad = 120;
		else
			this.velocidad += more;
	}

	void frena(int less) {
		if (velocidad - less < 0)
			this.velocidad = 0;
		else
			this.velocidad -= less;
	}

	coche(int v) { // por defecto
		this.velocidad = v;
	}

	@Override
	public String toString() {
		return "coche [velocidad=" + velocidad + "]";
	}

}
