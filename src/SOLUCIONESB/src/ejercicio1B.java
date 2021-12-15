import java.util.Scanner;

/*Ejercicio 1B Método que introduzca el peso en Kg de una persona y
la convierta a piedras y libras.
1 stone (st) = 14 lb = 6,35 kg
1 libra (lb) = 0,453 kg */

public class ejercicio1B {

	 public static void kiligramosAPiedrasyPulgadas(double kg) {
	        double stone = (int) (kg / 6.35);
	        double libra = (int)((kg % 6.35/0.453));
  	        System.out.println(stone+ " st " +libra+ " lb");
	    }

	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Introduce el peso en kg: ");
	        double kg=sc.nextDouble(); 
	        kiligramosAPiedrasyPulgadas(kg);
	    }
	
}
