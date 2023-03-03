package Refactorizacion;

public class Ejemplo1 {
    
    public static float suma(float b) {
        int c = 6;
        float a = b * b;
        a++;
        b = b * b;
        b = b * b;
        b = b * b;
        if (a < 0)
            a = -a;
        a = a + b;
        return a;
 
    }
 
    public static void main(String[] args) {
        System.out.println(suma(4));
        System.out.println(suma(-4));
        System.out.println(suma(0));
    }
 }