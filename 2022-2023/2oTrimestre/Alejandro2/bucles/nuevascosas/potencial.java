package nuevascosas;

import java.util.Scanner;

public class potencial {
	
	public static int potIterando(int base, int exponente) {
		int potencia=1;
		for(int i=1;i<=exponente;i++){
			potencia*=base;
		
		}
		return potencia;
	}
		public static int potRecursiva(int base, int exponente) {
			int potencia=1;
			if(exponente==1) {
				return base;
			}
			else if(exponente==0){
			
				return 1;
			}
			else {
				return base*potRecursiva(base,exponente-1);
			}
			
		}
		
		
		public static int sumaRepetida(int multiplicando,int multiplicador) {
			
			int producto=0;
			for(int i=1;i<=multiplicador;i++){
				producto=producto+multiplicando;
			
			}
			return producto;
			
		}
		
		public static int sumaRecursiva(int multiplicando,int multiplicador) {
			if(multiplicador==1) {
				return multiplicando;
			}
			
			else {
				return multiplicando+sumaRecursiva(multiplicando,multiplicador-1);
			}
			
		}
			
		

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int base=0;
		int exponente=0;
		System.out.println("Introduce base: ");
		base= sc.nextInt();
		System.out.println("Introduce exponente: ");
		exponente= sc.nextInt();
		
		
			
		
		//potencia=(int) Math.pow(base, exponente);
		System.out.println("La potencia iterativa de "+base+" elevado a "+exponente+" vale: "+potIterando(base, exponente));
		System.out.println("La potencia recursiva de "+base+" elevado a "+exponente+" vale: "+potRecursiva(base, exponente));
		System.out.println("La suma iterativa de "+base+" por "+exponente+" vale: "+sumaRepetida(base, exponente));
		System.out.println("La suma recursiva de "+base+" por "+exponente+" vale: "+sumaRecursiva(base, exponente));
	}

}
