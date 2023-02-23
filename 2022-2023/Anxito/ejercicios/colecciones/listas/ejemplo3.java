package colecciones.listas;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class ejemplo3 {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hola");
        list.add("Adios");
        list.add("Hi");

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Tambien se puede hacer con lambda
        //list.forEach(str-->System.out.println(str));


        Alumno nuevo = new Alumno("manolo",21);
        listOfString.add(nuevo);

        List auxListOfString = new ArrayList();
        auxListOfString.addAll(listOfString);

        Alumno alfa = new Alumno("carlos",21);
        Alumno beta = new Alumno("ana",21);
        Alumno ganma = new Alumno("falete",21);
        Alumno delta = new Alumno("yowy",21);
        clase.add(alfa);
        clase.add(beta);
        clase.add(ganma);
        clase.add(delta);

        Iterator it = clase.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    
}
