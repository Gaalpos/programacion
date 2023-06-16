import java.util.ArrayList;
import java.util.Arrays;


public class Optimiza {
   
    String nombres[] = {"Pera", "Manzana", "Limón", "Fresa"};
   
 
    /* Este cuenta cuantos nombres de X caracteres hay. Donde X se pasa como parámetro */

    // ELIMINAMOS LA VARIABLE NUM QUE NO HACE NADA
    int cuantosDeXCaracteres(int numCaracteres) {
        int total = 0;
        for(String nombre: nombres) {
            if(nombre.length()==numCaracteres) {
                total++;
            }   
        }
        return total;
    }
   
       
    /* Este método devuelve un array con la primera letra de cada nombre */

    //NO SE PUEDE OPTIMIZAR
    String[] arrayConPrimeraLetra() {
        ArrayList<String> letras = new ArrayList<String>();
        for(int i=0;i<nombres.length;i++) {
            letras.add(nombres[i].substring(0,1));
        }
        return letras.toArray(new String[letras.size()]);
    }
   
    /*Este método devuelve el nombre con mayor longitud. Si hay varios de la misma longitud, 
    devuelve el primero que encuentra*/

    //NO SE  PUEDE OPTIMIZAR
    String elMasLargo() {
        String mayor = "";
        for(String nombre: nombres) {
            if(nombre.length() > mayor.length()) {
                mayor = nombre;
            }
        }
        return mayor;
    }
   
    /* Este método calcula cual es el nombre mas largo y se lo concatena al 
    final de cada uno de los nombres*/

    //CALCULAMOS EL NOMBRE FUERA DEL BUCLE PARA NO TENER QUE CALCULARLO SIEMPRE
    String[] concatenarNombreMasLargo() {
        String letras[] = new String[nombres.length];
        String masLargo = elMasLargo();
        for(int i=0;i<nombres.length;i++) {
            letras[i] = nombres[i]+"-"+masLargo;
        }
        return letras;
    }

    /* Este método mira si ya está el nombre de la fruta en la lista*/

    // DEVOLVEMOS TRUE OR FALSE EN VEZ DE CREAR UNA VARIBALE BOOLEAN
    boolean repetido(String buscar){
        for(String nombre: nombres){
            if(buscar.equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Optimiza();
    }
   
    public Optimiza() {
        System.out.println("Lista de nombres: "+ Arrays.toString(nombres));
        System.out.println("Ya está en la lista el nombre Angel:"+ repetido("Angel"));
        System.out.println("Ya está en la lista el nombre Fresa:"+ repetido("Fresa"));
        System.out.println("Cuantos nombres de 5 caracteres hay:"+ cuantosDeXCaracteres(5));
        System.out.println("Obtener la primera letra de cada nombre:"+ Arrays.toString(arrayConPrimeraLetra()));
        System.out.println("El nombre mas largo es:"+ elMasLargo());
        System.out.println("La lista de nombres concatenandole el mas largo:"+ Arrays.toString(concatenarNombreMasLargo()));
    }
}