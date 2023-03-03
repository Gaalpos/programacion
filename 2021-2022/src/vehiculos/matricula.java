package vehiculos;

public class matricula {
    static String[] INVALID_PLATE_LETTERS = { "FOR", "AXE", "JAM", "JAB", "ZIP", "ARE", "YOU",
            "JUG", "JAW", "JOY" };

    static String generateLetters(int amount) {
        String letters = "";
        int n = 'Z' - 'A' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('A' + Math.random() * n);
            letters += c;
        }
        return letters;
    }

    static String generateDigits(int amount) {
        String digits = "";
        int n = '9' - '0' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('0' + Math.random() * n);
            digits += c;
        }
        return digits;
    }

    static String generateLicensePlate() {
        String licensePlate;
        String letters;
        do {
            letters = generateLetters(3);
        } while (illegalWord(letters));

        String digits = generateDigits(4);

        licensePlate = digits+" "+letters;
        return licensePlate;
    }

    private static boolean illegalWord(String letters) {
        for (int i = 0; i < INVALID_PLATE_LETTERS.length; i++) {
            if (letters.equals(INVALID_PLATE_LETTERS[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        System.out.println(generateLicensePlate());
    }
}