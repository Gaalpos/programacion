public class Divisor {

    public static void main(String[] args) {
        int numero = 18; // pero te lo pueden entrar supongo que sabes como hacerlo
        // iteras desde 1 hasta el numero para encontrar los divisores
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                // imprimes la solucion
                System.out.println(i);
            }
        }
    }
}