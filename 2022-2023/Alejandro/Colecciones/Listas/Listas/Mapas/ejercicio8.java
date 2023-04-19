import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ejercicio8 {
    /*Ejercicio que elige al azar 5 cartas de la baraja española, pero sin repetir ninguna */
    static ArrayList<Carta> mano= new ArrayList<Carta>();
    public static void main(String[] args) {
       
            Carta c= new Carta();
            System.out.println(c.toString());
            mano.add(c);
        
       do {
        Carta nueva = new Carta();

        if(!mano.contains(nueva)){
            System.out.println(nueva.toString());
            mano.add(nueva);
        }
        else{
           // System.out.println(nueva.toString());
            //System.out.println("carta repetida");

        }

       } while (mano.size()<10);

       System.out.println("mano obtenida sin ordenar");
       for(Carta car: mano){
        System.out.println(car.toString());
       }

       Collections.sort(mano);
       System.out.println("mano obtenida ordenada");
       for(Carta car: mano){
        System.out.println(car.toString());
       }
    }
    
}
