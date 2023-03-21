import java.util.HashSet;
import java.util.Set;

public class Optimiza1{


    String frutas[] = { "platano", "fresa", "pomelo", "limon", "naranja", "pera" };


boolean busca(String frutaABuscar) {
    for (String fruta : frutas) {
        if (fruta.equals(frutaABuscar)) {
            return true;
        }
    }
    return false;
}


public boolean hayFrutaRepetida() {
    Set<String> frutasVistas = new HashSet<>();
    for (String fruta : frutas) {
        if (frutasVistas.contains(fruta)) {
            return true;
        }
        frutasVistas.add(fruta);
    }
    return false;
}



int cuentaFrutasConMinimoLetras(int minimoLetras) {
    int contador = 0;
    for (String fruta : frutas) {
        if (fruta.length() >= minimoLetras) {
            contador++;
        }
    }
    return contador;
}

float mediaCaracteres() {
    float suma = 0;
    for (String frase : frutas) {
        suma += frase.length();
    }
    return suma / frutas.length;
}

int[] numerosCaracteresDivididoEntreMediaTotal(){
    int[] resultado = new int[frutas.length];
    int mediaTotal = Math.round(mediaCaracteres());
    for(int i=0;i<frutas.length;i++){
        resultado[i] = frutas[i].length() / mediaTotal;
    }
    return resultado;
}

}