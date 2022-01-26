package ordenar;

//Burbuja bidireccional
public class burbujaBidireccional {
	
	public static int []genera(int size) {
		
		int [] alea=new int[size];
		for(int i=0;i<alea.length;i++) {
			alea[i]=(int) (Math.random()*10);
		}
		return alea;
	}
	
	public static void mostrar(int[] original) {
		System.out.print("[ ");
		for (int i = 0; i < original.length; i++)
			System.out.print(original[i] + " ");
		System.out.println("]");
	}

	public static int [] burbujaBi(int array[]) {
		
		int izq = 0;
		int der = array.length - 1;
		int aux;
		int ultimo = array.length - 1;

		do {
			// bucle descentente
			for (int i = izq; i < der; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					ultimo = i;
				}
			}

			// actualiza la posicion alcanzada en esa pasada del for
			der = ultimo;
			for (int j = der; j > izq; j--) {
				if (array[j - 1] > array[j]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
					ultimo = j;
				}
			}
			// actualiza la posicion alcanzada en esa pasada del for
			izq = ultimo;
		} while (izq < der);
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] test=genera(100);
		mostrar(test);
		burbujaBi(test);
		mostrar(test);
	}
}
