public class Hechizero {

  String nombre;
  int nivel;
  float destreza;
  float mana;

  public Hechizero(String nombre, int nivel, float destreza, float mana) {
    this.nombre = nombre;
    this.nivel = nivel;
    this.destreza = destreza;
    this.mana = mana;
}

boolean puedeLanzar(){
    if (mana > 0){
        return true;
    } else return false;
}

public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public float getDestreza() {
    return destreza;
  }

  public void setDestreza(float destreza) {
    this.destreza = destreza;
  }

  public float getMana() {
    return mana;
  }

  public void setMana(float mana) {
    this.mana = mana;
  }
}
