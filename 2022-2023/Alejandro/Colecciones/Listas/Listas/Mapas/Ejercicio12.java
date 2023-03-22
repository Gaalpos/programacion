import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Ejercicio12 {

    static HashMap<String,Integer> puntaje= new HashMap();

    static void ponPuntosAlMapa(){
        puntaje.put("As", 11);
        puntaje.put("Sota", 2);
        puntaje.put("Caballo", 3);
        puntaje.put("Rey", 4);
        puntaje.put("2", 0);
        puntaje.put("4", 0);
        puntaje.put("5", 0);
        puntaje.put("6", 0);
        puntaje.put("7", 0);
    }

    static ArrayList<Carta> mano= new ArrayList<>();
    public static void main(String[] args) {
       
        ponPuntosAlMapa();
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

       } while (mano.size()<5);

       System.out.println("mano obtenida sin ordenar");
       for(Carta car: mano){
        System.out.println(car.toString());
       }

       int total=0;
       for(Carta car: mano){
        total+= puntaje.get(car.getValor());
       }
       System.out.println("Total de la tirada: "+total);
    }
}
