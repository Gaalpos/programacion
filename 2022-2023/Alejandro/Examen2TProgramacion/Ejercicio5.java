import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio5 {
    static HashMap<String, Integer> gp = new HashMap<>();

    public static void poblarMap() {
        gp.put("Amalia Núñez", 9);
        gp.put("Cindy Nero", 3);
        gp.put("César Vázquez", 1);
        gp.put("Víctor Tilla", 6);
        gp.put("Alan Brito", 7);
        gp.put("Esteban Quito", 3);
        gp.put("Conchita Perez", 5);
    }

    public static void Listar() {
        for (Map.Entry pareja : gp.entrySet()) {
            System.out.println(pareja);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean seguir = true;
        poblarMap();
        do {
            System.out.println("Gestion de Alumnos");
            System.out.println("-------------------");
            System.out.println("seleccione una opcion: ");
            System.out.println("1   -   listar");
            System.out.println("2   -   añadir");
            System.out.println("3   -   modificar");
            System.out.println("4   -   borrar");
            System.out.println("5   -   Ordenar Alfabeticamente");
            System.out.println("6   -   Ordenar por nota");
            System.out.println("7   -   salir");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case (1): // lista
                    Listar();
                    break;
                case (2):// añadir
                    System.out.println("introduce un nombre");
                    String nombre = sc.nextLine();

                    if (gp.containsKey(nombre)) {
                        System.out.println("nombre");
                    } else {
                        System.out.println("Introduce nota: ");
                        int clave = Integer.parseInt(sc.nextLine());

                        gp.put(nombre, clave);
                    }
                    Listar();
                    break;

                case (3):// modificar
                    System.out.println("introduce un nombre");
                    String nombre2 = sc.nextLine();

                    if (gp.containsKey(nombre2)) {
                        System.out.println("valor actual: " + gp.get(nombre2));
                        System.out.println("Introduce nueva nota");
                        int nota = sc.nextInt();
                        gp.put(nombre2, nota);
                    } else {
                        System.out.println("clave no existente");
                    }
                    Listar();
                    break;

                case (4):// borrar
                    System.out.println("introduce un nombre");
                    String nombre3 = sc.nextLine();
                    if (gp.containsKey(nombre3)) {
                        gp.remove(nombre3);
                        System.out.println("clave borrada");

                    } else {
                        System.out.println("clave no existente");
                    }
                    Listar();
                    break;

                case (5):// orden alfabetico
                    Collections.sort(gp);

                case (6):// ordenar por nota
                    Collections.sort(gp);

                case (7):// salir
                    seguir = false;
                    System.out.println("gracias por usar la gestion");
                    break;
            }
        } while (seguir);
    }
}