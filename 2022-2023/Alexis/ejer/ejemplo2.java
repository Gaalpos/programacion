package ejer;

public class ejemplo2 {
	
	public static void mostrarArray(byte[]arr) {
		System.out.print("[ ");
		System.out.println();
		for(int j = 0; j<arr.length; j++) {
			System.out.println(arr[j]+" ");
		}
	}
	
	
	
	public static void main(String[]args) {
		byte[] temperaturas1= {10,11,12,11,10,9,18,19,14,13,15,15};
		System.out.println("numero de valores: "+temperaturas1.length);
		byte[] temperaturas2= temperaturas1.clone();
		byte[] temperaturas3= temperaturas1;
		
		mostrarArray(temperaturas1);
		
		System.out.println("temperaturas 1");
		for(int j=0; j<temperaturas1.length; j++){
			System.out.println(temperaturas1[j]+" ");
		}
		System.out.println();
		
		System.out.println("temperaturas 2");
		for(int j=0; j<temperaturas1.length; j++){
			System.out.println(temperaturas2[j]+" ");
		}
		System.out.println();
		
		System.out.println("temperaturas 3");
		for(int j=0; j<temperaturas1.length; j++){
			System.out.println(temperaturas3[j]+" ");
		}
		
		
		if(temperaturas1.equals(temperaturas2)) {
			System.out.println("1 y 2 son iguales pa");
		}
		else {
			System.out.println("no son iguales");
		}
		
		if(temperaturas1.equals(temperaturas3)) {
			System.out.println("1 y 3 son iguales pa");
		}
		else {
			System.out.println("no son iguales");
		}
		//cambiamo un valor en temp1
		temperaturas1[0]=55;
		//lo mismo en temp2
		temperaturas3[4]=-14;
		
		mostrarArray(temperaturas1);
		mostrarArray(temperaturas2);
		mostrarArray(temperaturas3);
		
		System.out.println(temperaturas1.toString());
		System.out.println(temperaturas2.toString());
		System.out.println(temperaturas3.toString());
	}
}