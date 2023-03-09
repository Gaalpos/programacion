package cadenas;

import java.util.Scanner;

//Un programa que extrae todo el texto de una frase, excepto la primera y la ultima palabra.

public class ExtraerPalabras {
    
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Escribe una frase de texto y pulsa retorno");
    String texto = lector.nextLine();
    System.out.println(texto);

    //Busca el primer y ultimo espacio en  blanco.
    int inicioSubcadena = texto.indexOf(' ');
    int finSubcadena = texto.lastIndexOf(' ');
    System.out.println("El texto sin la primera y la ultima palabra");

    if(inicioSubcadena==finSubcadena){
        System.out.println("No hay nada que escribir...");
    }else{
        String textoFinal = texto.substring(inicioSubcadena+1,finSubcadena) ;
        System.out.println(textoFinal);
    }

}

}
