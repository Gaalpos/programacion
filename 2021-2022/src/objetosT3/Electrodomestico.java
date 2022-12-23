package objetosT3;

public class Electrodomestico {

	//constantes
	protected final float PRECIO_BASE_DEF=100;
	protected final float PESO_DEF=5;
	protected final Color COLOR_DEFECTO=Color.BLANCO;
	protected final Consumo CONSUMO_DEFECTO=Consumo.F;
	
	
	//atributos
	protected float precio_base;
	protected float peso;
	protected Consumo consumo_energetico;
	protected Color color;
	
	
	
	//enumerados internos
	public enum Consumo{A,B,C,D,E,F}
	public enum Color{BLANCO, NEGRO, ROJO, AZUL, GRIS}
	
	
	//constructor por defecto
	Electrodomestico(){
		this.peso=PESO_DEF;
		this.precio_base=PRECIO_BASE_DEF;
		this.consumo_energetico=CONSUMO_DEFECTO;
		this.color=COLOR_DEFECTO;
	}
	
	//contrusctor con el precio y peso; el resto por defecto
	Electrodomestico(float precio, float peso){
		this.peso=peso;
		this.precio_base=precio;
		this.consumo_energetico=CONSUMO_DEFECTO;
		this.color=COLOR_DEFECTO;
	}
	
	//constructor con todos los atributos
	Electrodomestico(float precio, float peso, Consumo con, Color col){
		this.peso=peso;
		this.precio_base=precio;
		this.consumo_energetico=con;
		this.color=col;
	}
	
	// precioFinal() -- segun el consumo energetico, aumentará el precio, y según su peso también
	/*Lista de precios por consumo
	 * A - 100€, B - 80€, C - 60, D - 50, E - 30, F - 10
	 * Lista de precios por peso
	 * Entre 0 y 19 - 10€
	 * Entre 20 y 49 - 50€
	 * Entre 50 y 79 - 80€
	 * Mayor que 80 - 100€
	 * */
	public float precioFinal() {
		
		float importe=0;
		importe=precio_base;
		
		switch(consumo_energetico) {
		case A:
			importe+=100;
			break;
		case B:
			importe+=80;
			break;
		case C:
			importe+=60;
			break;
		case D:
			importe+=50;
			break;
		case E:
			importe+=30;
			break;
		case F:
			importe+=10;
			break;
		} 
		
		if(peso<20)
			importe+=10;
		else if(peso<50)
			importe+=50;
		else if(peso<80)
			importe+=80;
		else
			importe+=100;
		
		
		return importe;
		
	}

	public float getPrecio_base() {
		return precio_base;
	}

	public float getPeso() {
		return peso;
	}

	public Consumo getConsumo_energetico() {
		return consumo_energetico;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", peso=" + peso + ", consumo_energetico="
				+ consumo_energetico + ", color=" + color + "]";
	}
	
	
	
	//metodo comprobarConsumoEnergetico(char letra) -- comprobar si la letra es correcta, sino se usará la de por defecto
	//se invocara al crear el objeto y será no visible
	
	//metodo comprobarColor(String color) -- comprobar si el color es correcto, sino se usará el de por defecto.
	//se invocara al crear el objeto y será no visible
	
	
	
}
