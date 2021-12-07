package cap2;

public class finanzas {
	
	//atributo
	//siempre dolares por euros
	double cambio;
	
	finanzas(){
	this.cambio=1.36;

}

	finanzas (double c){
		this.cambio=c;
	}
	
	public double dolaresToEuros (double d) {
		//ojo el cambio ya lo tienes ---> usalo >>>> 1000/1,36 =736
		return d/cambio;
	}
	public double eurosToDolares (double e) {
		//ojo el cambio ya lo tienes ---> usalo  >>>> 1000*1,36= 1260
		return e*cambio;

	}

	@Override
	public String toString() {
		return "finanzas [cambio=" + cambio + "]";
	}
}