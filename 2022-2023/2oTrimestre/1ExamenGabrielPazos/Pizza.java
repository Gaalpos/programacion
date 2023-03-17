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
 * Clase para crear una pizza
 * @author Gaalpos
 * @version 1.2
 * Copyright 2023 All rights reserved
 */


public class Pizza {

/**
 * El precio base de la pizza
 */
  final static float PRECIO_BASE = 5;

/**
 * Un Arraylist de ingredientes
 */
  private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();


  /**
   * 
   * @return la cantidad de ingredientes de la pizza
   */
  public int getCantidadIngredientes() {
      return listaIngredientes.size();
  }

/**
 * Devuelve el precio de la pizza
 * @return El precio de la pizza
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
 * @param bola El ingrediente que añadimos
 */
  public void addIngrediente(Ingrediente bola) {
   listaIngredientes.add(bola);
  }



/**
 * Quita un ingrediente de la pizza
 * @param bola el ingrediente que quitamos
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



/** @return Los ingrediente en una cadena
 * @deprecated
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
 * Metodo toString
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
