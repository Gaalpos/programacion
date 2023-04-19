package Capitulo5.Ejemplo2;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        int[] Posicion = {10,20};
        double[] Lados = {50d,100d};

        ArrayList<Figura> lista= new ArrayList<Figura>();

        Circulo MiCirculo = new Circulo(3d,Color.red,Posicion);
        Rectangulo MiRectangulo = new
        Rectangulo(Lados,Color.blue,Posicion);
        Cuadrado MiCuadrado= new Cuadrado(5.6d, Color.pink, Posicion);
        Triangulo MiTriangulo= new Triangulo(5.4, 6.3, Color.YELLOW, Posicion);
        
        lista.add(MiRectangulo);
        lista.add(MiCirculo);
        lista.add(MiCuadrado);
        lista.add(MiTriangulo);



        System.out.println(MiCirculo.getRadio());
        int[] Centro = MiCirculo.getCentro();
        System.out.println(Centro[0]);
        System.out.println(Centro[1]);
        System.out.println(MiCirculo);
        System.out.println(MiCuadrado);
        System.out.println(MiRectangulo);
        System.out.println(MiTriangulo);
        
                       
        /*System.out.println("el area del circulo es: "+MiCirculo.calculaArea());
        System.out.println("el area del rectangulo es: "+MiRectangulo.calculaArea());
        System.out.println("el area del cuadrado es: "+MiCuadrado.calculaArea());
        System.out.println("el area del triangulo es: "+MiTriangulo.calculaArea());*/

        for(Figura f: lista){
            System.out.println(f);
            System.out.println("Su area es: "+f.calculaArea());
        }


        Collections.sort(lista);
    }
}
