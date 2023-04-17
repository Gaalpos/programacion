package Ejemplo1;

public class LogisticaCC {
    private String Nombre;
    private byte Capacidad;
    private byte NumeroDeContenedores;

    LogisticaCC(Byte Capacidad, String n) {
        this.Capacidad = Capacidad;
        NumeroDeContenedores = 0;
        this.Nombre = n;
    }

    public byte getNumeroDeContenedores() {
        return (NumeroDeContenedores);
    }

    public byte getCapacidad() {
        return (Capacidad);
    }

    public boolean HayHueco() {
        return (NumeroDeContenedores != Capacidad);
    }

    public boolean HayContenedor() {
        return (NumeroDeContenedores != 0);
    }

    public void MeteContenedor() {
        System.out.println(this.toString());
        NumeroDeContenedores++;
    }

    public void SacaContenedor() {
        System.out.println(this.toString());
        NumeroDeContenedores--;
    }

    @Override
    public String toString() {
        return "Logistica [Nombre=" + Nombre + ", Capacidad=" + Capacidad + ", NumeroDeCoches=" + NumeroDeContenedores
                + "]";
    }

}
