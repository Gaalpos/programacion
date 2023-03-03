package resueltos;

import java.util.Scanner;

/*Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong. Un número es
Armstrong cuando la suma de cada uno de los números que lo componen elevado al número de dígitos de dicho
número da como resultado el propio número. 
EJEMPLO--> 153 es Armstrong   1 al cubo+ 5 al cubo + 3 al cubo 
                              1        + 125       + 27*= 153*/



public class resuelto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		int suma=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime un numero de 4 cifras: ");
		num=sc.nextInt();
		int millares=0;
		int centena=0;
		int decena=0;
		int unidad=0;
		millares=num/1000;
		centena=(num%1000)/100;					//153/100 =1
		decena=((num%1000)%100)/10;				//53/10 =5
		unidad=((num%1000)%100)%10;				//53%10 =3
		System.out.println("Los millares son "+millares+" la centena es: "+centena+" la decena es: "+decena+" y la unidad es: "+unidad);
		
		suma= (int) (Math.pow(millares, 3)+ Math.pow(centena, 3)+ Math.pow(decena, 3)+ Math.pow(unidad, 3));
		
		if(num==suma) {
			System.out.println(num+" es Armstrong");
			
		}
		else {
			System.out.println(num+" no es Armstrong");
		}
		
	}

}
