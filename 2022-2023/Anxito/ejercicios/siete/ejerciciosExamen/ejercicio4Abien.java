package ejerciciosExamen;

import java.util.Scanner;

// Crea un programa en java que solicite al usuario dos cadenas de caracteres y que devuelva
// la primera cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
// Por ejemplo, si se introducen las cadenas "Este es mi amigo Juan" y "amigo", devolverá "Este es mi AMIGO JUAN". 

public class ejercicio4Abien {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String cadena1 , cadena2;
    System.out.println("introduce la primera cadena: ");
    cadena1=sc.nextLine();

    System.out.println("Introduce la segunda cadena: ");
    cadena2=sc.nextLine();

    String[] arr1 = cadena1.split(" ");
    String[] arr2 = cadena2.split(" ");

  /*   for( int i=0; i<arr1.length;i++) {
        for(int j=0; i<arr2.length; j++) {

            if(arr1[i].equals(arr2[j])){
                arr1[i]=arr1[i].toUpperCase();
            }
        }
    }*/

    for(int i=0; i<arr1.length;i++) {
        if(cadena2.contains(arr1[i]))
        arr1[i] = arr1[i].toUpperCase();
    }
       

    System.out.println("Esta es la priemra frase: "+cadena1);
    System.out.println("Esta es la segunda frase: "+cadena2);

String cadenaNueva = "";
for(int i =0; i<arr1.length;i++) {
    cadenaNueva=cadenaNueva.concat(arr1[i]) +" ";

    }
    System.out.println("Esta es la primera frase moificada: "+cadenaNueva);
}

}
