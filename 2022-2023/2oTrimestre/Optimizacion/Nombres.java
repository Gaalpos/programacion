import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.Reader;
import java.text.CollationElementIterator;


public class Nombres {
//    String[] lista = ;
ArrayList <String> lista = (ArrayList<String>) Arrays.asList( "Angel", "Pepe", "Bea" );


    void Insert(String nuevoNombre) {
        // String[] temp = Arrays.copyOf(lista, lista.length + 1);
        // temp[lista.length] = nuevoNombre;
        // lista = temp;
        lista.add(nuevoNombre);
    }


    void InsertMultiple( String ... nombres) {
       for (String nombre :nombres){
        Insert (nombre);
       }
    }


    void removeLastElement() throws Exception {
        if (lista.isEmpty()) throw new Exception(" No hay elementos para borrar");
            lista.remove(lista.size()-1);

    
        
    }


    void clear() {
        lista.clear();
    }


    void sortNames() {
        // String m = "";
        // for (int i = 0; i < lista.length; i++) {
        //     m += lista[i];
        // }
        // Arrays.sort(lista);
        Collections.sort(lista);
    }

    String getAllNames(){
        String resultado = " ";
        for (String nombre : lista){
            resultado = resultado + "\n";
        }
        return resultado;
    }


    void printAllNames() {
        System.out.println("---- Lista de nombres -----");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }


    void rellenarNombres() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cantidad de nombres a leer: ");
        int cantidad = in.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el nombre: ");
            String nombre = in.next();
            Insert(nombre);
        }
        in.close();
    }


    public static void main(String[] args) {
        Nombres n = new Nombres();
        n.rellenarNombres();
        n.printAllNames();
        n.Insert("Miguel");
        n.printAllNames();
        n.removeLastElement();
        n.printAllNames();
        n.clear();
        n.printAllNames();
        n.removeLastElement();
        n.printAllNames();
        n.Insert("Paula");
        n.Insert("Carmen");
        n.Insert("Ana");
        n.sortNames();
        n.printAllNames();


    }
}

