package Maquina;

public class Almacen {
private String Nombre;
private int Capacidad;
private int NumeroDeElementos = 0;

Almacen(int Capacidad, String Nombre) {
this.Capacidad = Capacidad;
this.Nombre= Nombre;
}

public int getNumeroDeElementos() {
return (NumeroDeElementos);
}

public int getCapacidad() {
return (Capacidad);
}

public boolean HayElemento() {
return (NumeroDeElementos != 0);
}

public boolean HayHueco() {
return (NumeroDeElementos != Capacidad);
}

public void MeteElemento() {
NumeroDeElementos++;
System.out.println(this.toString());
}

public void SacaElemento() {
NumeroDeElementos--;
System.out.println(this.toString());
}


public void RellenaAlmacen() {
NumeroDeElementos = Capacidad;
}

@Override
public String toString() {
    return "Almacen [Nombre=" + Nombre + ", Capacidad=" + Capacidad + ", NumeroDeElementos=" + NumeroDeElementos + "]";
}

}
