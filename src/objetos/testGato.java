package objetos;

public class testGato {

	public static void main(String[] args) {
		
	Gato garfield = new Gato("macho");
	System.out.println("hola gatito");
	garfield.maulla();
	System.out.println("toma tarta");
	garfield.come("tarta selva negra");
	System.out.println("toma pescado, a ver si esto te gusta");
	garfield.come("pescado");
	
	Gato tom = new Gato("macho");
	System.out.println("Tom, toma sopita de verduras");
	tom.come("sopa de verduras");

	Gato lisa = new Gato("hembra");
	System.out.println("gatitos, a ver cómo maulláis");
	garfield.maulla();
	tom.maulla();
	lisa.ronronea();
	
	System.out.println("this es garfield M ---  contrincante es lisa H");
	garfield.peleaCon(lisa);
	System.out.println("this es lisa H ---  contrincante es tom M");
	lisa.peleaCon(tom);
	System.out.println("this es tom M ---  contrincante es garfield M");
	tom.peleaCon(garfield); 
	
	Gato parda = new Gato("hembra");
	System.out.println("this es parda H ---  contrincante es lisa H");
	parda.peleaCon(lisa); 
		
	} 
}
