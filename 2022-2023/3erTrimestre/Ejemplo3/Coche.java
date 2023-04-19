import java.awt.Color;

public class Coche extends Vehiculo {

    private int NumeroPuertas;

    public Coche(Color color, int numeroPuertas) {
        super(color);
        NumeroPuertas = numeroPuertas;
    }

    public Coche(byte NumRuedas, int numeroPuertas) {
        super(NumRuedas);
        NumeroPuertas = numeroPuertas;
    }

    public Coche(short Cilindrada, int numeroPuertas) {
        super(Cilindrada);
        NumeroPuertas = numeroPuertas;
    }

    public Coche(Color color, byte NumRuedas, int numeroPuertas) {
        super(color, NumRuedas);
        NumeroPuertas = numeroPuertas;
    }

    public Coche(Color color, byte NumRuedas, short Cilindrada, int numeroPuertas) {
        super(color, NumRuedas, Cilindrada);
        NumeroPuertas = numeroPuertas;
    }

    public Coche(Color color, byte NumRuedas, short Cilindrada, short Potencia, int numeroPuertas) {
        super(color, NumRuedas, Cilindrada, Potencia);
        NumeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        NumeroPuertas = numeroPuertas;
    }

    public double pagarRodaje() {
        return super.pagarRodaje() + 40 * getNumeroPuertas() + 0.18 * getPotencia();
    }

    @Override
    public String toString() {
        return "Coche [NumeroPuertas=" + NumeroPuertas + "ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas
                + ", Cilindrada=" + Cilindrada
                + ", Potencia=" + Potencia + "]";

    }

}