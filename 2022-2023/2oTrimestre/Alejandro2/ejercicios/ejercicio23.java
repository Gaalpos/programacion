import java.util.Scanner;

/*Pedir 5 números e indicar si alguno es múltiplo de 3. */

public class ejercicio23 {
    

public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int numero=0;
    boolean multiplo=false;

    for(int i=1;i<=5;i++) {
System.out.println("Dame una número: ");
    numero=sc.nextInt();
    if(numero%3==0){
        multiplo=true;
    }
}
System.out.println("Hay algún múltiplo de 3: "+multiplo);

}



}


