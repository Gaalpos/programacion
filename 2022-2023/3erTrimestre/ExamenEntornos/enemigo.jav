class Armadura {

  String tipoArmadura;
  int durabilidadArmadura;
  int calidadArmadura;
}

abstract class Enemigo {

  float vida = 100;
  float golpeBase = 40;
  Armadura armadura = new Armadura();

  boolean estaMuerto() {
    return vida <= 0;
  }

  abstract float calculapotenciagolpe();
}

class EnemigoNormal extends Enemigo {

  float calculaPotenciaGolpe() {
    return golpeBase * vida;
  }
}

class EnemigoBoss extends Enemigo {

  float calculaPotenciaGolpe() {
    return golpeBase * 8 * vida;
  }
}

class EnemigoFinalBoss extends Enemigo {

  float calculaPotenciaGolpe() {
    return golpeBase * 20 * vida;
  }
}
