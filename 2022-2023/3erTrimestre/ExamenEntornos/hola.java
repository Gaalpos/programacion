// public class Hechizo {

//   enum TiposHechizo {
//     Transformacion,
//     Encantamiente,
//     Embrujo,
//     Malefico,
//   }

//   String nombre = "default"; // nombre del hechizo
//   String descripcion; // Breve descripción del hechizo
//   private boolean preparado = true; // Determina si está preparado para lanzar elhechizo
//   TiposHechizo tipo = TiposHechizo.Transformacion;
//   String nombreHechizero; // Nombre del hechizero
//   int nivelHechizero; // Nivel alcanzado por el hechicero
//   float destrezaHechizero; // Destreza del hechizero
//   float manaHechizero; // Cantidad de maná del hechizero

//   boolean puede_lanzar_hechizo() {
//     if (preparado) {
//       if (manaHechizero > 0) {
//         return true;
//       } else {
//         return false;
//       }
//     } else {
//       return false;
//     }
//   }

//   // Calcula el daño de una carta
//   float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
//     switch (tipo) {
//       case Transformacion:
//         return nivelHechizero * 2 + destrezaHechizero;
//       case Encantamiente:
//         return nivelHechizero * 1 + destrezaHechizero;
//       case Embrujo:
//         return nivelHechizero / 2 + destrezaHechizero;
//       case Malefico:
//         return nivelHechizero * 2;
//       default:
//         return 0;
//     }
//   }

//   public static void main(String[] args) {
//     Hechizo c = new Hechizo();
//     c.nivelHechizero = 2;
//     c.destrezaHechizero = 3;
//     c.manaHechizero = 10;
//     c.tipo = TiposHechizo.Embrujo;
//     System.out.println(c.calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca());
//   }
// }
