import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VentaTest {

    @Test
    public void testCalcula_coste_venta() {
        Venta v = new Venta();
        v.tieneCuponGratis = true;
        float total = v.calcula_coste_venta();
        assertEquals(0, total,0);
    }
    
    @Test
    void testCalculaCosteDeVentaNormal(){
        Venta v = new Venta();
        v.tipoDeCliente = Venta.TipoCliente.NORMAL;
        v.tieneCuponGratis=false;
        v.coste=1000;
        v.dto=50;
        float total = v.calcula_coste_venta();
        assertEquals(51000, total,0);
    }
}
