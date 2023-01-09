package resueltos;

public class ejercicio1 {

		
			public static int getNumero(){
				
				int numero=0;
				
				return (int) (1+Math.random()*(49 +1)-1 );}		
			//return (int) (Math.random()*49 +1 );}
				

			public static void main(String[] args) {
		
			// Llamamos 6 veces al método obteniendo 6 números enteros
			System.out.println("generando: "+	getNumero());
			System.out.println("generando: "+	getNumero());
			System.out.println("generando: "+	getNumero());
			System.out.println("generando: "+	getNumero());
			System.out.println("generando: "+	getNumero());
			System.out.println("generando: "+	getNumero());
			}
}
			