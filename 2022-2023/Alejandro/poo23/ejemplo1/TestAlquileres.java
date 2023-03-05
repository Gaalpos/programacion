package poo23;


public class TestAlquileres {
    public static void main(String[] args) {
        //Se crea una instancia de la clase vehículo
        Vehiculo vehiculo1= new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",100.0);
        Vehiculo vehiculo2= new Vehiculo("2345 JVM", "SEAT", "Leon", "Negro",80.0);

        //Se crea una instancia de la clase cliente
        Cliente cliente1= new Cliente("247802140x", "Juan", "Perez");

        //Se crea una instancia de la clase vehiculo
        VehiculoAlquilado alquiler1= new VehiculoAlquilado(cliente1, vehiculo2, 11, 11, 2011, 2);

        System.out.println("Vehiculo Alquilado");
        System.out.println("Cliente : "+alquiler1.getCliente().getNif()+" "+alquiler1.getCliente().getNombre()+" "+ alquiler1.getCliente().getApellidos());
        System.out.println("Vehiculo: "+alquiler1.getVehiculo().getMatricula());
        System.out.println("Dias de alquiler");
        System.out.println(alquiler1.getTotalDiasAlquiler());



    }
}
