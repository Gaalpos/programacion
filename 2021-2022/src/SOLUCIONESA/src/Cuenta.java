/*Se desea llevar un control del estado de una cuenta  corriente; 
la cuenta corriente está caracterizada por su saldo y  el nombre de su titular y 
sobre ella se pueden realizar tres  tipos de operaciones: 
• Saldo: devuelve el saldo de la cuenta (puede ser negativo).  
• Depósito (cantidad): ingresa en la cuenta una cantidad de  dinero.  
• Retiro (cantidad): saca de la cuenta una determinada cantidad  de dinero.  
Suponga que la cuenta inicialmente tiene un saldo igual a cero.  
También, necesitamos un contador de todas las cuentas bancarias  existentes. 
Además, contendrá: Constructor por defecto.  Constructor con parámetros.
 Métodos setters/getters. Método  toString.  
Escriba una clase Cuenta Corriente que implemente las  funcionalidades descritas
*/
public class Cuenta {
	private String titular;
	private int saldo;
	public static int nCuentas;

	// Constructores
	// Constructor por defecto
	Cuenta() {
		titular = "";
		saldo = 0;
		nCuentas++;
	}

	// Constructores con parámetros
	Cuenta(int n) {
		titular = "";
		saldo = n;
		nCuentas++;
	}

	Cuenta(String nombre) {
		titular = nombre;
		saldo = 0;
		nCuentas++;
	}

	Cuenta(String nombre, int n) {
		titular = nombre;
		saldo = n;
		nCuentas++;
	}

	// Métodos
	public int saldo() {
		return saldo;
	}

	public void deposito(int cantidad) {
		saldo += cantidad;
	}

	public void retiro(int cantidad) {
		saldo -= cantidad;
	}

	// Métodos set/get
	public String getTitular() {
		return titular;
	}

	public int getNCuentas() {
		return nCuentas;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void setTitular(String nombre) {
		titular = nombre;
	}
	
	public void setSaldo(int n) {
		saldo = n;
	}
	
	@Override
	public String toString() {
		return "nCuentas = " + nCuentas + ", titular = " + titular + ", saldo = " + saldo;
	}

}

