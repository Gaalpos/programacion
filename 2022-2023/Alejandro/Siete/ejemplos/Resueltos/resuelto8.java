package Resueltos;

import java.util.Scanner;

public class resuelto8 {
    public static boolean esCpaicua(int dato) {
        String numero = String.valueOf(dato);
        StringBuffer sb = new StringBuffer(numero);
        String rev = sb.reverse().toString();
        if (rev.equals(numero))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int numero = sc.nextInt();
        System.out.println(esCpaicua(numero));
    }
}
