import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* Crea un programa en java que solicite al usuario dos cadenas de cacateres 
y que devuelva la primera cadena, pero transformando an mayúsculas 
la parte que coincide con la segunda cadena introducida.*/ 



public class Ejercicio4A {
    
    public static String compararCadenas(String[]arr,String[]arr2){
        String uno="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr2[0]) arr[i]=arr[i].toUpperCase();
            uno+=" "+arr[i];
        }
        
        return uno;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String cad = sc.nextLine();

        System.out.println("Dame otra frase: ");
        String cad2 = sc.nextLine();
        
       
        String[] arr=cad.split(" ");
        String[] arr2=cad2.split(" ");

        System.out.println(arr[0]);
        System.out.println(compararCadenas(arr, arr2));

 
        for(int i=0; i<arr.length; i++){
            if(cad2.contains(arr[i]))   
                arr[i]= arr[i].toUpperCase();
        }
        

        System.out.println("Esta es la primera frase "+cad);
        System.out.println(" Esta es la segunda frase "+cad2);

        String cadenaNueva =" ";

        for(int i=0; i<arr.length; i++){
           cadenaNueva = cadenaNueva.concat(arr[i]+ " ");
        }
        System.out.println(" Esta es la primera frase modificada "+cadenaNueva );
    }



}
