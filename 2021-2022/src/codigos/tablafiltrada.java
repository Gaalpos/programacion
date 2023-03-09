package codigos;

import java.util.Scanner;

public class tablafiltrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Plis introduce numero entero de 1 a 10: ");
		int num = sc.nextInt();

		//decidimos si el numero es mayor o igual que 1
		//y(AND) el numero pedido es menro o igual que 10
		if( (num>=1) &&     (num<=10)  )
		{

			System.out.println("TABLA DE MULTIPLICAR DEL " + num);

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " por " + i + " es " + (num * i));
			}
			
		}
		else
		{
			System.out.println("NUMERO INCORRECTO");
			System.out.println("CHAO");
		}	
		
		
		
		
		sc.close();
	}

}