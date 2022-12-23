package cap2;

public class sateliteR {

	// atributos
	private double meridiano;
	private double paralelo;
	private double distancia;

	// constructores
	sateliteR(double m, double p, double d) {
		double meridiano = m;
		double paralelo = p;
		double distancia = d;
	}

	sateliteR() {
		meridiano = paralelo = distancia = 0;
	}

	// setea todos los atributos a la vez
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia = d;
	}

	@Override
	public String toString() {
		return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia=" + distancia + "]";
	}

	public void variaAltura(double desplazamiento) {
		this.distancia += desplazamiento;

	};

	public void variaPosicion(double variap, double variam) {
		this.paralelo += variap;
		this.paralelo += variam;

	};

	public boolean enOrbita() {

		return (distancia > 0);

	};

	public void variaCoordenadas(double p, double m, double d){
		variaAltura(d);
		variaPosicion(p,m);
}
}
