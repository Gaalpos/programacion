// Documentar, test, refactorizar, optimizar

/**
 * Clase que  permite calcular el coste de una venta
 * @author Gaalpos
 * @version 1.0
 */

public class Venta{

    /**Coste de la venta */
    float coste;
   /**descuento de la venta */
    float dto;
 /**Dtipo de cliente que realiza la venta */
    enum TipoCliente{
        GOLD, PLATINUM, NORMAL
    };
    /** Determina si un cliente es tambien empelado */
    boolean esEmpleado;
    /**dterminta el tipo de cliente */
    TipoCliente tipoDeCliente;
    /**determina si el clente tiene cupon gratuito */
    boolean tieneCuponGratis;
    /**nombre del cliente que realiza la compra */
    String NombreEmpleado;

    /**
     * 
     * Metodo que calcula el total con descuento de la venta
     * @return el valor total con descuento
     */
    float calcula_coste_venta(){
        if(esEmpleado) return 0;
        else if (tipoDeCliente == TipoCliente.GOLD) return 0;
        else if (tipoDeCliente == TipoCliente.PLATINUM) return 0;
        else if (tipoDeCliente == TipoCliente.GOLD) return 0;
        else if (tieneCuponGratis == true ) return 0;
        else return coste * dto - coste;
    }
}