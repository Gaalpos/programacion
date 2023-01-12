package ejemplos;

public class ejemplo2 {
	
	public static void mostrarArray(byte [] arr) {
		System.out.println();System.out.println("[ ");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println(" ]");
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		byte [] temperaturas1 = {10,11,12,11,10,9,18,19,14,13,15,15};
		System.out.println("numero de valores: "+temperaturas1.length);
		byte [] temperaturas2 = temperaturas1.clone();
		byte [] temperaturas3 = temperaturas1;
		
		System.out.println("temperaturas 1");
		mostrarArray(temperaturas1);
		
		System.out.println("temperaturas 2");
		mostrarArray(temperaturas2);
		
		System.out.println("temperaturas 3");
		mostrarArray(temperaturas3);
		
		if(temperaturas1.equals(temperaturas2) ) {
			System.out.println("1 y 2 son iguales");
		}
		else {
			System.out.println("1 y 2 no son iguales");
		}
		
		System.out.println(temperaturas1.toString());
		System.out.println(temperaturas2.toString());
		
		
		if(temperaturas1.equals(temperaturas3) ) {
			System.out.println("1 y 3 son iguales");
		}
		else {
			System.out.println("1 y 3 no son iguales");
		}
		
		System.out.println(temperaturas1.toString());
		System.out.println(temperaturas3.toString());
		
		//vamos acambiar un valor individual en tempetaruas 1
		temperaturas1[0]=55;
		//vamos a cambiar un valor individual en temp3
		temperaturas3[4]=-15;
		
		System.out.println("temperaturas 1");
		mostrarArray(temperaturas1);
		
		System.out.println("temperaturas 2");
		mostrarArray(temperaturas2);
		
		System.out.println("temperaturas 3");
		mostrarArray(temperaturas3);
		
	
		
	
	}
	
}
