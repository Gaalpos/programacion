package dinamico;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo2 {
    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

ArrayList<Integer> numeros = new ArrayList<Integer>(); 
numeros.add(18); 
numeros.add(22); 
numeros.add(-30); 
System.out.println("Nº de elementos: " + numeros.size()); 
System.out.println("El elemento que hay en la posición 1 es " + numeros.get(1)); 

System.out.println(numeros);

System.out.println("cuidado con los set");
numeros.set(1, 555);
System.out.println(numeros);

//utilizar un foreach v2.0
int i =0;
for(Integer n: numeros) {
    System.out.println("posicion: "+i+" valor: "+n);
    i++;
}

//utilizar un foreach v3.0 permita modificar el valor del array
int j =0;
for(Integer n: numeros) {
    //Integer ent = new Integer(0);
    //ent=numeros.get(j);
    System.out.println("posicion: "+j+" valor: "+n);
    System.out.println("Nuevo valor: ");
    n=sc.nextInt();
    numeros.set(j, n);
    j++;
}

System.out.println(numeros);

} 

} 


