package cap2;

/*
 8. Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos constructores inicializarán
los atributos marca y modelo de la clase. Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
que todo funciona correctamente.
 */
//un coche no puede sobrepasar velocidad 120
//un coche no puede ir a velocidad menor que 0
public class coche2 {
	private int velocidad;
	String marca;
	String modelo;

	coche2() {
		velocidad = 0;
		marca="";
		modelo="";
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

	coche2(int v,String marca,String modelo) { // por defecto
		this.velocidad = v;
		this.marca="";
		this.modelo="";
	}

	@Override
	public String toString() {
		return "coche2 [velocidad=" + velocidad + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	
	

	

}

