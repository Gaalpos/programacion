public class Optimiza {

  String frutas[] = {
    "platano",
    "fresa",
    "pomelo",
    "limon",
    "naranja",
    "pera",
  };

  /* Este método busca si una fruta está en la lista de frutas */
  boolean busca(String frutaABuscar) {
    for (String fruta : frutas) {
      if (fruta.equals(frutaABuscar)) {
       return true;
      }
    }
    return false;
  }

  // Función que determine si hay alguna fruta repetida en la lista
  public boolean hayFrutaRepetida() {
    for (int i = 0; i < frutas.length; i++) {
      for (int j = i + 1; j < frutas.length; j++) {
        if (frutas[i].equals(frutas[j])) {
          return true;
        }
      }
    }
    return false;
  }

  /* Este cuenta cuntas frutas hay de como minimo X letras */
  int cuentaFrutasConMinimoLetras(int minimoLetras) {
    int contador = 0;
    for (String fruta : frutas) {
      if (fruta.length() >= minimoLetras) {
        contador++;
      }
    }
    return contador;
  }

  /* Calcula la media de caracteres de todas las frutas*/
  // En el ejemplo la media de todos los caracteres es 7+5+6+5+7+4 / 6 = 30.66^
  float mediaCaracteres() {
    int total = 0;
    for (String frase : frutas) {
      total += frase.length();
    }
    return (float)total / frutas.length;
  }

  /* Por cada fruta, devuelve el numero de caracteres de cada fruta dividido por
la media de caracteres totales */
  // Contamos numero de caracteres de cada fruta = [7+5+6+5+7+4]
  // Numero total de frutas = 6
  // Media total de caracteres = 7+5+6+5+7+4 / 6 = 30.66^
  // Dividimos el numero de caracteres de cada fruta por la media total de
  //caracteres
  // [0.22, 1.16, 0.19, 0.16, 0.22, 0.13]

  
  float[] numerosCaracteresDivididoEntreMediaTotal() {
    float[] resultado = new float[frutas.length];
    for (int i = 0; i < frutas.length; i++) {
      resultado[i] = frutas[i].length() / mediaCaracteres();
    }
    return resultado;
  }
}
