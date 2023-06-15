/**
 * @author Gaalpos
 * @version 1.2
 * @
 */

import java.util.ArrayList;

/**
 * Clase que representa un ingrediente de pizza
 */

class Ingrediente {

    /**
     * define el nombre del ingrediente
     */
  private String nombre;
  /**
   * Define el precio del ingrediente
   */
  private float precio;

  /**
   * COnstructor de la clase Ingrediente
   * @param nombre nombre del ingrediente
   * @param precio precio del ingrediente
   */
  public Ingrediente(String nombre, float precio) {
    super();
    this.nombre = nombre;
    this.precio = precio;
  }


  /**
   * Obtiene el nombre del ingrediente
   * @return nombre del ingrediente
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Establece el nombre del ingrediente
   * @param nombre nombre del ingrediente
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   *  Obtiene el precio del ingrediente
   * @return el precio del ingrediente
   */
  public float getPrecio() {
    return precio;
  }


/**
 * Establece el precio del ingrediente
 * @param precio el precio del ingrediente
 */
  public void setPrecio(float precio) {
    this.precio = precio;
  }
}

/**
 * Clase que representa una pizza
 */

public class Pizza {

    /**
     * Precio base de la pizza
     */
  static final float PRECIO_BASE = 5;

  /**
   * Arraylist que guarda todos los ingredientes de la pizza
   */
  private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();


  /**
   * Obtiene la cantidad de ingredientes en la pizza
   * @return la cantidad de ingredientes
   */
  public int getCantidadIngredientes() {
    return listaIngredientes.size();
  }

  /**
   * Obtiene el coste total de la pizza
   * @return el coste de la pizza
   */
  public float getCostePizza() {
    float coste = PRECIO_BASE;
    for (Ingrediente i : listaIngredientes) {
      coste += i.getPrecio();
    }
    return coste;
  }

  /**
   * Añade un ingrdiente a la pizza
   * @param bola el ingrediente a añadir
   */
  public void addIngrediente(Ingrediente bola) {
    listaIngredientes.add(bola);
  }
  
/**
 * Quita un ingrediente de la pizza
 * @param bola el ingrediente a quitar
 */
  public void quitarIngrediente(Ingrediente bola) {
    listaIngredientes.remove(bola);
  }
  
/**
 * Quita todos los ingredientes de la pizza
 */
  public void quitarTodosLosIngredientes() {
    listaIngredientes.clear();
  }

  /**
   * Obtener los ingredientes en formato  texto
   * @return una cadena con los ingredientes
   */
  public String obtenerIngredientesFormatoTexto() {
    String resultado = "";
    for (Ingrediente i : listaIngredientes) {
      resultado += i.getNombre();
      resultado += "\n";
    }
    return resultado;
  }

  /**
   * Devuelve una representacion de la pizza en forma de cadena de texto
   * 
   * @return representacion de la pizza en una cadena
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Ingrediente i : listaIngredientes) {
      sb.append(i.getNombre());
      sb.append("\n");
    }
    return sb.toString();
  }
}
