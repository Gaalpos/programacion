package nuevascosas;

import java.util.Scanner;

public class cuentacifras {
	
	public static int cuentaCifras(int numero) {
		int cifras=1;
		while((numero/10)!=0) {
			numero=numero/10;
			cifras++;
		}
		return cifras;
		
	}
	public static int contarDigitos(int numero) {
		if(numero/10==0) {
			return 1;
		}
		else {
			return 1 + contarDigitos(numero/10);
		}
		
	}
	
	
	
	public static int hallarInverso(int numero) {
	int cifras=contarDigitos(numero);
	int res=0;
	int aux=numero;
	int inv=0;
	while(aux!=0) {
		
		res=aux%10;
		aux=aux/10;
		inv+=res*Math.pow(10, cifras-1);
		cifras--;
	}
	return inv;
	}
	
	public static int InvertidoRecursivo(int numero) {
		int cifras= contarDigitos(numero);
		if(numero==0) {
			return 0;
		}
		else {
			return (numero%10)*(int)Math.pow(10, cifras-1)+ InvertidoRecursivo(numero/10);
		}
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=0;
		
		System.out.println("Introduce un numero: ");
		numero= sc.nextInt();
		
		System.out.println("El numero "+numero+" tiene "+cuentaCifras(numero)+" cifras");
		System.out.println("El numero "+numero+" tiene "+contarDigitos(numero)+" cifras");
		System.out.println("El inverso es: "+hallarInverso(numero));
		System.out.println("El inverso recursivo es: "+hallarInverso(numero));
	}

}
