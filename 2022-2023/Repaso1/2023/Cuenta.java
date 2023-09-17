public class Cuenta {

    private double saldo;
    private String nombre;
    private int numCuenta;

    public Cuenta(double saldo, String nombre, int numCuenta) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }

    public Cuenta() {
        this.saldo = 0;
        this.nombre = "Su nombre aqui";
        this.numCuenta = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta [saldo=" + saldo + ", nombre=" + nombre + ", numCuenta=" + numCuenta + "]";
    }

    public double saldo() {
        return this.saldo;
    }

    public void deposito(double a) {
        this.saldo = this.saldo + a;

    }

    public void retiro(double a) {
        this.saldo = this.saldo - a;

    }

    public void interes(double a) {
        this.saldo = this.saldo * (1 + a);
    }

}
