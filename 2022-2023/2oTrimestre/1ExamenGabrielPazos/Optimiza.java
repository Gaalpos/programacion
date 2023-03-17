
/*
 * Se parte del siguiente programa que almacena un conjunto de frutas y realiza una serie de
cálculos sobre ellas.
Las frutas no se van a modificar (ni se van a añadir o quitar frutas)
Se pide que optimices (en la medida de lo posible) todos los métodos del ejercicio:
● Puede que no todos los métodos requieran ser optimizados.
● Pon, encima de cada método, una breve explicación de lo que has hecho para
optimizar.
 */

public class Optimiza {
    String frutas[] = { "platano", "fresa", "pomelo", "limon", "naranja", "pera" };

    /* Este método busca si una fruta está en la lista de frutas */
    // boolean busca(String frutaABuscar) {
    //     boolean siEsta = false;
    //     boolean noEsta = true;
    //     for (String fruta : frutas) {
    //         if (fruta.equals(frutaABuscar)) {
    //             siEsta = true;
    //             noEsta = false;
    //         }
    //     }
    //     noEsta = !siEsta;
    //     return siEsta;
    // }

    /*No hace falta crear variables boolean para indicar si esta o no. Sirve con devolver true si la fruta esta 
     * y devolver false si la fruta no esta
     */
    boolean BuscaOptimizado (String frutaABuscar){
        // boolean esta = false;
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
        int num = contador;
        for (String fruta : frutas) {
            if (fruta.length() >= minimoLetras) {
                num = contador;
                contador++;
            }
        }
        num = num / frutas.length;
        return contador;
    }

    /* Calcula la media de caracteres de todas las frutas */
    // En el ejemplo la media de todos los caracteres es 7+5+6+5+7+4 / 6 = 30.66^
    float mediaCaracteres() {
        float suma = 0;
        for (String frase : frutas) {
            suma += frase.length();
        }
        return suma / frutas.length;
    }

    /*
     * Por cada fruta, devuelve el numero de caracteres de cada fruta dividido por
     * la media de caracteres totales
     */
    // Contamos numero de caracteres de cada fruta = [7+5+6+5+7+4]
    // Numero total de frutas = 6
    // Media total de caracteres = 7+5+6+5+7+4 / 6 = 30.66^
    // Dividimos el numero de caracteres de cada fruta por la media total de
    // caracteres
    // [0.22, 1.16, 0.19, 0.16, 0.22, 0.13]
    float[] numerosCaracteresDivididoEntreMediaTotal() {
        float[] resultado = new float[frutas.length];
        for (int i = 0; i < frutas.length; i++) {
            resultado[i] = frutas[i].length() / mediaCaracteres();
        }
        return resultado;
    }

}
