package colecciones.listas;

import java.util.ArrayList;
import java.util.List;

public class ejemplo2 {

    public static void main(String[] args) {
        
        List listOfString = new ArrayList();
        listOfString.add("hola");
        listOfString.add("adios");
        listOfString.add(12);

        Alumno nuevo = new Alumno("manolo",21);
        listOfString.add(nuevo);

        List auxListOfString = new ArrayList();
        auxListOfString.addAll(listOfString);

        Alumno alfa = new Alumno("carlos",21);
        Alumno beta = new Alumno("ana",21);
        Alumno ganma = new Alumno("falete",21);
        Alumno delta = new Alumno("yowy",21);

        List otraLista = new ArrayList();
        otraLista.add(nuevo);
        otraLista.add(alfa);
        otraLista.add(beta);
        otraLista.add(ganma);
        otraLista.add(delta);

        System.out.println(listOfString);
        System.out.println(auxListOfString);

        System.out.println(otraLista);

        for(int i=0; i<otraLista.size();i++) {
            System.out.println("Info del alumno: "+i);
            System.out.println( ((Alumno) otraLista.get(i)).getNombre());
            System.out.println( ((Alumno)otraLista.get(i)).getEdad());
        }

        
    }

    //clase interna --> inner class
    private static class Alumno {
        String nombre;
        

        int edad;

        public Alumno(String n, int e) {
            this.nombre=n;
            this.edad=e;
        }

        @Override
        public String toString() {
            return "Esto es un Alumno [nombre=" + nombre + ", edad=" + edad + "]";
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    
    
    
    }
}
