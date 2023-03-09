import java.util.Scanner;

public class ejercicio21 {
    
/*Pedir 10 números, y mostrar al final si se ha introducido
alguno negativo.*/

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int numero=0;
    boolean negativo=false;

    for(int i=1;i<=10;i++) {
System.out.println("Dame un número: ");
    numero=sc.nextInt();
    if(numero<0){
        negativo=true;
    }
}
System.out.println("Hay algún número negativo: "+negativo);

}
}
