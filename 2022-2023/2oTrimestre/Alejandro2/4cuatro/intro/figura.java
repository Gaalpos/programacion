package intro;

public class figura {

	double area;
	double perimetro;
	String color;
	
	figura(){
		
	}
	
	figura(double area, double perimetro, String color){
	this.area=area;
	this.perimetro=perimetro;
	this.color=color;
	}

	@Override
	public String toString() {
		return "figura [area=" + area + ", perimetro=" + perimetro + ",color="+ "]";
	}
}
