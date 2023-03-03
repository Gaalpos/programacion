import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo9 {
    

    public static ArrayList<Gato> poblarLista(int numero){
        Scanner sc = new Scanner ( System.in) ;
        
        ArrayList<Gato> lista = new ArrayList<Gato>();

       

        for(int i=0; i<numero;i++){
            Gato g = new Gato();
            System.out.println("dame nombre: ");
            g.setNombre(sc.next());
            System.out.println("dame color: ");
            g.setColor(sc.next());
            System.out.println("dame raza: ");
            g.setRaza(sc.next());
            lista.add(g);
        }
        return lista;
       
    }
    
    
    public static void main(String[] args) {
        ArrayList<Gato> miLista;
        Scanner sc = new Scanner (System.in)    ;

        System.out.println("Dime cuantos gatos: ");

        miLista=poblarLista(sc.nextInt());
        System.out.println(miLista);

    }
}
