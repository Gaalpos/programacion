package varios;

import java.util.Arrays;

public class ordenamientos {
	private static int[] listo;
	final static int POS=3000;
	final static int Limites=100;
	public static void burbuja(int [] Arr) {
		
		int aux;  
		for(int i=Arr.length; i>0; i--) {
			for(int j=0; j<i-1;j++) {
				if(Arr[j]>Arr[j+1]) {
					aux =Arr[j+1];
					Arr[j+1]=Arr[j];
					Arr[j]=aux;
				}
			}
		}
	}
	
	public static int []generaArray() {
		int[] fuera = new int [POS];
		for(int i=0; i<fuera.length; i++) {
			fuera[i] = getAleatorio();
		}
		return fuera;
		}
	public static int getAleatorio() {
		int num=(int)(Math.random()*Limites+1);
		return num;
		}
	
	public static void qsort(int item[]) {
		qs(item, 0 ,item.length-1);
	}
	
	
	
	
	private static void qs(int [] items, int left, int right) {
		int i, j;
		int x, y;
		
		i= left; j =right;
		x=items[(left+right)/2];
		do {
			while((items[i]<x)&& (i<right))i++;
			while((x<items[j])&& (j>left))j--;
			if(i<=j) {
				y=items[i];
				items[i]=items[j];
				items[j]=y;
				i++; j--;
			}
		}while(i<=j);
		if(left <j) qs(items, left, j);
		if(i<right) qs(items, i, right);
	}
	
	public static void insertionsort(int [] numbers) {
		for(int i=0; i<numbers.length; i++) {
			int copyNumber = numbers[i];
			int j=1;
			while(j> 0 && copyNumber < numbers[j-1]) {
				numbers[j] = numbers[j-1];
				j--;
			}
			numbers[j]=copyNumber;
		}
	}
	
	
	public static int[] cocktailSort(int[] numbers) 
	{
	      boolean swapped = true;
	      int i = 0;
	      int j = numbers.length - 1;
	      while(i < j && swapped) 
	      {
	         swapped = false;
	         for(int k = i; k < j; k++) 
	         {
	            if(numbers[k] > numbers[k + 1]) 
	            {
	               int temp = numbers[k];
	               numbers[k] = numbers[k + 1];
	               numbers[k + 1] = temp;
	               swapped = true;
	            }
	         }
	         j--;
	         if(swapped) 
	         {
	            swapped = false;
	            for(int k = j; k > i; k--) 
	            {
	               if(numbers[k] < numbers[k - 1]) 
	               {
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
	public static void merge(int A[],int izq, int m, int der){
		   int i, j, k;
		   int [] B = new int[A.length]; //array auxiliar
		   for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar                                       
		        B[i]=A[i];

		   i=izq; j=m+1; k=izq;
		     
		   while (i<=m && j<=der) //copia el siguiente elemento más grande                                      
		          if (B[i]<=B[j])
		              A[k++]=B[i++];
		          else
		              A[k++]=B[j++];
		        
		   while (i<=m)         //copia los elementos que quedan de la
		         A[k++]=B[i++]; //primera mitad (si los hay)
		}
	
	public static void mergesort(int A[],int izq, int der){
	    if (izq < der){
	            int m=(izq+der)/2;
	            mergesort(A,izq, m);
	            mergesort(A,m+1, der);                                                                                
	            merge(A,izq, m, der);                                                                                 
	    }
	}
	public static void selectionSort(int array[]) {
	    int size = array.length;

	    for (int step = 0; step < size - 1; step++) {
	      int min_idx = step;

	      for (int i = step + 1; i < size; i++) {

	        // To sort in descending order, change > to < in this line.
	        // Select the minimum element in each loop.
	        if (array[i] < array[min_idx]) {
	          min_idx = i;
	        }
	      }

	      // put min at the correct position
	      int temp = array[step];
	      array[step] = array[min_idx];
	      array[min_idx] = temp;
	    }
	  }
	
	public static void main(String[] args) throws InterruptedException {
		/*int [] arr= {1,2,3,5,732,34,12,4,6,42,12,5};
		System.out.println(Arrays.toString(arr));
		burbuja(arr);
		System.out.println(Arrays.toString(arr));
		int [] arr2= {1,2,3,5,732,34,12,4,6,42,12,5};
		
		
		qsort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Thread.sleep(1000);
		int [] Arr3 = generaArray();
		System.out.println(Arrays.toString(Arr3));
	//	burbuja(Arr3);
		System.out.println(Arrays.toString(Arr3));
		cocktailSort(Arr3);
	System.out.println(Arrays.toString(Arr3));
	
	int [] arr4= {1,2,3,5,732,34,12,4,6,42,12,5};
	System.out.println(Arrays.toString(arr4));
	mergesort(arr4, 0, arr4.length-1);
	System.out.println(Arrays.toString(arr4));
	
	int [] arr5= {1,2,3,5,732,34,12,4,6,42,12,5};
	System.out.println(Arrays.toString(arr5));
	selectionSort(arr5);
	System.out.println(Arrays.toString(arr5));
	*/	
	}
	
	
}
