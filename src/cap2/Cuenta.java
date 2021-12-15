package cap2;

/*
 * Ejercicio 4A Se desea llevar un control del estado de una cuenta corriente; la
cuenta corriente está caracterizada por su saldo y el nombre de su titular y sobre
ella se pueden realizar tres tipos de operaciones:
· Saldo: devuelve el saldo de la cuenta (puede ser negativo). · Depósito (cantidad):
ingresa en la cuenta una cantidad de dinero.
· Retiro (cantidad): saca de la cuenta una determinada cantidad de dinero.

Suponga que la cuenta inicialmente tiene un saldo igual a cero.

También, necesitamos un contador de todas las cuentas bancarias existentes.
Además, contendrá: Constructor por defecto. Constructor con parámetros. Métodos
setters/getters. Método toString.

Escriba una clase Cuenta Corriente que implemente las funcionalidades descritas.

Utilícela creando al menos tres cuentas que prueben los métodos.
 */
public class Cuenta {

	private String titular;
	private float saldo;
	public static int nCuentas;

	// constructores

	// Contstructores por defecto
	Cuenta(){
		titular="";
		saldo=0f;
		nCuentas++;
	}

	//constructores con parámetros
	Cuenta(float n){
		titular = "";
		saldo = n;
		nCuentas++;
		
	}
	
	Cuenta(String nombre){
		titular = "nombre";
		saldo = 0;
		nCuentas++;
	}
	
	Cuenta(String nombre,float n){
		titular = "nombre";
		saldo = n;
		nCuentas++;
	}
	
	//métodos del propio enunciado
	public float saldo() {
		return saldo;
	}
	
	public void deposito(float cantidad) {
		saldo += cantidad;
	}
	public void retiro(float cantidad) {
		saldo -=cantidad;
	}
	
	
	//getters y setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public static int getnCuentas() {
		return nCuentas;
	}

	public static void setnCuentas(int nCuentas) {
		Cuenta.nCuentas = nCuentas;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}

	
	
}
