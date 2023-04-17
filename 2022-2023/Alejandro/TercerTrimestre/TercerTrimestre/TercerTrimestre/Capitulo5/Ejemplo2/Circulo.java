package Capitulo5.Ejemplo2;
import java.awt.Color;
import java.util.Arrays;

public class Circulo extends Figura{
    private double Radio;

Circulo(double Radio) {
setRadio(Radio);



}

Circulo(double Radio,Color color) {
super(color);
setRadio(Radio);
}

Circulo(double Radio, Color color, int[] Posicion) {
super(color, Posicion);
setRadio(Radio);
}

public void setRadio(double Radio) {
this.Radio = Radio;
}

public double getRadio() {
return Radio;
}

@Override
public String toString() {
    return "Circulo [Radio=" + Radio + "ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
}

public double calculaArea(){
    return Math.PI*Math.pow(Radio,2);
}

}
