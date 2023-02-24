package Colecciones.Listas;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;


public class ejemplo3 {
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();
        list.add("hola");
        list.add("Adios");
        list.add("Hi");

        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next(););
        }

        ArrayList<Alumno> clase= new ArrayList<Alumno>();
        Alumno nuevo= new Alumno("manolo", 21);
        listofString.add(nuevo);

        List auxListOfString= new ArrayList();
        auxListOfString.addAll(auxListOfString);

        Alumno alfa= new Alumno("carlos", 21);
        Alumno beta= new Alumno("ana", 16);
        Alumno gamma= new Alumno("lucas", 29);
        Alumno delta= new Alumno("marta", 21);
        clase.add(alfa);
        clase.add(beta);
        clase.add(gamma);
        clase.add(delta);

        Iterator it= clase.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
