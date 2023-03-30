package TercerTrimestre;

public class TestTelefonio {
    public static void main(String[] args) {
        
        Telefono ModeloBarato = new Telefono(2);
        Telefono ModeloMedio = new Telefono(4);
        
        ModeloBarato.Llamar("670879078");
        System.out.println(ModeloBarato);
        ModeloBarato.Llamar("670674590");
        System.out.println(ModeloBarato);
        System.out.println(ModeloBarato.UltimaLlamada());
        ModeloBarato.Llamar("670234590");
        System.out.println(ModeloBarato);   
        ModeloBarato.Llamar("670069423");
        System.out.println(ModeloBarato.Llamada(1));
        
        ModeloMedio.Llamar("670879078");
        ModeloMedio.Llamar("670674590");
        System.out.println(ModeloMedio.UltimaLlamada());
        ModeloMedio.Llamar("670234590");
        ModeloMedio.Llamar("670069423");
        ModeloMedio.Llamar("670069498");
        ModeloMedio.Llamar("670069499");
        System.out.println(ModeloMedio.Llamada(1));
        
        }
}
