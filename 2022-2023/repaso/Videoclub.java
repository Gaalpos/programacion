import java.util.ArrayList;
import java.util.Scanner;

public class Videoclub {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList productos = new ArrayList<>(null);

        System.out.println("Bienvenido al Gaalpos VideoClub");
        System.out.println("1: Lista de productos");
        System.out.println("2: Añadir producto");
        System.out.println("3:  Ficha de producto");
        System.out.println("4: Lista de clientes");
        System.out.println("5: Añadir cliente");
        System.out.println("6: Ficha de cliente");
        System.out.println("7: Alquiler de producto");

        int answer = sc.nextInt();

        if (answer == 1){
            System.out.println(productos);        }
    
    }
    
}
