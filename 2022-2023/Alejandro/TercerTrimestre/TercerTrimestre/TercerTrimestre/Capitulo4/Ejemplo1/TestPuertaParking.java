package TercerTrimestre.Ejemplo1;

import java.util.Scanner;

public class TestPuertaParking {
    public static void main(String[] args) {
        char CPuerta, COperacion;
Puerta PuertaRequerida = null;

LogisticaCC Aparcamiento = new LogisticaCC((byte)5, "atranquink");
Puerta Puerta1 = new Puerta(Aparcamiento);
Puerta Puerta2 = new Puerta(Aparcamiento);

do {
CPuerta = IntroduceCaracter ("Puerta de acceso:(1, 2): ");
switch (CPuerta) {
case '1':
PuertaRequerida = Puerta1;
break;
case '2':
PuertaRequerida = Puerta2;
break;
default:
System.out.println ("Puerta seleccionada no valida");
break;
}

COperacion = IntroduceCaracter ("Entrar/Salir vehiculo (e, s): ");
switch (COperacion) {
case 'e':
PuertaRequerida.EntraVehiculo();
break;
case 's':
PuertaRequerida.SaleVehiculo();
break;
default:
System.out.println ("Operacion seleccionada no valida");
break;
}

} while (true);

} // main

    static public char IntroduceCaracter(String Mensaje) {

        Scanner sc = new Scanner(System.in);
        String Entrada;

        System.out.print(Mensaje);
        Entrada = sc.nextLine();
        System.out.println();
        Entrada = Entrada.toLowerCase();
        return Entrada.charAt(0);
    }
}
