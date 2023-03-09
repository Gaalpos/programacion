package poo23.ejemplo1;

public class TestAlquileres {

    public static void main(String[] args) {
        
//se crean dos instancias de la clase vehiculo
Vehiculo vehiculo1 = new Vehiculo("4050", "VW", "Blanco", "100.0");
Vehiculo vehiculo2 = new Vehiculo("2345", "JVM", "Leon", "negr",80.0);

//Se crea una instancia de la clase cliente
Cliente cliente1 = new Cliente("30435636X", "Juan", "Perez");

//Se crea una instancia de la clase VehiculoAlquilado que relaciona cliente1
//con el vehiculo, el vehiculo se alquila con fecha  11/11/2011 durante 2 dias
VehiculoAlquilado alquiler1 =  new VehiculoAlquilado(cliente1, vehiculo1, 11, 11,2011, 2);

//Interesante puedo obtener info del vehiculo y tambien del cliente
System.out.println("Vehiculo alquilado");
System.out.println("Cliente:" +
alquiler1.getCliente().getNif() + " " +
alquiler1.getCliente().getNombre() + " " +
alquiler1.getCliente().getApellidos());
System.out.println("Vehiculo: " +
alquiler1.getVehiculo().getMatricula());
System.out.println("Dias de alquiler");
System.out.println(alquiler1.getTotalDiasAlquiler());

    }
    
}
