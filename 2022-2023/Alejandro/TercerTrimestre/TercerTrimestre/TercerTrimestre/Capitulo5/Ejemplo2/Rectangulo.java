package Capitulo5.Ejemplo2;
import java.awt.Color;
import java.util.Arrays;
public class Rectangulo extends Figura{
    private double[] Lados = new double[2];

Rectangulo(double[] Lados) {
setLados(Lados);
}




Rectangulo(double[]Lados, Color color) {
super(color);
setLados(Lados);
}

Rectangulo(double[] Lados, Color color, int[] Posicion) {
super(color, Posicion);
setLados(Lados);
}

public void setLados(double[] Lados) {
this.Lados[0] = Lados[0];
this.Lados[1] = Lados[1];
}

public double[] getLados() {
return Lados;
}




@Override
public String toString() {
    return super.toString()+"Rectangulo [Lados=" + Arrays.toString(Lados) + "]";
}
public double calculaArea(){
    return Lados[0]*Lados[1];
}
}
