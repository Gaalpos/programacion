
public class TestObjeto3D {
    public static void main (String[] args) {
        Objeto3D Caja = new Objeto3D();
        Objeto3D Esfera = new Objeto3D();
        Objeto3D Bicicleta = new Objeto3D();
        
        Caja.Dimensiones(20.0,12.5,30.2,"centimetros");
        Esfera.Dimensiones(10.0,"pulgadas",10.0,10.0);
        Bicicleta.Dimensiones(90.0,30.0,20.0);
        
        System.out.println(Bicicleta.DimeMedida());
        System.out.println(Bicicleta.DimeAlto());
        
        Bicicleta.Dimensiones("pulgadas");
        
        System.out.println(Bicicleta.DimeMedida());
        System.out.println(Bicicleta.DimeAlto());
        
        }
}
