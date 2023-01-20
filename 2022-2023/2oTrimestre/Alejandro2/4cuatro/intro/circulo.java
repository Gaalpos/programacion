package intro;

public class circulo extends figura implements areaFigura, perimetroFigura{
	
	final static double PI=3.1416;
	int radio;
	
	circulo(int radio){
		this.radio=radio;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	public void setRadio(int r) {
		this.radio=r;
	}

	@Override
	public String toString() {
		return "circulo [radio=" + radio + "]";
	}
	
	@Override
	public int area() {
		
		return (int) PI*radio*radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (int) 2*PI*radio;
	}

	
	
}
