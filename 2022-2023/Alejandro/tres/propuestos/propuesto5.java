package propuestos;

import java.util.Scanner;

/* (Ejercicio de dificultad alta) Se desea conocer el lucky number (número de la suerte) de cualquier persona. El
número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito. Por ejemplo,
la fecha de nacimiento de Emma es la siguiente: 16-08-1973 —► 16+8+1973 = 1997 —► 1+9+9+7=26 —► 2+6 =8. El
número de la suerte de Emma será el 8.*/

public class propuesto5 {
	
	public static int sumaCompleta(int n) {
		
		int resultado= calculaLuckyNumber(n);
		if(n<10) {
			return calculaLuckyNumber(aux);
		}
		else return aux;
	}
	
	
	public static int calculaLuckyNumber(int num){
		
		int total=0;
		int temp=num;
		while(temp!=0 || total>10) {
			total+= (temp%10);	
			//System.out.println("temp%10 resto "+temp%10);
			temp=temp/10;
			//System.out.println("temp/10 cociente "+temp);
		}
		return total;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int dia,mes,ano;
		int ln=0;
		
		System.out.println("Dia: ");
		dia=sc.nextInt();
		System.out.println("Mes: ");
		mes=sc.nextInt();
		System.out.println("Ano: ");
		ano=sc.nextInt();
		ln=dia+mes+ano;
		int ln=sumaCompleta(ln);
		
		System.out.println("Tu Lucky Number es: "+ln);

	}

}
