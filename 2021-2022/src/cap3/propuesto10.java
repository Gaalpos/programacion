package cap3;

/*
 * 10. Realiza una clase minumero con un método esVampiro que diga si un número es vampiro o no. Un número es
vampiro si es obtenido a partir del producto de dos números que se obtienen a partir de los dígitos del mismo (los
dos colmillos). Por ejemplo: 2187=27x81 ó 1260=21x60.
 */
import java.util.Scanner;

public class propuesto10 {

static int n;
	
	//de momento pido los cuatro digitos por separado 
	public static boolean esV(int m, int c, int d, int u) {
		int aux=(int)(m*Math.pow(10,1)+c*Math.pow(10,0));
		int auz=(int)(d*Math.pow(10,1)+u*Math.pow(10,0));
		return (aux*auz==n);
		}
	
	
	public static void main(String[] args) {
	
		boolean verdad=false;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce millares: ");
		a=sc.nextInt();
		System.out.println("introduce centenas: ");
		b=sc.nextInt();
		System.out.println("introduce decenas: ");
		c=sc.nextInt();
		System.out.println("introduce unidades: ");
		d=sc.nextInt();
		
		//propio numero a comprobar
		n=(int)(a*Math.pow(10,3)+b*Math.pow(10,2)
		+c*Math.pow(10,1)+d*Math.pow(10,0));
		
		
		//CASOS POSIBLES//
		//ab  por  cd
		if(esV(a, b, c, d))
			verdad=true;
		//ab  por  dc
		if(esV(a, b, d, c))
			verdad=true;
		//ba  por  cd
		if(esV(b, a, c, d))
			verdad=true;
		//ba  por  dc
		if(esV(b, a, d, c))
			verdad=true;
		
		//ac  por  bd
		if(esV(a, c, b, d))
			verdad=true;
		//ac  por  db
		if(esV(a, c, d, b))
			verdad=true;
		//ca  por  bd
		if(esV(c, a, b, d))
			verdad=true;
		//ca  por  db
		if(esV(c, a, d, b))
			verdad=true;
		
		//ad  por  bc
		if(esV(a, d, b, c))
			verdad=true;
		//ad  por  cb
		if(esV(a, d, c, b))
			verdad=true;
		//da  por  bc
		if(esV(d, a, b, c))
			verdad=true;
		//da  por  cb
		if(esV(d, a, c, b))
			verdad=true;
		
		if(verdad)
			System.out.println(n+ " Es vampiro"); 
		else
			System.out.println(n+ " NO es vampiro");
		
		sc.close();
	}
}