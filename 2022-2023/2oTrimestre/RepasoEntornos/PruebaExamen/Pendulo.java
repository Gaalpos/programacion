/**
 * Calcula el periodo de oscilacion, la frecuencia y la acelaracion angular de un pendulo
 * *Copyright (c) 2023, Gabriel. All rights reserved.
 * @author GabrielPazos
 * @version 1.4
 */


class Pendulo {
    float longitud;

    /**
     * Longitud de la cuerda de l pendulo`
     * @param longitud Longitud de la cuerda del pendulo
     */
    public Pendulo(float longitud) {
        super();
        this.longitud = longitud;
    }

    /**
     * Este metodo calcula el periodo del pendulo
     * @param gravedad Valor de la gravedad (9.8 m/s2 en la Tierra, 1.62 m/s2 en la Luna)
     * @return el Periodo  del pendulo
     * @throws ArithmeticException Devolvemos una  ArithmeticException cuando el pendulo no tenga longitud correcta
     * o el periodo sea infinito
     */
    double getPeriodo(float gravedad) throws ArithmeticException {
        if (longitud < 0)
            throw new ArithmeticException("El pendulo no tiene lontigud correcta");
        if (gravedad <= 0)
            throw new ArithmeticException("El periodo es infinito");
        return 2 * Math.PI * Math.sqrt(longitud / gravedad);
    }

    /**
     * Este metodo calcula la Frecuencia del pendulo
     * @param gravedad Valor de la gravedad (9.8 m/s2 en la Tierra, 1.62 m/s2 en la Luna)
     * @return La frecuencia del pendulo en Hercios
     */
    double getFrecuencia(float gravedad) {
        if (longitud < 0)
            throw new ArithmeticException("El pendulo no tiene lontigud correcta");
        if (gravedad <= 0)
            throw new ArithmeticException("El periodo es infinito");
        return 1 / getPeriodo(gravedad);
    }


/**
 * Este metodo calcula la aceleracion angular del pendulo
 * @param gravedad Valor de la gravedad (9.8 m/s2 en la Tierra, 1.62 m/s2 en la Luna)
 * @param anguloEnGrados El angulo en grados
 * @return Aceleracion angular  en m/s2
 */
    double getAceleracionAngular(float gravedad, int anguloEnGrados) {
        if (longitud < 0)
            return 0;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        return -(gravedad / longitud) * Math.sin(anguloEnRadianes);
    }
}