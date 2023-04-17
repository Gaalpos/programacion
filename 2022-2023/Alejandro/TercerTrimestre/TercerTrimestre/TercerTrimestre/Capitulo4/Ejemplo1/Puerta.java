package TercerTrimestre.Ejemplo1;

public class Puerta {
    LogisticaCC Parking = null;

    Puerta(LogisticaCC Parking) {
        this.Parking = Parking;
    }

    public void EntraVehiculo() {
        if (Parking.HayHueco()) {
            System.out.println("Puede entrar");
            Parking.MeteContenedor();
        } else
            System.out.println("Aparcamiento completo");
    }

    public void SaleVehiculo() {
        if (Parking.HayContenedor()) {
            System.out.println("Puede salir");
            Parking.SacaContenedor();
        } else
            System.out.println("Aparcamiento vacío");

    }

}
