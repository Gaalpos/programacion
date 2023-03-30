package TercerTrimestre;

import java.util.Arrays;

public class Telefono {
    private int Max_Llamadas;
private String[] LlamadasHechas;

private int NumLlamadaHecha = -1;

Telefono(int Max_Llamadas) {
this.Max_Llamadas = Max_Llamadas;
LlamadasHechas = new String[Max_Llamadas];
 }

public void Llamar(String Numero) {
// Hacer la llamada
NumLlamadaHecha = (NumLlamadaHecha+1)%Max_Llamadas;
LlamadasHechas[NumLlamadaHecha] = Numero;
}

public String UltimaLlamada() {
return Llamada(0);
}

public String Llamada(int n) {// La ultima llamada es n=0
if (n<=NumLlamadaHecha)
return LlamadasHechas[NumLlamadaHecha-n];
else
return LlamadasHechas[Max_Llamadas-(n-NumLlamadaHecha)];
}

@Override
public String toString() {
    return "Telefono [Max_Llamadas=" + Max_Llamadas + ", LlamadasHechas=" + Arrays.toString(LlamadasHechas)
            + ", NumLlamadaHecha=" + NumLlamadaHecha + "]";
}

}
