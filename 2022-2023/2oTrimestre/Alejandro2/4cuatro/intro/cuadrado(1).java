package intro;

public class cuadrado implements areaFigura,perimetro{

	
	private int lado;
	public cuadrado(int lado){
		this.lado=lado;
	}
	
	public int area() {
		return lado*lado;
	}
	
	
	
	
}
