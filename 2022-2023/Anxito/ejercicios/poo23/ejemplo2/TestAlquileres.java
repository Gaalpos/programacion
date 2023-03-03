package poo23.ejemplo2;

import java.util.ArrayList;

public class TestAlquileres {

    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("4050", "VW", "modelo", "blanco",100.0);
        Turismo tur1 = new Turismo("2345 JVM", "SEAT", "Leon", "Negro", 80.0, 3, false);
        Deportivo dep1 = new Deportivo("1234 MNL", "SEAT", "600E", "beige", 0.5, 850);
        Furgoneta fur1 = new Furgoneta("3456 BNT", "citroen", "c15", "indefinido",500.0,1000,150);

        ArrayList<Vehiculo> misAlquileres = new ArrayList();

        misAlquileres.add(vehiculo1);
        misAlquileres.add(tur1);

    }
    
}
