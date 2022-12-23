package ejerciciosCadenas;


public class quickSort {
	
	private static int particion(int arra[], int izquierda, int derecha) {
        // Elegimos el pivote, es el primero
        int pivote = arra[izquierda];
        // Ciclo infinito
        while (true) {
            // Mientras cada elemento desde la izquierda esté en orden (sea menor que el
            // pivote) continúa avanzando el índice
            while (arra[izquierda] < pivote) {
                izquierda++;
            }
            // Mientras cada elemento desde la derecha esté en orden (sea mayor que el
            // pivote) continúa disminuyendo el índice
            while (arra[derecha] > pivote) {
                derecha--;
            }
    /*
    Si la izquierda es mayor o igual que la derecha significa que no
    necesitamos hacer ningún intercambio
    de variables, pues los elementos ya están en orden (al menos en esta
    iteración)
    */
            if (izquierda >= derecha) {
                // Indicar "en dónde nos quedamos" para poder dividir el arreglo de nuevo
                // y ordenar los demás elementos
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
      /*
      Si las variables quedaron "lejos" (es decir, la izquierda no superó ni
      alcanzó a la derecha)
      significa que se detuvieron porque encontraron un valor que no estaba
      en orden, así que lo intercambiamos
      */
                int temporal = arra[izquierda];
                arra[izquierda] = arra[derecha];
                arra[derecha] = temporal;
      /*
      Ya intercambiamos, pero seguimos avanzando los índices una vez más
      */
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }
 
	
	// Divide y vencerás
    private static void quicksort(int arra[], int izquierda, int derecha) {
           
        	if (izquierda < derecha) {
                
            	int pivote = particion(arra, izquierda, derecha);
                
            	quicksort(arra, izquierda, pivote);
                quicksort(arra, pivote + 1, derecha);
            }
        }


    public static void mostrar(int[] paso) {
		System.out.print("Mostrando el array: [");
		for (int i = 0; i < paso.length; i++) {
			System.out.print(paso[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
    
   	public static void main(String[] args) {
		// TODO Auto-generated method stub

   		int[] notas =  {1, 9, 23, 4, 55, 100, 1, 1, 23};
   		System.out.println("array desordenado");
   		mostrar(notas);
   		
   		quicksort(notas,0,notas.length-1);
   		
   		System.out.println("array ordenado");
   		mostrar(notas);
   		
	}

}