public class Magia {

  public static void main(String[] args) {

    Hechizero gandalf = new Hechizero("Gandalf", 2 , 5f, 0f);
    Encantamiento abracadabra = new Encantamiento("pata de cabra", " te convierte en cabra");

    if (gandalf.puedeLanzar()){
        System.out.println(abracadabra.calculaDamage(gandalf.nivel, gandalf.destreza));
    }else{
        System.out.println("No tienes mana");
    }

    /*


case Embrujo:
return nivelHechizero / 2 + destrezaHechizero;

case Malefico:
return nivelHechizero * 2;

}
 */

    //  Transformacion transformacion = new Transformacion();
    // transformacion.descripcion = "Este hechizo transforma al enemigo en un pequeño animal.";
    // transformacion.damage = Hechizero.nivel * 2 + Hechizero.destreza;

    //  Hechizero gandalf = new Hechizero();
    //  gandalf.nivel = 2;
    //  gandalf.destreza= 4;
    //  gandalf.mana = 2;

    //  System.out.println(magia.getDamage());

  }
  //   public static void main(String[] args) {
  //     Hechizo c = new Hechizo();
  //     c.nivelHechizero = 2;
  //     c.destrezaHechizero = 3;
  //     c.manaHechizero = 10;
  //     c.tipo = TiposHechizo.Embrujo;
  //     System.out.println(c.calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca());
  //   }
}
