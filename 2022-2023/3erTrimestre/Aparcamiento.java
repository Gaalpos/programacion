import java.util.Scanner;

class Aparcamiento {

  public static void main(String[] args) {
    char CPuerta, COperacion;
    Puerta PuertaRequerida = null;

    Almacen Aparcamiento = new Almacen((short) 5);
    Puerta Puerta1 = new Puerta(Aparcamiento);
    Puerta Puerta2 = new Puerta(Aparcamiento);

    do { 
      CPuerta = IntroduceCaracter("Puerta de acceso:(1, 2): ");
      switch (CPuerta) {
        case '1':
          PuertaRequerida = Puerta1;
          break;
        case '2':
          PuertaRequerida = Puerta2;
          break;
        default:
          System.out.println("Puerta seleccionada nO valida");
          break;
      }

      COperacion = IntroduceCaracter("Entrar/Salir vehiculo (e, s): ");
      switch (COperacion) {
        case 'e':
          PuertaRequerida.EntraVehiculo();
          break;
        case 's':
          PuertaRequerida.SaleVehiculo();

          break;
        default:
          System.out.println("Operacion seleccionada no valida");
          break;
      }
    } while (true);
  } // main

  public static char IntroduceCaracter(String Mensaje) {
    Scanner Teclado = new Scanner(System.in);
    String Entrada;

    System.out.print(Mensaje);
    Entrada = Teclado.Lee_String();
    System.out.println();
    Entrada = Entrada.toLowerCase();
    return Entrada.charAt(0);
  }
}
