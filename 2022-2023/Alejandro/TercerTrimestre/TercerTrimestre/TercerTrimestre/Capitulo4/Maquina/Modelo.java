package Maquina;

public class Modelo {

    //Construimos depositos para bebidas y monedas
    public Almacen Deposito1Euro = new Almacen(8,"euro");
public Almacen Deposito01Euro = new Almacen(15,"10 cent");

public Almacen DepositoCocaCola = new Almacen(10,"coca");
public Almacen DepositoNaranja = new Almacen(5,"naranja");
public Almacen DepositoAgua = new Almacen(8,"aghua");

private float PrecioCocaCola = 1.0f;
private float PrecioNaranja = 1.3f;
private float PrecioAgua = 0.6f; //precio recomendado

public void PonPrecios (float CocaCola, float Naranja, float Agua) {
PrecioCocaCola = CocaCola;
PrecioNaranja = Naranja;
PrecioAgua = Agua;
}

public float DimePrecioCocaCola() {
return PrecioCocaCola;
}

public float DimePrecioNaranja() {
return PrecioNaranja;


}

public float DimePrecioAgua() {
return PrecioAgua;
}

public void MostrarEstadoMaquina() {
System.out.print("CocaColas: "+
DepositoCocaCola.getNumeroDeElementos()+ " ");
System.out.print("Naranjas: "+
DepositoNaranja.getNumeroDeElementos() + " ");
System.out.println("Agua: "+
DepositoAgua.getNumeroDeElementos() + " ");

System.out.print("1 Euro: "+
Deposito1Euro.getNumeroDeElementos() + " ");
System.out.println("0.1 Euro: "+
Deposito01Euro.getNumeroDeElementos() + " ");
System.out.println();
}
}
