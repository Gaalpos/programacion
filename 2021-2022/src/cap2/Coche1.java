package cap2;

/*8. Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí.
Los dos constructores inicializarán los atributos marca y modelo de la clase.
Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
que todo funciona correctamente.*/
public class Coche1 {
	private int velocidad;
	private String marca;
	private String modelo;

	public void setVelocidad(int v) {
		this.velocidad = v;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	Coche1() {// por defecto
		this.velocidad = 0;
		this.marca = "";
		this.modelo = "";
	}

	Coche1(int velo, String mar, String mod) {// con todos los atributos
		this.velocidad = velo;
		this.marca = mar;
		this.modelo = mod;
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

	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
