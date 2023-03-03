package resueltos;

import java.util.Scanner;

/*7. Crea una clase con un método millasAMetros() que toma como parámetro de entrada un valor en millas marinas
y las convierte a metros.
Una vez tengas este método escribe otro millasAKilometros() que realice la misma conversión, pero esta vez
exprese el resultado en kilómetros.
Nota: 1 milla marina equivale a 1852 metros.*/

public class propuesto7 {
	public static double millasAMetros(double millas)
	{
	return millas*1852;
	}
	public static double millasAKilometros(double millas)
	{
		return millasAMetros(millas)/1000;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	double aux;
		System.out.println("Introduzca millas: ");
		aux=sc.nextDouble();
		System.out.println("En metros da: "+millasAMetros(aux));
		System.out.println("En kilometros da: "+millasAMetros(aux));
		
		
		
		
		 
		
		    

	
}
	

}
