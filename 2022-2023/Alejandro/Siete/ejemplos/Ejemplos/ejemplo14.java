package Siete.ejemplos.Ejemplos;

public class ejemplo14 {

    public static void main(String[] args) {

        StringBuffer nome = new StringBuffer("torreon");
        nome.reverse();
        System.out.println(nome);

        StringBuffer modulo = new StringBuffer("lenguaje de marcas y sistemas de gestión de información");
        modulo.delete(21, 67);
        System.out.println(modulo);

        modulo.replace(0, 11, "lenjuage de");
        System.out.println(modulo);

        // ojo al método substring ----> devuelve un String
        String inmuta = modulo.substring(0, 15);
        System.out.println(inmuta);

        // ojo devuelve un String

        String fin = modulo.toString();
        System.out.println(fin + " tamaño: " + fin.length());
    }
}
