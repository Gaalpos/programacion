package Boletin;
/*1. Leer 5 números y mostrarlos en el mismo orden 
introducido. */
/*En Java, el siguiente código genera un número aleatorio entre dos valores, un mínimo y un máximo:

int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
Por ejemplo, si queremos elegir un número aleatorio entre los valores 18 y 65, ambos inclusive, sería así:

int n = (int) (Math.random() * (66 - 18)) + 18;
Otra forma de hacerlo es también:

Random r = new Random();
int n = r.nextInt(6-4)+4; */
public class ejercicio1 {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
