package resueltos;



/*Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del
restaurante. Implementa los siguientes métodos:
public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
public void addPapas(int x). Añade x kilos de papas a los ya existentes.
public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el
método anterior).
public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén.
public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.*/



public class israel {

	private	double patatas;// En kilos
	private	double chocos;// En kilos

	israel(){
		patatas=0;
		chocos=0;
		
	}
	
	
	israel(double p, double c){
		this.patatas=p;
		this.chocos=c;
	}


	@Override
	public String toString() {
		return "israel [patatas=" + patatas + ", chocos=" + chocos + "]";
	}


	public double getPatatas() {
		return patatas;
	}


	public void setPatatas(double patatas) {
		this.patatas = patatas;
	}


	public double getChocos() {
		return chocos;
	}


	public void setChocos(double chocos) {
		this.chocos = chocos;
	}
	
	
	public void addPatatas(double x) {
		patatas+=x;
		
	}
	
	public void addChocos(double y) {
		chocos+=y;
		
	}
	
	
	
	public int numeroClientes() {
		int clientes = 0;
	
		while (patatas >= 1 && chocos >= 0.5) {
			patatas = patatas - 1;
			chocos = chocos - 0.5;
			clientes += 3;
		}
		
		return clientes;
	
	}
	
	
	
	
}
