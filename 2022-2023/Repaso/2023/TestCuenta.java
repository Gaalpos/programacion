public class TestCuenta {

    public static void main(String[] args) {
        int cuentas = 0;

        Cuenta Berry = new Cuenta();
        cuentas++;
        Cuenta Gaalpos = new Cuenta(600, " Gabriel Pazos ALonso", 1);
        cuentas++;

        System.out.println(Berry.toString());
        System.out.println(Gaalpos.toString());
        System.out.println("Numero de cuentas: " + cuentas);

        System.out.println("Saldo de Gaalpos: " + Gaalpos.saldo());
        Berry.deposito(5200d);
        System.out.println("Saldo de Berry: " + Berry.saldo());
        Gaalpos.retiro(53);
        System.out.println("Saldo de Gaalpos: " + Gaalpos.saldo());
        Gaalpos.interes(0.22);
        System.out.println("Saldo de Gaalpos: " + Gaalpos.saldo());

    }
}
