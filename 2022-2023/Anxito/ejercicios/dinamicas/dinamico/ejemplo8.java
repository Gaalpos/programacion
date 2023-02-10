package dinamico;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo8 {
    
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        ArrayList<Gato> banda = new ArrayList<Gato>(); 
        banda.add(new Gato("Garfield", "naranja", "mestizo")); 
        banda.add(new Gato("Pepe", "gris", "angora")); 
        banda.add(new Gato("Mauri", "blanco", "manx")); 
        banda.add(new Gato("Ulises", "marrón", "persa")); 
        banda.add(2,new Gato() ); 
        System.out.println("\nDatos de los gatos ordenados por nombre:"); 
        for (Gato g: banda) { 
        System.out.println(g+"\n"); 
        } 
        //int i =0;
        //cambiar nombre a los gatos
        for(Gato g: banda) {
            System.out.println(g.getNombre());
            System.out.println("nuevo nombre: ");
             String n = sc.nextLine();
             g.setNombre(n);
             //bada.set(i,g);
        }

        System.out.println(banda);
        } 
        }


