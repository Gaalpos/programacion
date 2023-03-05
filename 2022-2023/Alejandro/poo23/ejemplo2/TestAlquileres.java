package poo23.ejemplo2;

import java.util.ArrayList;

public class TestAlquileres {
    public static void main(String[] args) {

        Vehiculo vehiculo1= new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",100.0);
        Turismo tur1= new Turismo("2345 JVM", "SEAT", "Leon", "Negro",80.0, 3, false);
        Deportivo dep1= new Deportivo("2143 AML", "SEAT", "600E", "beige", 0.5, 850);
        Furgoneta fur1= new Furgoneta("6289 KIL", "Citroen", "c15", "indefinido", 500.0, 1000, 150);

        ArrayList<Vehiculo> misAlquileres= new ArrayList<Vehiculo>();
        misAlquileres.add(vehiculo1);
        misAlquileres.add(tur1);
        misAlquileres.add(dep1);
        misAlquileres.add(fur1);
    }
}
