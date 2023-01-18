package ejemplos;

public class cuadrado {
	
	private int lado;
	public cuadrado(int lado) {
		
		this.lado=lado;
		
	}
	
	public int getArea() {
		return lado*lado;
	}
	
	public static void main(String[] args) {
		
		cuadrado c1 = new cuadrado(5);
		System.out.println("su area es: "+c1.getArea());
	}

}
