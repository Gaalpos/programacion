import java.awt.Color;
import java.util.Arrays;

    public class Figura {
        private Color ColorFigura;
        private int[] Posicion = new int[2];
        
        Figura(Color color) {
        EstableceColor(color);
        }
        
        Figura(Color color, int[] Posicion) {
        EstableceColor(color);
        EstableceCentro(Posicion);
        }
        
        public void EstableceColor(Color color) {
        ColorFigura = color;
        }
        
        public Color DimeColor() {
        return ColorFigura;
        }
        
        public void EstableceCentro(int[] Posicion) {
        this.Posicion[0] = Posicion[0];
        this.Posicion[1] = Posicion[1];
        }
        
        public int[] DimeCentro() {
        return Posicion;
        }

        @Override
        public String toString() {
            return "Figura [ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
        }
        
}
