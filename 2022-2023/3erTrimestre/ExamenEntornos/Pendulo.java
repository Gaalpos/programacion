/**
 * @author Gaalpos
 */

/**
  * Este ejercicio calcula el periodo de oscilación (en segundos) y la frecuencia en
Hercios(Hz) de un péndulo dada su longitud, y la gravedad del planeta en el que te
encuentres.
El ejercicio también calcula la aceleración angular del péndulo, en función de la gravedad
y su ángulo.
  */
class Pendulo {

    /**
     * Longitud de la cuerda
     */
  float longitud;

  public Pendulo(float longitud) {
    super();
    this.longitud = longitud;
  }

  /**
   * OCalcula y obtiene el periodo del pendulo
   * @param gravedad del planeta 
   * @return el periodo del pendulo 
   * @throws ArithmeticException cuando la cuerda o la gravedad sean menor que cero
   */
  double getPeriodo(float gravedad) throws ArithmeticException {
    if (longitud < 0) throw new ArithmeticException(
      "El pendulo no tiene lontigud correcta"
    );
    if (gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
    return 2 * Math.PI * Math.sqrt(longitud / gravedad);
  }

  /**
   * Calcula y obtine la frecuencia del pendulo
   * @param gravedad del planeta 
   * @return la frecuentia en hercios
   */
  double getFrecuencia(float gravedad) {
    if (longitud < 0) throw new ArithmeticException(
      "El pendulo no tiene lontigud correcta"
    );
    if (gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
    return 1 / getPeriodo(gravedad);
  }

  /**
   * Calcula y obtiene la aceleracion angular del pendulo
   * @param gravedad del planeta 
   * @param anguloEnGrados el anggulo del pendulo en grados
   * @return la acelereacion angular en m/s^2
   */
  double getAceleracionAngular(float gravedad, int anguloEnGrados) {
    if (longitud < 0) return 0;
    double anguloEnRadianes = Math.toRadians(anguloEnGrados);
    return -(gravedad / longitud) * Math.sin(anguloEnRadianes);
  }
}
