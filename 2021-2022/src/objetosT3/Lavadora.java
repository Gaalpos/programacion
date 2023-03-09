package objetosT3;

public class Lavadora extends ElectrodomesticoG {

	private final int CARGA_DEF=5;
	int carga;
	
	//constructor por defecto
	
	Lavadora(){
		super(); //electrodomestico
		carga=CARGA_DEF;
	}
	
	//contructor con precio y peso; el resto por defecto
	
	Lavadora(float pre, float pes){
		super(pre, pes); // mismo orden que en electrodomestico
		carga=CARGA_DEF;
	}
	
	//constructor con carga y resto de atributos heredados
	Lavadora(float pre, float pes, Consumo con, Color col, int car){
		super(pre, pes, con, col); // de electrodomestico
		carga=car;
	}

	
	

	/*precioFinal()
	 * carga mayor de 30 - se incrementa 50€
	 * sino, no se incrementa al precio
	 * */
	
	public int getCarga() {
		return carga;
	}
		

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precio_base=" + precio_base + ", peso=" + peso + ", consumo_energetico="
				+ consumo_energetico + ", color=" + color + "]";
	}

	@Override
	public float precioFinal() {
		 
		float importe=0;
		//primero calculamos el precio final por ser electrodimestico
		importe+=super.precioFinal();
		//segundo: añade pluses si hace falta por la carga (es un además por parte de lavadora)
		if(carga>30)
			importe+=50;
		return importe;
	}
	
	
	
}
