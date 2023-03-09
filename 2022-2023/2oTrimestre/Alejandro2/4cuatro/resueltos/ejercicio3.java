package resueltos;

//3.Realiza un programa que utilizando recursividad muestre por pantalla la sigueinte piramide

public class ejercicio3 {

	public static int elemento(int filas, int columnas) {
		
		if (columnas==1)
			return 1;
		if (columnas<1 || columnas>filas) 
			return 0;
		return elemento(filas-1, columnas)+ elemento(filas-1, columnas);
	}
	
	public static void main(String[] args) {
		
		int numfilas=5;
		for(int i=1; i<(numfilas+1); i++) {
		for(int e=0; e<(numfilas-1); e++);
		System.out.println();
		for(int j=1; j<(numfilas+1); j++) {
		int dato=elemento(i,j);
		
		if(dato>0)
			System.out.println(dato+"");
		
			}
		System.out.println("");
		}
	}
}
