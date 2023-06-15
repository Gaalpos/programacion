class EnemigoNormal extends Enemigo {

  public EnemigoNormal(
    String tipoArmadura,
    float vida,
    float golpeBase,
    boolean muerto
  ) {
    super(vida, golpeBase);
  }

  float calculaDamage() {
    return golpeBase * vida;
  }
}

class EnemigoBoss extends Enemigo {

  public EnemigoBoss(
    String tipoArmadura,
    float vida,
    float golpeBase,
    boolean muerto
  ) {
    super(vida, golpeBase);
  }

  float calculaDamage() {
    return golpeBase * 8 * vida;
  }
}

class EnemigoFinalBoss extends Enemigo {

  public EnemigoFinalBoss(
    float vida,
    float golpeBase
  ) {
    super(vida, golpeBase);
  }

  float calculaDamage() {
    return golpeBase * 20 * vida;
  }
}

public class Enemigo {

  float vida = 100;
  float golpeBase = 40;

  public Enemigo(
    float vida,
    float golpeBase
  ) {
    this.vida = vida;
    this.golpeBase = golpeBase;
  }

  boolean estaMuerto() {
    if (vida <= 0) return true; else return false;
  }

public float getVida() {
    return vida;
}

public void setVida(float vida) {
    this.vida = vida;
}

public float getGolpeBase() {
    return golpeBase;
}

public void setGolpeBase(float golpeBase) {
    this.golpeBase = golpeBase;
}

@Override
public String toString() {
    return "Enemigo [vida=" + vida + ", golpeBase=" + golpeBase + "]";
}


  
}
