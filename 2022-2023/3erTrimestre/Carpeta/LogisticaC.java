
public class LogisticaC {

  private String Nombre;
  private byte Capacidad;
 // private byte NumeroDeHuecos;
  private byte NumeroDeContenedores;

  LogisticaC(byte Capacidad, String n) {
    this.Capacidad = Capacidad;
    NumeroDeContenedores = 0; //logica inversa
    this.Nombre = n;
  }

  public byte geNumeroDeContenedores() {
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
    return (
      "Logistica [Nombre=" +
      Nombre +
      ", Capacidad=" +
      Capacidad +
      ", NumeroDeContenedores=" +
      NumeroDeContenedores +
      "]"
    );
  }
} // LogisticaAlmacen
