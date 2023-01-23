package varios;

public class ejercicio69 {

	
	public static int arrayPotencia(int numPotencias) {
		
		int[] potencias = new int[numPotencias];
		for(int i = 0, potencia=1; i<potencias.length;i++,  potencia *=2) {
			potencias[i] = potencia;
			
		}
		return numPotencias;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
	
}
