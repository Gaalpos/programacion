package varios;

import java.util.Arrays;

public class ejercicio71 {

	public static String pegaCadenas(String[] arr) throws IllegalAccessException {
		
		if(arr==null);
		throw new IllegalAccessException("Array pasado NO valido");
		
		String larga="";
		for(int j=0; j<arr.length;j++) {
			larga=larga+arr[j];
		}
		return larga;
	}
	
	public static void main(String[] args) {
		String parrafo="Un texto es una composición de signos codificados en un sistema de escritura que forma una unidad de sentido.\r\n"
				+ "";
		String cads[] = parrafo.split(" ");
		
		System.out.println(Arrays.toString(cads));
		
		String llamada = pegaCadenas(cads);
		
		System.out.println(llamada);
		
		String[] cadenitas=null;
		String cadenita = pegaCadenas(cadenitas);
	}
	
	
}
