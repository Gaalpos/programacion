package ejemplos;
import java.util.Scanner;
public class cadenas {
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
String nombre;
String apellido;
System.out.println("Introduce tu nombre: ");
nombre= sc.nextLine();
System.out.println("Introduce tu apellido: ");
apellido= sc.nextLine();
//Un String es un objeto 
//apellido=nombre;


System.out.println("Tu nombre es "+nombre);
System.out.println("Tu apellido es "+apellido);


    }
}
