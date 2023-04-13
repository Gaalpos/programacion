
public class Objeto3DConConstructor {
    public class Objeto3D {
        private double X = 0d;
        private double Y = 0d;
        private double Z = 0d;
        private String TipoMedida = "centimetro";
    }
    Objeto3DConConstructor(double Ancho, double Alto,
double Profundo, String Medida) {
Dimensiones3D(Ancho,Alto,Profundo);
TipoMedida(Medida);
}

void TipoMedida(String medida) {
    }

private void Dimensiones3D(double ancho, double alto, double profundo) {
    }

//Constructores
Objeto3DConConstructor(String Medida, double Ancho,
double Alto, double Profundo) {
this(Ancho,Alto,Profundo,Medida);
}
//este constructor utiliza internamente el constructor de línea
Objeto3DConConstructor(double Ancho, String Medida,
double Alto, double Profundo) {
this(Ancho,Alto,Profundo,Medida);
}

Objeto3DConConstructor(double Ancho, double Alto,
String Medida, double Profundo) {
this(Ancho,Alto,Profundo,Medida);
}

Objeto3DConConstructor(String Medida) {
TipoMedida(Medida);
}

Objeto3DConConstructor(double Ancho, double Alto,
double Profundo) {
Dimensiones3D(Ancho,Alto,Profundo);
}

public char[] DimeMedida() {
    return null;
}

public char[] DimeAlto() {
    return null;
}
}
