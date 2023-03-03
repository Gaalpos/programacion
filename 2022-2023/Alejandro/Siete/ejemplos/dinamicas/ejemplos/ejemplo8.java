package Dinamicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejemplo8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Gato> banda = new ArrayList<Gato>();
        banda.add(new Gato("Garfield", "naranja", "mestizo"));
        banda.add(new Gato("Pepe", "gris", "angora"));
        banda.add(new Gato("Mauri", "blanco", "manx"));
        banda.add(new Gato("Ulises", "marrón", "persa"));
        banda.add(new Gato("Adán", "negro", "angora"));
        System.out.println("\nDatos de los gatos ordenados por nombre:");
        for (Gato gatoAux: banda) {
        System.out.println(gatoAux+"\n");
        }
        int i=0;
        //cambiar los gatos
        for(Gato g: banda){
            System.out.println(g.getNombre());
            System.out.println("Nuevo Nombre: ");
            String n= sc.nextLine();
            g.setNombre(n);
            banda.set(i, g);
        }

        }
}
