import java.util.ArrayList;

import javax.sql.rowset.spi.SyncResolver;

public class ejemplo1 {


    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        System.out.println("Nº de elementos: " + colores.size());
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        System.out.println("Nº de elementos: " + colores.size());
        colores.add("blanco");
        System.out.println("Nº de elementos: " + colores.size());

        System.out.println("El elemento que hay en la posición 0 es " + colores.get(0));
        System.out.println("El elemento que hay en la posición 3 es " + colores.get(3));

        for(int i = 0; i < colores.size(); i++ ){
            System.out.println(" posicion " + i +  " color "+ colores.get(i));
        }

        for(String cad : colores)
            System.out.println(" color "+ cad);

        System.out.println(colores);
        colores.remove("blanco");

    }
    
}
