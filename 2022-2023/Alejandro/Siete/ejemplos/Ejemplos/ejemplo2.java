package Ejemplos;

public class ejemplo2 {
    public static void mostrarArray(byte[] arr) {
        byte[] temperaturas = arr;
        for (int j = 0; j < temperaturas.length; j++) {
            System.out.print(temperaturas[j] + " ");

        }

        System.out.println("j");
        System.out.println();
    }

    


    public static void main(String[] args) {

        byte[] temperaturas1 = { 10, 11, 12, 11, 10, 9, 18, 19, 14, 13, 15, 15 };
        System.out.println("numero de valores: " + temperaturas1.length);
        byte[] temperaturas2 = temperaturas1.clone();
        byte[] temperaturas3 = temperaturas1;

        System.out.println("temperaturas 1");
        for (int j = 0; j < temperaturas1.length; j++) {
            System.out.print(temperaturas1[j] + " ");

        }
        System.out.println();
        System.out.println("temperaturas 2");
        for (int j = 0; j < temperaturas2.length; j++) {
            System.out.print(temperaturas2[j] + " ");

        }
        System.out.println();
        System.out.println("temperaturas 3");
        for (int j = 0; j < temperaturas3.length; j++) {
            System.out.print(temperaturas3[j] + " ");

        }
        System.out.println();
        System.out.println();

        if (temperaturas1.equals(temperaturas2)) {

            System.out.println("Temperaturas 1 y 2 son iguales");
        } else {
            System.out.println("Temperaturas 1 y 2 no son iguales");
        }

        System.out.println(temperaturas1.toString());
        System.out.println(temperaturas2.toString());

        if (temperaturas1.equals(temperaturas3)) {

            System.out.println("Temperaturas 1 y 3 son iguales");
        } else {
            System.out.println("Temperaturas 1 y 3 no son iguales");
        }

        System.out.println(temperaturas1.toString());
        System.out.println(temperaturas3.toString());


        //Vamos a cambiar un valor individual en temp1
        temperaturas1[0]=55;
        //Vamos a cambiar un valor individual en temp3
        temperaturas3[4]=-15;

        System.out.println("temperaturas 1");
        System.out.println(mostrarArray(temperaturas1));
    }

}


