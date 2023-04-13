
import java.awt.Color;

public class TestFigura {
    public static void main(String[] args) {
        Figura uno = new Figura(Color.GREEN);
        int[] centro={1,2};

        Figura dos = new Figura(Color.BLUE, centro );
        System.out.println(uno);
        System.out.println(dos);


    }
}
