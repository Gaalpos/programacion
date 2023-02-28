//Add a new vehicle (motorbike)
// refactor this code

interface Volable{
    public void volar();
}

abstract public class Vehiculo {
    String nombre;
    float potencia;
    float peso;

    float getConsumo(){
        return potencia*peso;
    }
}

class avion extends Vehiculo implements Volable {
    public void volar(){

    }
}

class avioneta extends Vehiculo {
     public void volar(){
        
    }
}

class moto extends Vehiculo {
  
}