package resueltos;

public class ejercicio_rango_random {

		
			public static int getNumero(){
				//queremos nºs entre 127 y 318 AMBOS INCLUIDOS
				int numero=0;
				
				numero =(int) (127+Math.random()*  (  (318 +1)-127 )   );    //nº donde emieza+Math.random()*(nº donde acaba+1)-nº donde empieza)
			return numero;
			}
				

			public static void main(String[] args) {
		
			// Llamamos 6 veces al método obteniendo 6 números enteros
				
				//bucle de repetición de un número conocido de veces
				for(int i=0;i<100;i++) {
			System.out.println("generando: "+getNumero());
			
			}

			}}