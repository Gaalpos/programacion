
import java.util.Scanner;

public class ejercicio20 {
    
/*Pedir un número N, introducir N sueldos, y mostrar el sueldo
máximo.*/ 

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int numero=0;
    double sueldo=0;
    double maximo=0;

    System.out.println("Dime número de sueldos: ");
    numero=sc.nextInt();

    for(int i=1;i<=numero;i++) {
    System.out.println("Introduce sueldo: ");
        sueldo=sc.nextDouble();
        if(sueldo>maximo){
            maximo=sueldo;
        }

    }
System.out.println("El sueldo mas alto es: "+maximo);

}



}
