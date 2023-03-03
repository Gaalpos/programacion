package cap2;

public class satelite {
	
	//atributos
	private double meridiano;
	private double paralelo;
	private double distancia;

	//constructores
	satelite (double m,double p,double d){
	double meridiano=m;
	double paralelo=p;
	double distancia=d;
	}
	satelite(){
	meridiano=paralelo=distancia=0;
	}

	//setea todos los atributos a la vez
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia= d;
	}

	@Override
	public String toString() {
		return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia=" + distancia + "]";
	}
	
	

}
