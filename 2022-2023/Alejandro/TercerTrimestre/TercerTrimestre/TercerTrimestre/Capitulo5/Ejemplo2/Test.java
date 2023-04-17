package Capitulo5.Ejemplo2;
import java.awt.Color;

public class Test {
    public static void main(String[] args) {
        int[] Posicion = {10,20};
        double[] Lados = {50d,100d};
        Circulo MiCirculo = new Circulo(3d,Color.red,Posicion);
        Rectangulo MiRectangulo = new
        Rectangulo(Lados,Color.blue,Posicion);
        Cuadrado MiCuadrado= new Cuadrado(5.6d, Color.pink, Posicion);
        
        System.out.println(MiCirculo.getRadio());
        int[] Centro = MiCirculo.getCentro();
        System.out.println(Centro[0]);
        System.out.println(Centro[1]);
        System.out.println(MiCirculo.toString());
        System.out.println(MiCuadrado.toString());
        System.out.println(MiRectangulo.toString());
        
                       
        System.out.println("el area del circulo es: "+MiCirculo.calculaArea());
        System.out.println("el area del rectangulo es: "+MiRectangulo.calculaArea());
        System.out.println("el area del cuadrado es: "+MiCuadrado.calculaArea());
        
        }
}
