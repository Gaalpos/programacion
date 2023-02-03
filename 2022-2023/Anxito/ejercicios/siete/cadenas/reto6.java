package cadenas;

/*Reto 6 haga un programa que genere automaticamente acronimos.
 * Partiendo de una frase determinada, debe mostrar por pantalla el texto compuesto por las iniciales
 * de cada palabra inividual que forma la frase.
*/

public class reto6 {

    public static void main(String[] args) {
        
    String muylarga="National Aeronautic and Space Administration";

    String[] arr = muylarga.split(" ");

    String acronimo="";
    for(int i=0;i<arr.length;i++){
        if(arr[i].length()>3) acronimo+=arr[i].charAt(0);
    }

    System.out.println(acronimo);
    
}

}

