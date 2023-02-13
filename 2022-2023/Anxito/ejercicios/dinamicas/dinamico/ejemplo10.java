package dinamico;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo10 {

    static ArrayList<Gato> lista = new ArrayList<Gato>();
    
    public static void poblarLista(int numero) {

        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<numero; i++) {
            Gato g = new Gato();
            System.out.println("dame nombre: ");
            g.setNombre(sc.next());
            System.out.println("dame color: ");
            g.setColor(sc.next());
            System.out.println("dame raza: ");
            g.setRaza(sc.next());
            //añadir
            lista.add(g);

        }

    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos gatos: ");
        poblarLista(sc.nextInt());
        
        lista.sort(null);
        System.out.println(lista);
        
    }

}
