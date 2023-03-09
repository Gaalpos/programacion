public class Optimizacion {
    int i = 1;

    void ejercicioSinOptimizar() {
        while (i < 100) {
            System.out.println(i);
            i++;
        }
    }

    void ejercicioOptimizado() {
        int i=1;
        String temp = "";
        while (i < 100) {
           temp += i + "\n";
           i++;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Optimizacion op = new Optimizacion();

        op.ejercicioOptimizado();
        op.ejercicioSinOptimizar();
    }
}