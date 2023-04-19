import java.util.ArrayList;

public class Ejercicio7 {
    //Ejercicio 7

    static ArrayList<Moneda> lista = new ArrayList<Moneda>();
    public static void main(String[] args) {
        /*for(int i=0;i<10;i++){
        Moneda m= new Moneda();
        System.out.println(m.toString()); */
        int contador=1;
        Moneda m = new Moneda();
        System.out.println(m.toString());
        lista.add(m);
do {
    Moneda ultima= new Moneda();
    if( ultima.getLado().equals(m.getLado()) || ultima.getValor().equals(m.getValor())){
        lista.add(ultima);
        System.out.println(ultima.toString());
        m=ultima;
        contador++;
    }
    else{
        System.out.println(ultima.toString());
        System.out.println("no vale");
    }
} while (lista.size()<6);

for(Moneda s : lista){
    System.out.println(s.toString());
}

    }

    }

