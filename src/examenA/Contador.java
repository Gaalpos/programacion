package examenA;

public class Contador {
	private int cont;
	
	//constructor por defecto
	Contador(){
		cont=0;
	}
	Contador(int n){
		cont=n;
	}
	
	public void sumar(float sumar) {
		cont += sumar;
	}
	public void restar(float restar) {
		cont -=restar;
		if(cont<0) {
			cont=0;
		}
	}
	
	public float cont() {
		return cont;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
	
	
}
