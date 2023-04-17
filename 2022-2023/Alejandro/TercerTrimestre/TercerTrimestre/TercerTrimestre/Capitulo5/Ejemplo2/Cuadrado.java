package Capitulo5.Ejemplo2;
import java.awt.Color;
public class Cuadrado extends Figura{
    

    private double Lado;

Cuadrado(double Lado) {
setLados(Lado);
}




Cuadrado(double Lado, Color color) {
super(color);
setLados(Lado);
}

Cuadrado(double Lado, Color color, int[] Posicion) {
super(color, Posicion);
setLados(Lado);
}

public void setLados(double Lado) {
this.Lado= Lado;
}

public double getLados() {
return Lado;
}

@Override
public String toString() {
    return "Cuadrado [Lado=" + Lado + "]";
}

public double calculaArea(){
    return Lado*Lado;
}
}


