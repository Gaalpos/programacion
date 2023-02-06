package cadenas;

public class InvertirOrden {
    
public static void main(String[] args) {
    
    double numero=3.1415926535d;
    String rev="";

    //lo convertimos en una cadena de texto.
    String numeroTexto = String.valueOf(numero);
    //Recorremos sus digitos uno por uno, empezando por el final.
    for(int i=numeroTexto.length()-1; i>=0; i-- ) {
    //Imprimimos cada digito individual (incluidoel punto decimal).
    rev=rev+numeroTexto.charAt(i);     
    System.out.println(numeroTexto.charAt(i));
    }
    System.out.println();
    System.out.println(rev);

    double num=Double.parseDouble(rev);

    System.out.println("otra vez es numero: "+num);
}

}
