package Capitulo5.Ejemplo3;
import java.awt.Color;
public class Vehiculo {
    private Color ColorVehiculo;
 private byte NumRuedas;
 private short Cilindrada;
 private short Potencia;

Vehiculo(Color color) {
    setColor(color);
}

Vehiculo (byte NumRuedas) {
this.NumRuedas = NumRuedas;
}

Vehiculo (short Cilindrada) {
this.Cilindrada = Cilindrada;
}

Vehiculo(Color color, byte NumRuedas) {
this(color);
this.NumRuedas = NumRuedas;
}

Vehiculo(Color color, byte NumRuedas, short Cilindrada) {
this(color,NumRuedas);
this.Cilindrada = Cilindrada;
}

Vehiculo(Color color, byte NumRuedas, short Cilindrada,
short Potencia) {
this(color,NumRuedas,Cilindrada);
this.Potencia = Potencia;

}

public void setColor(Color color) {
ColorVehiculo = color;
}
public Color getColor() {
return ColorVehiculo;
}

public byte getNumRuedas() {
return NumRuedas;
}

public short getCilindrada() {
return Cilindrada;
}

public short getPotencia() {
return Potencia;
}

@Override
public String toString() {
    return "Vehiculo [ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas + ", Cilindrada=" + Cilindrada
            + ", Potencia=" + Potencia + "]";
}


}
