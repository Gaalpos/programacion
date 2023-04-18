package Capitulo5.Ejemplo3;

import java.awt.Color;

public class Camion extends Vehiculo {

private byte NumeroDeEjes;

Camion(byte NumeroDeRuedas) {
super(NumeroDeRuedas);
}

Camion(Color color, byte NumeroDeRuedas) {
super(color,NumeroDeRuedas);
}
Camion(Color color, byte NumeroDeRuedas,
short Cilindrada) {
super(color,NumeroDeRuedas,Cilindrada);
}

Camion(Color color, byte NumeroDeRuedas,
short Cilindrada, short Potencia) {
super(color,NumeroDeRuedas,Cilindrada,Potencia);

}

Camion(Color color, byte NumeroDeRuedas,
byte NumeroDeEjes, short Cilindrada,
short Potencia) {
super(color,NumeroDeRuedas,Cilindrada,Potencia);
EstableceNumeroDeEjes(NumeroDeEjes);
}

public byte DimeNumeroDeEjes() {
return NumeroDeEjes;
}

public void EstableceNumeroDeEjes(byte NumeroDeEjes) {
this.NumeroDeEjes = NumeroDeEjes;
}



}
