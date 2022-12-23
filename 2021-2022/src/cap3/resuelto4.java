package cap3;

/*
 * 4. Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong. Un número es
Armstrong cuando la suma de cada uno de los números que lo componen elevado al número de dígitos de dicho
número da como resultado el propio número. Como esta definición es algo compleja, con la siguiente imagen se verá
más claro qué es un número Armstrong:

 1 5 3 = 1^3 + 5^3 + 3^3
         1   + 125 + 27
         
         
         1- separar el numero que se introduce en sus digitos
         2- elevar cada digito a la potencia que toque
         sumar los resultados parciales
         
         RESOLUCION
         
         
         // 153 / 10 -> 15
		// 153 % 10 --> 3 unidad
		// 15 / 10 --> 1 centena
		// 15 % 10 --> 5 decena

 */
import java.util.Scanner;

/*4. Realiza un método que, dado un número de tres cifras, averigüe 
 * si es un número Armstrong. Un número es
Armstrong cuando 
la suma de cada uno de los números que lo componen elevado al número de dígitos
 de dicho número da como resultado el propio número. 
 Como esta definición es algo compleja, con la siguiente imagen se verá
más claro qué es un número Armstrong:
1 5 3   =   1 al cubo + 5 al cubo + 3 al cubo
			1         +   125     + 27
			153 
*/
//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.

public class resuelto4 {

	static int c = 0, d = 0, u = 0; 
	static int n=0;
	
	//muy mejorable
	public static void troceaNumero() {
		/*	153 / 10 ----> 15
		153 % 10 ----> 3   -----> u
		15 / 10 -----> 1    
		15 % 10 -----> 5    ----->d		
		1 / 10 ------>0
		1 % 10 ------>1  ------>c */
		int aux=n; //VARIABL ES MUY LOCAL
		while(aux>0) {
	   	  	if(aux>=100) { 
			 u=aux%10;	
			 }
		     else if (aux>=10) {
		     d=aux%10;	
		     }
		     else {
		     c=aux%10;	
		     }
		  aux=aux/10;
		  }
		//System.out.println("unidad: "+u+" decena: "+d+ " centena: "+c);
	}
	
	public static int calculaPotencia() {
		//System.out.println( (int) (Math.pow(u, 3)+Math.pow(d, 3)+Math.pow(c, 3))  );
		return (int) (Math.pow(u, 3)+Math.pow(d, 3)+Math.pow(c, 3));
	}
	
	public static void muestraSalida() {
		
		//System.out.println("SALIDA");
		//System.out.println("del numero: "+n);
		
		if(calculaPotencia()==n)
			System.out.println(n+" Si un numero Armstrong ");
		else
			System.out.println(n+" No un numero Armstrong ");
		
	}

	public static void pideNumero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce numero: SOLO TRES CIFRAS");
		n =sc.nextInt();
		//System.out.println("el numero introducido es: "+n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pideNumero();
		troceaNumero();
		calculaPotencia();
		muestraSalida();
	
		//ALGORITMO en C
		/*while(n>0)    
		{    
		r=n%10;    
		sum=sum+(r*r*r);    
		n=n/10;    
		} */   
			
	}

}
