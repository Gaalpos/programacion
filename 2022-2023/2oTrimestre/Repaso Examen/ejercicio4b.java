import java.util.Scanner;

public class ejercicio4b {
    /*
     * Ejercicio 4B
     * Ingrese un texto de al menos 8 palabras e indique qué tres letras
     * han aparecido en el texto más veces, indicando las mismas.
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        boolean seguir=true;
   

        char[] letras = new char [26];
        int []veces = new int[26];
        for (int j=0;j<letras.length;j++){
           letras[j]= (char)('a'+j);
        }

        do{
            System.out.println("Introduce palabras, minimo ocho, fin para terminar");
            String analisis = sc.nextLine();
            String[]trozos = analisis.split(" ");
            contador=trozos.length;
            if(contador>=8){

            seguir = false;
        }else{
            System.out.println("incorrecto");
            System.out.println("Introduce palabras, minimo ocho, fin para terminar");
            analisis=sc.nextLine();
        }

        }while(seguir);

        System.out.println(analisis);

        for(int i=0; i<letras.length;i++){
            if(analisis.indexOf(letras[i]) ==1)
        }
     }
}
