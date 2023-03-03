package intro;

public class testFiguras {

	public static void main(String[] args) {
		
		cuadrado c = new cuadrado(8);
		System.out.println(c.toString());
		System.out.println("area: "+c.area());
		
		circulo o = new circulo(3);
		System.out.println(o.toString());
		System.out.println("perimetro: "+c.perimetro());
		
		triangulo t= new triangulo(5, 10);
		System.out.println(t.toString());
		System.out.println("area: "+t.area());
		
		rectangulo r = new rectangulo(3, 4, "");
		System.out.println(r.toString());
		System.out.println("area: "+r.perimetro());
		System.out.println("perimetro: "+r.perimetro());
		
		
		
	}
	
}
