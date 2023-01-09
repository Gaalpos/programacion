package resueltos;

import java.util.Scanner;

/*8. Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos constructores inicializarán
los atributos marca y modelo de la clase. Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
que todo funciona correctamente.*/
public class coche {

	//atributos
private	String marca;
private	String modelo;
	
	coche(){
		this.marca="";
		this.modelo="";
	}
	
	coche(String mar,String mod){
		this.marca=mar;
		this.modelo=mod;
	}

	@Override
	public String toString() {
		return "coche [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

public static void main(String[] args) {
		
		String aux;
		String aux2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime marca: ");
		aux=sc.nextLine();
		System.out.println("Dime modelo: ");
		aux2=sc.nextLine();
		
		coche uno=new coche(aux,aux2);
		System.out.println(uno.toString());
		
		coche dos= new coche();
		System.out.println(dos.toString());
		
		dos.setMarca("dina");
		dos.setModelo("mita");
		System.out.println(dos.toString());
		
		String info;
		
		info=uno.getMarca().concat(uno.getModelo());
		System.out.println(info);
		
}
}
