package ejer;

public class ejemplo9 {
	
	
	 public static void mostrarArray(char[] arr) {
	        System.out.print("[ ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.print("]");
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        String cad1 = "        MAYKA   es mi TIA      ";

	        System.out.println(cad1.trim());

	        String cad2 = "PEDRO ruiz";
	        System.out.println(cad2.toLowerCase());

	        System.out.println(cad2.toUpperCase());

	        // conversion de un objeto string en un ARRAY DE CARACTERES

	        String cad5 = "Hola Mundo";
	        System.out.println(cad5);
	        char[] arr = cad5.toCharArray();
	        mostrarArray(arr);
	        // Como convertir un array de caracteres en un objeto string

	        String nuevo = new String(arr);
	        System.out.println(nuevo);

	    }
}
