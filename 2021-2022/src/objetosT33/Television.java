package objetosT33;

public class Television extends Electrodomestico{

	//constantes por defecto
	private final int RES_DEF=20;
	private final boolean SM_DEF=false;
	
	//atributos
	int resolucion; //pulgadas/inches
	boolean smart; //es o no es smartTV
	
	//constructor por defecto
	Television(){
		super();//electrodomestico
		resolucion=RES_DEF;
		smart=SM_DEF;
	}
	
	// contructor con precio y peso
	Television(float pre, float pes){
		super(pre,pes);
		resolucion=RES_DEF;
		smart=SM_DEF;
	}
	
	// contructor con smart y resolucion + atributos heredados
	Television(float pre, float pes, Consumo con, Color col, int res, boolean s){
		super(pre, pes, con, col);
		this.resolucion=res;
		this.smart=s;
	}
	
	@Override
	public float precioFinal() {
		 
		float importe=0;
		//primero calculamos el precio final por ser electrodimestico
		importe+=super.precioFinal();
		//segundo: añade pluses si hace falta por la resolucion y el smart (es un además por parte de television)
		//resolucion mayor de 40 pulgadas -> aumenta 30%
		if(resolucion>40)
			//importe=1*importe+0.3f*importe;
			//importe=1.3f*importe;
			importe*=1.3f;
		// si ES smart, +50euros
		if(smart)
			importe+=50;
		return importe;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSmart() {
		return smart;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", smart=" + smart + ", precio_base=" + precio_base + ", peso="
				+ peso + ", consumo_energetico=" + consumo_energetico + ", color=" + color + "]";
	}

	
	
	
	
	
	
	
}
