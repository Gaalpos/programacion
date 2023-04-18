package Capitulo5.Ejemplo2;
import java.awt.Color;

import java.util.DuplicateFormatFlagsException;

public class Triangulo extends Figura{
double base;
double altura;

Triangulo(double base, double altura) {
    setBase(base);
    setAltura(altura);
    }
      
    Triangulo(double base, double altura, Color color) {
    super(color);
    setBase(base);
    setAltura(altura);
    }
    
    Triangulo(double base, double altura, Color color, int[] Posicion) {
    super(color, Posicion);
    setBase(base);
    setAltura(altura);
    }
    
    
    public void setBase(double base) {
    this.base= base;
    }
    
    public double getBase() {
    return base;
    }
    
    public double getAltura() {
        return altura;
    }




    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calculaArea() {
       return (base*altura)/2;
    }


    //Ejercicio muy Interesante VA A CAER
    @Override
public int compareTo(Object arg0) {
    Figura t= (Figura) arg0;
    if(this.calculaArea()>t.calculaArea())
    return (int) Math.ceil(this.calculaArea()- t.calculaArea());

    else if(this.calculaArea()==t.calculaArea())
    return 0;

    else
    return (int) Math.ceil(t.calculaArea()-this.calculaArea());
}




    
    
}
