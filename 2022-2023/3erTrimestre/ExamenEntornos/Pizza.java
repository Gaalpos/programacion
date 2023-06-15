import java.util.ArrayList;

class Ingrediente {

  private String nombre;
  private float precio;

  public Ingrediente(String nombre, float precio) {
    super();
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }
}


/**
 * Clase que representa una pizaa
 */
public class Pizza {

    /**
     * Establece el precio base de la pizza
     */
  static final float PRECIO_BASE = 5;

  /**
   * Array que guarda una lista con los ingredientes de la pizza
   */
  private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

  /**
   * Obtiene la cantidad de ingredientes de la pizza
   * @return la cantidad de ingredientes de la pizza
   */
  public int getCantidadIngredientes() {
    return listaIngredientes.size();
  }

  /**
   * Obtiene el coste total de la pizza
   * @return la cantidad de ingredientes de la pizza
   */
  public float getCostePizza() {
    float coste = PRECIO_BASE;
    for (Ingrediente i : listaIngredientes) {
      coste += i.getPrecio();
    }
    return coste;
  }

  /**
   * Añade un ingrediente a la pizza
   * @param bola el ingrediente a añadir
   */
  public void addIngrediente(Ingrediente bola) {
    listaIngredientes.add(bola);
  }

  /**
   * Quita un ingrediente de la pizza
   * @param bola el ingrediente a eliminar
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
 * Obtiene los ingredientes en formato cadena
 * @return la lista de ingredientes en una cadena
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
   * Devuelve una represenatacion de la pizza en formato cadena
   * @return la pizza en formato cadena
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
