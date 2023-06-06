import java.util.Scanner;

public class TestLogisticaC {
    
    public static void main(String[] args) {
        LogisticaC Almacen1 = new LogisticaC((byte) 2, "cerca 1");
        LogisticaC Almacen2 = new LogisticaC((byte) 2, "media 2");
        LogisticaC Almacen3 = new LogisticaC((byte) 2, "lejos 3");
    
        String Accion;
    
        Scanner sc = new Scanner(System.in);
    
        do {
            System.out.println("M meter // S sacar // salir");
            Accion = sc.nextLine();
        
            if (Accion.equals("m")) {
                if (Almacen1.HayHueco()) {
                    Almacen1.MeteContenedor();
                } else if (Almacen2.HayHueco()) {
                    Almacen2.MeteContenedor();
                } else if (Almacen3.HayHueco()) {
                    Almacen3.MeteContenedor();
                } else {
                    System.out.println("Hay que esperar a que vengan a quitar un contenedor");
                }
            } else if (Almacen1.HayContenedor()) {
                Almacen1.SacaContenedor();
            } else if (Accion.equals("s")) {
                if (Almacen2.HayContenedor()) {
                    Almacen2.SacaContenedor();
                } else if (Almacen3.HayContenedor()) {
                    Almacen3.SacaContenedor();
                } else {
                    System.out.println("Hay que esperar a que vengan a poner un contenedor");
                }
            }
        } while (!Accion.equals("salir"));
        sc.close();
      }
}
