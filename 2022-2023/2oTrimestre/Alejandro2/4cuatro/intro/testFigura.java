package intro;

public class testFigura {
    public static void main(String[] args) {
        cuadrado c= new cuadrado(8);
        System.out.println(c.toString());
        System.out.println("area: "+c.area());

        circulo o= new circulo(3);
        System.out.println(o.toString());
        System.out.println("perimetro: "+o.area()  );

    }
}
