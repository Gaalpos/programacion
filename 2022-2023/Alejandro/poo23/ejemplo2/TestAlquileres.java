package poo23.ejemplo2;

import java.util.ArrayList;

public class TestAlquileres {
    public static ArrayList<Vehiculo> misAlquileres= new ArrayList<Vehiculo>();
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

      /*  for(Vehiculo v: misAlquileres){
            System.out.println(v.toString());
        }

        for(Vehiculo v: misAlquileres){
            v.arranca();
        }*/ 

  
        //Ejemplo de upCasting
    /*Vehiculo mVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia","Negro", 90.0, 2, true);
        System.out.println("INFO "+mVehiculo.toString());

    Vehiculo miVeh2 = new Deportivo("7821 NUO", "Aston Martin", "Vantage", "Verde", 100.0, 32);
        System.out.println("INFO "+miVeh2.toString());

    Vehiculo miVeh3 = new Furgoneta("2354 DGF", "Mercedes", "Benz", "Negro", 90.0, 200, 150);
        System.out.println("INFO "+miVeh3.toString());*/

        //Ejemplo de DownCasting (Revienta)
        Vehiculo miVehiculo = new Turismo("4090 TUR", "Skoda", "Fabia","Negro", 90.0, 2, true);
        Turismo miNuevoTurismo= (Turismo) miVehiculo;
        if(miNuevoTurismo instanceof Turismo)
        System.out.println("turismo: "+(Turismo) miNuevoTurismo);

        //ERROR GRAVE
        Deportivo miNuevoDeportivo= (Deportivo) miVehiculo;
        if(miNuevoDeportivo instanceof Deportivo)
        System.out.println("deportivo: "+(Deportivo) miNuevoDeportivo);

        //ERROR GRAVE
        Furgoneta miNuevaFurgoneta= (Furgoneta) miVehiculo;
        if(miNuevaFurgoneta instanceof Furgoneta)
        System.out.println("furgoneta: "+(Furgoneta) miNuevaFurgoneta);




    }
}