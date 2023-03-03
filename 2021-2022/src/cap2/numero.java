package cap2;

public class numero {
	
	//atributo
	int n;
	
	numero(int n){
		this.n=n;
	}
	public int calcularDoble() {
		return 2*n;
	}
	public int calcularTriple() {
		return 3*n;
	}
	
	public int calcularCuadrado() {
		return n*n;
	}
	
	public int calcullarElevadoAOcho() {
		return (int) Math.pow(n,8);
	}
	
	public int CalcularPotenciaGeneral(int exp) {
		return (int) Math.pow(n, exp);
	}
	
	public double calcularRaizCuadrada() {
		return Math.sqrt(n); //Math.pow(n,0.5)
	}
	@Override
	public String toString() {
		return "numero [n=" + n + "]";
	}
	

}
