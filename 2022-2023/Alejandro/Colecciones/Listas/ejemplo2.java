package Colecciones.Listas;

import java.nio.channels.NetworkChannel;
import java.util.ArrayList;
import java.util.List;

public class ejemplo2 {
    public static void main(String[] args) {
        
        List listofString= new ArrayList();
        listofString.add("hola");
        listofString.add("adios");
        listofString.add(12);

        Alumno nuevo= new Alumno("manolo", 21);
        listofString.add(nuevo);

        List auxListOfString= new ArrayList();
        auxListOfString.addAll(auxListOfString);

        Alumno alfa= new Alumno("carlos", 21);
        Alumno beta= new Alumno("ana", 16);
        Alumno gamma= new Alumno("lucas", 29);
        Alumno delta= new Alumno("marta", 21);

        List otraLista= new ArrayList();
        otraLista.add(nuevo);
        otraLista.add(alfa);
        otraLista.add(beta);
        otraLista.add(gamma);
        otraLista.add(delta);

        System.out.println(listofString);
        System.out.println(auxListOfString);

        System.out.println(otraLista);

        for(int i=0; i<otraLista.size();i++){
            System.out.println(((Alumno) otraLista.get(i)).getNombre());
            System.out.println(((Alumno) otraLista.get(i)).getEdad());
        }

        

    }


//clase interna

private static class Alumno{
    String nombre;
    int edad;


    Alumno(String n, int e){
this.nombre=n;
this.edad=e;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    
}

}

