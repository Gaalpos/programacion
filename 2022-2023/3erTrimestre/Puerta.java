public class Puerta {

  LogisticaC Parking = null;

  Puerta(LogisticaC Parking) {
    this.Parking = Parking;
  }

  public void EntraVehiculo() {
    if (Parking.HayHueco()) {
      System.out.println("Puede entrar");
      // Abrir la barrera
      Parking.MeteContenedor();
    } else System.out.println("Aparcamiento completo");
  }

  public void SaleVehiculo() {

    if(Parking.HayContenedor()){
       // Comprobar el pago
    System.out.println("Puede salir"); 
    // Abrir la barrera
    Parking.SacaContenedor();
    }else{
      System.out.println(" No hay nada que sacar");
    }

   
   
  }
}
