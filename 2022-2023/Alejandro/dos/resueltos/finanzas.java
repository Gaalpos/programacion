package resueltos;


public class finanzas {
	
	final static double CAMBIO_POR_DEFECTO=1.36;
	
	double cambio;
	public  double euroADolar(double e) {
		double d =e/cambio;
		return d;

	}

	public  double dolarAEuro(double d) {
	double e=d*cambio;
	return e;
	}
	
	finanzas(){
		this.cambio=CAMBIO_POR_DEFECTO;
	}
	

	finanzas(double c){
		this.cambio=c;
	}

	@Override
	public String toString() {
		return "finanzas [cambio=" + cambio + "]";
	}
	
	
	
	
	
	




		
	
	
}