class Transformacion extends Hechizo {

  public Transformacion(String nombre, String descripcion) {
    super(nombre, descripcion);
  }

  String nombre = "Transformacion";
  String descripcion;

  public float calculaDamage(int nivel, float destreza) {
    return nivel * 2 + destreza;
  }
}

class Encantamiento extends Hechizo {

  public Encantamiento(String nombre, String descripcion) {
    super(nombre, descripcion);
  }

  String nombre = "Encantamiento";
  String descripcion;

  public float calculaDamage(int nivel, float destreza) {
    return nivel + destreza;
  }
}

class Embrujo extends Hechizo {

  public Embrujo(String nombre, String descripcion) {
    super(nombre, descripcion);
  }

  String nombre = "Embrujo";
  String descripcion;

  public float calculaDamage(int nivel, float destreza) {
    return nivel / 2 + destreza;
  }
}

class Malefico extends Hechizo {

  public Malefico(String nombre, String descripcion) {
    super(nombre, descripcion);
  }

  String nombre = "Malefico";
  String descripcion;

  public float calculaDamage(int nivel, float destreza) {
    return nivel * 2;
  }
}

public class Hechizo {

  String nombre = "";
  String descripcion;

  public Hechizo(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}
