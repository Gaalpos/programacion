import java.util.Scanner;

public class ejercicio22 {

/*Pedir 5 calificaciones de alumnos y decir al final si hay
algún suspenso. */

    
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int numero=0;
    boolean suspenso=false;

    for(int i=1;i<=5;i++) {
System.out.println("Dame una nota: ");
    numero=sc.nextInt();
    if(numero<5){
        suspenso=true;
    }
}
System.out.println("Hay algún suspenso: "+suspenso);

}


}




