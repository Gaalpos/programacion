import java.util.Scanner;

public class capitalize{


public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);


    String cadena;
    String split;

    System.out.println("Cadena:");
    cadena= sc.nextLine();
    
    System.out.println("Split por:");
    split= sc.nextLine();

    String [] words = cadena.split(split);

    String CadenaMayus = "";

    for (String word : words){
        char firstLeter = Character.toUpperCase(word.charAt(0));
        String rest =  word.substring(1).toLowerCase();
        CadenaMayus += firstLeter + rest + " ";
    }

    System.out.println(CadenaMayus);

}

}