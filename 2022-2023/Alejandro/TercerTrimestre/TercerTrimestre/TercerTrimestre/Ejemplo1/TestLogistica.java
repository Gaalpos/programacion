package TercerTrimestre.Ejemplo1;

import java.util.Scanner;

public class TestLogistica {
    public static void main(String[] args) {
        Logistica Almacen1 = new Logistica((byte) 2, "cerca 1");
        Logistica Almacen2 = new Logistica((byte) 4, "media 2");
        Logistica Almacen3 = new Logistica((byte) 8, "lejos 3");

        String Accion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("m meter // s sacar // Salir");
            Accion = sc.nextLine();

            if (Accion.equals("m")) // meter contenedor
                if (Almacen1.HayHueco())
                    Almacen1.MeteContenedor();
                else if (Almacen2.HayHueco())
                    Almacen2.MeteContenedor();
                else if (Almacen3.HayHueco())
                    Almacen3.MeteContenedor();
                else
                    System.out.println("Hay que esperar a que vengan a quitar un contenedor");
            else // sacar contenedor
            if (Almacen1.HayContenedor())
                Almacen1.SacaContenedor();
            else if (Almacen2.HayContenedor())
                Almacen2.SacaContenedor();
            else if (Almacen3.HayContenedor())
                Almacen3.SacaContenedor();
            else
                System.out.println("Hay que esperar a que vengan a poner un contenedor");
        } while (!Accion.equals("Salir"));
    }
}
