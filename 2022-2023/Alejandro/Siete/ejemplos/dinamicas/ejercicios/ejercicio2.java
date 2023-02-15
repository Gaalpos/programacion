package dinamicas.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ejercicio2 {
    //genera valores entre 0 y 100
public static int generaValor() {
    Random r  = new Random();
    return r.nextInt(100);

} 

public static int generaTamaño() {
    Random r = new Random();
    return 10+r.nextInt(11);
}

public static void main(String[] args) {
ArrayList<Integer> lista = new ArrayList<>();

    for(int i=0;i<generaTamaño();i++) {
        lista.add(generaValor());
        
    }
   
    int suma=0;
    for(Integer n: lista) suma+=n;

    System.out.println("tamaño: "+lista.size());
    System.out.println(lista);
    System.out.println("la suma es: "+suma);
    System.out.println("la media es:  "+(double) suma/lista.size());

    //ATENTOOOOOOOOS
    int minimo=100;
    int maximo=0;
    for(Integer n: lista) {
        if(n>maximo) maximo=n;
        if(n<minimo) minimo=n;

    }
    
    System.out.println("maximo es: "+maximo);
    System.out.println("minimo es: "+minimo);
    //nota primero se ordena y luego se muestra
    Collections.sort(lista);
    System.out.println(lista);
    
    int max = Collections.max(lista);
    int min = Collections.min(lista);
    System.out.println(max);
    System.out.println(min);
}
}
