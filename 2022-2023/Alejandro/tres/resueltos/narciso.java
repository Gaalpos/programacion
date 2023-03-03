package resueltos;

import java.util.Scanner;

public class narciso {

public static int contarCifras(int numero) {
	int cifras=1;
	while (numero>=10) {
		
		numero=numero/10;
		cifras++;
	}
	return cifras;
}


public static int calculaPotencias(int num){
	
	int total=0;
	int cifras= contarCifras(num);
	int temp=num;
	while(temp!=0) {
		total+= (int) Math.pow(temp%10,cifras);	
		//System.out.println("temp%10 resto "+temp%10);
		temp=temp/10;
		//System.out.println("temp/10 cociente "+temp);
	}
	return total;
}

public static boolean esArmstrong(int n) {
	
	if(n==calculaPotencias(n))
		return true;
	else
		return false;
}

public static void main(String[] args) {
	int n=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("escribe un numero: ");
	n=sc.nextInt();
	System.out.println("Cifras: "+contarCifras(n));
	
	System.out.println("Potencias "+calculaPotencias(n));
	System.out.println(n+" es Armstrong?"+ esArmstrong(n));
}

	}


