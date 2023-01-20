package intro;

public class triangulo extends figura implements areaFigura {

	double altura;
	double base;
	
	triangulo(double altura, double base){
		this.altura=altura;
		this.base=base;
	}

	
	public double getAltura() {
		return altura;
	}

	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public double getBase() {
		return base;
	}

	
	public void setBase(double base) {
		this.base = base;
	}


	@Override
	public String toString() {
		return "triangulo [altura=" + altura + ", base=" + base + "]";
	}
	
	public int area() {
		return (int) (this.base*this.altura)/2;
	}
	
	
	
}
