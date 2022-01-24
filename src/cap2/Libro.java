package cap2;

import java.util.Scanner;

public class Libro {
	
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	Scanner sc=new Scanner(System.in);
	
	//constructor por defecto
	Libro(){
		titulo="";
		autor="";
		ejemplares=0;
	}
	
	//constructores con parámetros
	
	Libro(String t, String a, int e, int p){
		titulo =t;
		autor=a;
		ejemplares=e;
		prestados=p;
	}
	
	public int añadir(int n ){
		int a;
		System.out.println("Cuantos queire añadir");
		a=sc.nextInt();
		return ejemplares;
		
	}
	
	public boolean prestar(int aPrestar) {
		boolean prestar =false;
		if(aPrestar >=ejemplares) {
			return prestar=true;
		}else {
			return prestar;
		}
	}
	
	public int devolver(int aDevolver) {
		ejemplares = ejemplares + aDevolver;
		return ejemplares;
	}
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
	

}
