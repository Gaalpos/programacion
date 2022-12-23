package ejerciciosCadenas;

public class quickSortF {
	
	private static int particion(int arra[], int izquierda, int derecha) {
        // Elegimos el pivote, es el primero
        int pivote = arra[izquierda];
        // Ciclo infinito
        while (true) {
            
            while (arra[izquierda] < pivote) {
                izquierda++;
            }
           
            while (arra[derecha] > pivote) {
                derecha--;
            }
   
            if (izquierda >= derecha) {
               
                return derecha;
            } else {
     
                int temporal = arra[izquierda];
                arra[izquierda] = arra[derecha];
                arra[derecha] = temporal;
     
                izquierda++;
                derecha--;
            }
  
        }
    }
     
	
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