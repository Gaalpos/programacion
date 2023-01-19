package ejemplos;

public class testRectangulo {

	public static void main(String[] args) {
		rectangulo otro= null;
		rectangulo r1= new rectangulo(8,10,"rect1");
		System.out.println("r1: "+r1.toString());
		
		otro=r1.inrementarAlto();
		System.out.println("Son r1 y otro el mismo objeto????????????????: "+r1.equals(otro));
		
	System.out.println("r1: "+r1.toString());
	System.out.println("otro: "+otro.toString());
	
	
	otro.inrementarAncho();
	System.out.println("r1: "+r1.toString());
	System.out.println("otro: "+otro.toString());
	
	
	System.out.println("r1: "+r1.hashCode());
	System.out.println("otro: "+otro.hashCode());
	
	//voy a probar el método clone
	rectangulo clo= (rectangulo)(r1.clone());
	clo.inrementarAlto();
	clo.inrementarAncho();
	System.out.println("clo: "+clo.toString());
	System.out.println("r1: "+r1.toString());
	System.out.println("son r1 y clo el mismo objeto?????: "+r1.equals(clo));
	
	
	System.out.println("r1: "+r1.hashCode());
	System.out.println("clo: "+clo.hashCode());
	
	
		
	}
	
	
}
