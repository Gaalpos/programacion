package cap2;

public class CuentaCorriente {
	private String titular;
	private float saldo;
	public static int nCuentas;

	// Constructores
	// Constructor por defecto
	CuentaCorriente() {
		titular = "";
		saldo = 0f;
		nCuentas++;
	}

	// Constructores con parámetros
	CuentaCorriente(float n) {
		titular = "";
		saldo = n;
		nCuentas++;
	}

	CuentaCorriente(String nombre) {
		titular = "nombre";
		saldo = 0;
		nCuentas++;
	}

	CuentaCorriente(String nombre, float n) {
		titular = "nombre";
		saldo = n;
		nCuentas++;
	}

	// Metodos propios del enunciado
	public float saldo() {
		return saldo;
	}

	public void deposito(float cantidad) {
		saldo += cantidad;
	}

	public void retiro(float cantidad) {
		saldo -= cantidad;
	}

	// Metodo set/get

	public String getTitutal() {
		return titular;
	}

	public static int getNCuentas() {
		return nCuentas;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setTitutal(String nombre) {
		titular = nombre;
	}

	public void setSaldo(float n) {
		saldo = n;
	}

	@Override
	public String toString() {
		return "titular=" + titular + ", saldo=" + saldo;
	}

}
