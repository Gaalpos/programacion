package ejerciciosCadenas;

import java.util.Arrays;

// CAE EN EXAMEN 100 por 100
public class quickSortDemo {

	public static void main(String[] args) {
		char a[]= {'d','x','a','r','p','j','i'};
		int i;
		
		System.out.println(" Array original");
		System.out.println(Arrays.toString(a));
		
		
		for(i=0; i<a.length;i++) {
			/*
			System.out.println(a[i]);
			System.out.println();
			*/
			quickSortChar.qsort(a);
			
		}
		
		
		System.out.println(" Array ordenado");
		System.out.println(Arrays.toString(a));
		/*
		for(i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
	}
}