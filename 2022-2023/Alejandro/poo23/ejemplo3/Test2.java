package ejemplo3;

import java.util.ArrayList;

public class Test2 {
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador(1, "Vivente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Zurdo");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // Concentracion
        System.out.println("Todos los integrantes comienzan una concentración.(NO ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.println(integrante.toString() + " -> ");
            integrante.Concentrarse();
        }

        // Viaje
        System.out.println("\nTodos los integrantes viajan para jugar un partido.(NO ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.println(integrante.toString() + " -> ");
            integrante.Viajar();
        }

        /*
         * // Entrenamiento
         * System.out.
         * println("\nEntrenamiento Solamente el entrenador y el futbolista tiene metodos para entrenar: "
         * );
         * System.out.println(delBosque.toString() + " -> ");
         * delBosque.dirigirEntrenamiento();
         * System.out.println(iniesta.toString() + " -> ");
         * iniesta.entrenar();
         * 
         * // Masaje
         * System.out.
         * println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje");
         * System.out.println(raulMartinez.toString() + " -> ");
         * raulMartinez.darMasaje();
         * 
         * // Partido de Futbol
         * System.out.println(
         * "\nPartido de futbol: Solamente el entrenador y el futbolista tienen metodos para el partido de futbol"
         * );
         * System.out.println(delBosque.toString() + " -> ");
         * delBosque.dirigirPartido();
         * System.out.println(iniesta.toString() + " -> ");
         * iniesta.jugarPartido();
         */
    }
}
