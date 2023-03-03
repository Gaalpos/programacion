package codigos;


public class propuesto8c {
    public static char getLetras() {
        return (char) (Math.random() * (97 - 122 + 1) + 122);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char letra;

        letra = getLetras();

        boolean b = Math.random() < 0.5;

        if (b)
            letra = Character.toUpperCase(letra);
            
        System.out.println("letra generada:" + letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
                || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("generada vocal");

        } else {
            System.out.println("generada consonante");

        }
    }

}
