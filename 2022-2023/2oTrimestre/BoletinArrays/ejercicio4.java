import java.util.Scanner;

public class ejercicio4 {

    /*
     * 4. Leer 10 números enteros. Debemos mostrarlos en el
     * siguiente orden: el primero, el último, el segundo, el
     * penúltimo, el tercero, etc.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] numeritos = new int[10];
       

        for (int i = 0; i < numeritos.length; i++) {
            System.out.println("Numerito posicion :" + i);
            n = sc.nextInt();
            numeritos[i] = n;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Numerito posicion " + i + " : " + numeritos[i]);
            System.out.println("Numerito posicion " + (9-i) + " : " + numeritos[9-i]);
            
            
        }
        sc.close();
    }

}
