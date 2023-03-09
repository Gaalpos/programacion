package objetosT3;

public class ElectrodomesticoG {

	//COnstantes
	protected final float PRECIO_BASE_DEF=100;
	protected final float PESO_DEF=5;
	protected final Color COLOR_DEF=Color.blanco;
	protected final Consumo CONSUMO_DEF=Consumo.F;
	
	//atributos
	protected float precio_base;
	protected float peso;
	protected Consumo consumo_energetico;
	protected Color color;
	
	
	//enumerados internos
	public enum Consumo{A,B,C,D,E,F};
	public enum Color {blanco, negro, rojo, azul, gris};
	
	//Un constructor por defecto
	ElectrodomesticoG(){
		this.peso=PESO_DEF;
		this.precio_base=PRECIO_BASE_DEF;
		this.consumo_energetico=CONSUMO_DEF;
		this.color=COLOR_DEF;
	}
	
	ElectrodomesticoG(float precio, float peso){
		this.peso=peso;
		this.precio_base=precio;
		this.consumo_energetico=CONSUMO_DEF;
		this.color=COLOR_DEF;
	}
	
	ElectrodomesticoG(float precio, float peso, Consumo con, Color col){
		this.peso=peso;
		this.precio_base=precio;
		this.consumo_energetico=con;
		this.color=col;
	}
	

}
