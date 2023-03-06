package poo23.ejemplo2;

import java.util.ArrayList;

public class TestAlquileres {

    public static ArrayList<Vehiculo> misAlquileres = new ArrayList<Vehiculo>();

    public static void main(String[] args) {
        
        Vehiculo veh1 = new Vehiculo("4050", "VW", "modelo", "blanco",100.0);
        Turismo tur1 = new Turismo("2345 JVM", "SEAT", "Leon", "Negro", 80.0, 3, false);
        Deportivo dep1 = new Deportivo("1234 MNL", "SEAT", "600E", "beige", 0.5, 850);
        Furgoneta fur1 = new Furgoneta("3456 BNT", "citroen", "c15", "indefinido",500.0,1000,150);

        ArrayList<Vehiculo> misAlquileres = new ArrayList();

        //añado vehiculos a la lista
        
        misAlquileres.add(veh1);
        misAlquileres.add(tur1);
        misAlquileres.add(dep1);
        misAlquileres.add(fur1);

       /*  for(Vehiculo v: misAlquileres) {
            System.out.println(v.toString());
        }

        for(Vehiculo v: misAlquileres) {
            v.arranca();
        }*/

        //Ejemplo de upcasting
        Vehiculo mVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia","Negro", 90.0, 2, true);
            System.out.println("INFO "+mVehiculo.toString());
        Vehiculo miVeh2 = new Deportivo("2546MJG", "Lexus", "Peruano", "negro", 100.0, 200.0);
            System.out.println("INFO "+miVeh2.toString());
        Vehiculo miVeh3 = new Furgoneta("2354 DGF", "Mercedes", "Benz", "Negro", 90.0, 200, 150);
            System.out.println("INFO "+miVeh3.toString());

            //Ejemplo de downcasting
            Vehiculo miVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia", "Negro", 90.0, 2, true);
                Turismo miNuevoTurismo = (Turismo) miVehiculo;
                if(miNuevoTurismo instanceof Turismo)
                    System.out.println("turismo: "+miNuevoTurismo);

                //ERROR GRAVE    
                Deportivo miNuevoDeportivo = (Deportivo) miVehiculo;
                if(miNuevoDeportivo instanceof Deportivo)
                    System.out.println("deportivo: "+miNuevoDeportivo);
                //ERROR GRAVE
                Furgoneta miNuevaFurgoneta = (Furgoneta) miVehiculo;
                if(miNuevaFurgoneta instanceof Furgoneta)
                    System.out.println("furgoneta: "+miNuevaFurgoneta);


    }
    
}
