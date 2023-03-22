import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

    static HashMap<String,String> dic= new HashMap();

    static String[] espanish={"ordenador","gato","rojo","árbol","pingüino","sol","agua","viento","siesta","arriba","raton","estadio","calumnia","aguacate","cuerpo","concurso","cena","salida","letçnteja","cacerola","pastel","Membrillo"};

    static void ponPalabras() {
		
        dic.put("ordenador", "computer");
        dic.put("gato", "cat");
        dic.put("rojo", "red");
        dic.put("árbol", "tree");
        dic.put("pingüino", "penguin");
        dic.put("sol", "sun");
        dic.put("agua", "water");
        dic.put("viento", "wind");
        dic.put("siesta", "siesta");
        dic.put("arriba", "up");
        dic.put("ratón", "mouse");
        dic.put("estadio", "arena");
        dic.put("calumnia", "aspersion");
        dic.put("aguacate", "avocado");
        dic.put("cuerpo", "body");
        dic.put("concurso", "contest");
        dic.put("cena", "dinner");
        dic.put("salida", "exit");
        dic.put("lenteja", "lentil");
        dic.put("cacerola", "pan");
        dic.put("pastel", "pie");
        dic.put("membrillo", "quince");
}
    public static void main(String[] args) {
        ponPalabras();
        String pal="";
        Scanner sc= new Scanner(System.in);
        int bien=0;
        String ent="";

        for(int i=0;i<5;i++){
            ent= espanish[(int)(Math.random()*20)];
            System.out.println("palabra en español "+ent);
            pal=sc.nextLine();

            if(pal.equals(dic.get(ent)))
                bien++;
        }
        System.out.println("has acertado "+bien);
      /*   if(dic.containsKey(pal))
        System.out.println("traducido: "+dic.get(pal));
        else
        System.out.println("no encuentro la palabra");*/
    }
}
