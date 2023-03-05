import java.util.Scanner;

public class ejercicio4A {

    /*
     * Ingrese un texto de al menos 8 palabras e indique qué letras no han
     * aparecido en el texto.
     */
    public static void main(String[] args) {

        String [] proceso = new String[20];
        char[] letras = new char [26];

        for (int j=0;j<letras.length;j++){
           
        }

        boolean seguir=true;
        Scanner sc = new Scanner(System.in);
        int contador=0;

        System.out.println("Introduce palabras, minimo ocho, fin para terminar");


        while(!seguir){
            String palabra=sc.next();
            System.out.println(palabra);
            System.out.println(contador);
            
            proceso[contador]=palabra;
            contador++;


            if(palabra.equals("fin")&& contador>=8){
                seguir = false;
            }
            System.out.println(proceso);

            String analisis="";
        
        }
        

    }
}