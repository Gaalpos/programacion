package intro;

public class cuadrado implements areaFigura, perimetroFigura{

private int lado;
	
public void cuadro(int lado) {
		
		this.lado=lado;
	}
	
	
	public int getLado() {
		return lado;
	}

	
	public void setLado(int lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "cuadrado [lado=" + lado + "]";
	}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
