package varios;

import java.util.Arrays;

public class ordenamientos {

	public static void main(String[] args) {
		
		int[] arr = generaArray();
		
		System.out.println(Arrays.toString(arr));
		//burbuja(arr);
		
		try {
		Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		qSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	final static int LLIMITE = 100;
	final static int POS = 30000;
	public static int getAleatorio() {
		return (int) (Math.random()* LLIMITE+1);
	}
	
	
	public static int[] generaArray() {
		int[] fuera = new int[POS];
		
		for(int i=0; i<fuera.length; i++) {
			fuera[i] =getAleatorio();
		}
		return fuera;
	}
	
	
	
	
	//quickSort
	public static void qSort(int items[]) {
		qs(items,0 ,items.length-1);
	}
	
	//version recursiva del metodo
	private static void qs(int[] items, int left, int right ) {
		
		int i,j; //indices
		int x,y; //valores
		
		i=left;
		j=right;
		x=items[(left+right)/2]; //posicion central
		
		do {
			while((items[i]<x)  && (i<right)) i++;
			while((x<items[j]) &&(j>left)) j--;
			if(i<=j) {
				y=items[i];
				items[i] = items[j];
				items[j]=y;
				j++;
				j--;
			}
		}while(i<=j);
		
		if(left<j) qs(items, left, j);
		if(i<right) qs (items, i, right);
		
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

	public static void insertionsort(int[] numbers) {
		for(int i=0; i<numbers.length;i++)
	}
	
}

