package TercerTrimestre;
public class Logistica {
    String Nombre;
private byte Capacidad;
private byte NumeroDeHuecos;

Logistica(byte Capacidad, String n) {
this.Capacidad = Capacidad;
this.Nombre=n;
NumeroDeHuecos = Capacidad;
}

 public byte DimeNumeroDeHuecos() {
return (NumeroDeHuecos);
}

public byte DimeCapacidad() {
return (Capacidad);
}



public boolean HayHueco() {
return (NumeroDeHuecos != 0);
}

public boolean HayContenedor() {
return (NumeroDeHuecos != Capacidad);
}

public void MeteContenedor() {
NumeroDeHuecos--;
System.out.println(this.toString());

}

public void SacaContenedor() {
NumeroDeHuecos++;
System.out.println(this.toString());

}

@Override
public String toString() {
    return "Logistica [Nombre=" + Nombre + ", Capacidad=" + Capacidad + ", NumeroDeHuecos=" + NumeroDeHuecos + "]";
}

}
