package varios;

import java.util.Arrays;

public class ordenamientos {
<<<<<<< HEAD
	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 6, 7, 5, 3, 5, 6, 7, 8, 3, 3, 5 };

=======
<<<<<<< HEAD
   public static void main(String[] args) {
    
    int[] arr={1,2,5,6,7,8,2,3,4,5,6,7,8,9,2,3,4,6,0};

    System.out.println(Arrays.toString(arr));

    qSort(arr);

    System.out.println(Arrays.toString(arr));
   }


   //entrada del array completo al metodo quicksort

   public static void qSort(int items[]){
    qs(items, 0 ,items.length-1);
   } 

   //version recursiva del metodo


   private static void qs(int[] items, int left, int right){
    int i,j;
    int x,y;
    i=left;
    j=right;
    x=items[(left+right)/2];

    do{
        while ((items[i]<x)&&(i<right)) {
            i++;
        }
        while ((x<items[j])&&(j>left) ) {
            j--;
        }
if (i<=j) {
    y=items[i];
    items[i]=items[j];
    items[j]=y;
    i++;
    j--;
}
    }
while (i<=j) {
    if (left<j) {
        qs(items, left, j);
    }
    if (i<right) {
        qs(items, i, right);
    }
}



   
   }
        //bubble sort
        
        public static void burbuja(int[] arr) {
            
            int aux;
            
            for(int i=arr.length;i>0;i--) {
                for(int j=0; j<1-1;j++) {
                    
                    
                    //swap
                    if(arr[j]>arr[j+1]) {
                        aux=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=aux;
                    }
                }
            }
            
        }
        
    }

=======
    public static void main(String[] args) {
		
		int[] arr = {1,2,5,6,7,5,3,5,6,7,8,3,3,5};
		
		System.out.println(Arrays.toString(arr));
		
		//burbuja(arr);
		qSort(arr);
		
>>>>>>> 02d14455e15fef57119e0a6f27e386c0d92806b4
		System.out.println(Arrays.toString(arr));

		// burbuja(arr);
		/*
		 * qSort(arr);
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */

		System.out.println(Arrays.toString(cocktailSort(generaArray())));
	}

	final static int POS = 300000;
	final static int LIMITE = 100000;

	public static int getAleatorio() {
		return (int) (Math.random() * LIMITE + 1);
	}

	public static int[] generaArray() {

		int[] arr = new int[POS];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getAleatorio();

		}
		return arr;
	}

	// quickSort
	public static void qSort(int items[]) {
		qs(items, 0, items.length - 1);
	}

	// ordenamiento de burbuja bidireccional
	public static int[] cocktailSort(int[] numbers) {
		boolean swapped = true;
		int i = 0;
		int j = numbers.length - 1;
		while (i < j && swapped) {
			swapped = false;
			for (int k = i; k < j; k++) {
				if (numbers[k] > numbers[k + 1]) {
					int temp = numbers[k];
					numbers[k] = numbers[k + 1];
					numbers[k + 1] = temp;
					swapped = true;
				}
			}
			j--;
			if (swapped) {
				swapped = false;
				for (int k = j; k > i; k--) {
					if (numbers[k] < numbers[k - 1]) {
						int temp = numbers[k];
						numbers[k] = numbers[k - 1];
						numbers[k - 1] = temp;
						swapped = true;
					}
				}
			}
			i++;
		}
		return numbers;
	}

	// version recursiva del metodo
	private static void qs(int[] items, int left, int right) {

		int i, j; // indices
		int x, y; // valores

		i = left;
		j = right;
		x = items[(left + right) / 2]; // posicion central

		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				j++;
				j--;
			}
		} while (i <= j);

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);

	}

	// bubble sort

	public static void burbuja(int[] arr) {

		int aux;

		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < 1 - 1; j++) {

				// swap
				if (arr[j] > arr[j + 1]) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}
		}

	}
}
>>>>>>> d69950171519c82431de619c7074e825fd601051
