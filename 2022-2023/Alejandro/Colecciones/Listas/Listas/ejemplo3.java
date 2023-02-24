package Colecciones.Listas.Listas;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;


public class ejemplo3 {
    public static void main(String[] args) {
		
		
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hola");
        list.add("Adios");    
        list.add("Hi");    
        
        Iterator itr= list.iterator();//getting the Iterator  
        while(itr.hasNext()){
         System.out.println(itr.next());
        }  
      //también se puede hacer con lambda
       //list.forEach(str->System.out.println(str));
        
        ArrayList<Alumno> clase = new ArrayList<Alumno>();
        
          Alumno nuevo = new Alumno("manolo",21);
          clase.add(nuevo);
          Alumno alfa = new Alumno("carlos",22);
          Alumno beta = new Alumno("ana",21);
          Alumno gamma = new Alumno("lucas",23);
          Alumno delta = new Alumno("marta",21);
          clase.add(alfa);
          clase.add(beta);
          clase.add(gamma);
          clase.add(delta);
          
          Iterator it = clase.iterator();
          while(it.hasNext())
              System.out.println(it.next());
          
          
          
  
}
    
}
