package cadenas;
// Intenta escribir un metodo, que dado un objeto de la clase String
//cuenta diferentes tipos de caracteres. En particular, el metodo deberá imprimir elnumero de letras,
//digitos y espacios en blanco de la cadena
//Intenta hacer un programa que escriba el conteo ( por ejemplo) de la cadena.
//"Hola soy Gorka Elorduy Garcia y soy programador desde 2012"

import java.util.Arrays;
import java.util.Scanner;

public class CuentaCaracteres {

static String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l",
"m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};

static int[] res = new int[letras.length];

public static int recorrido(String cadena, String car) {

int total = 0;
for(int i=0; i<cadena.length();i++)
if (cadena.charAt(i)==car.charAt(0)) 
total++;
return total;

}
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce una cadena: ");
    String cadena =sc.nextLine();
    
    cadena = cadena.toLowerCase().replaceAll("", "");

    for(int j=0; j<letras.length; j++) {

        res[j]=recorrido(cadena,letras[j]);
    }
    System.out.println(Arrays.toString(letras));
    System.out.println(Arrays.toString(res));
 
}

}
