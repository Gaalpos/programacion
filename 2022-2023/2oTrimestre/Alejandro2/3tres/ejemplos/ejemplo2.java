package ejemplos;

import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {

		int mates = 0, lengua = 0;
		Scanner manolin=new Scanner(System.in);
		System.out.println("Nota de mates: ");
		mates=manolin.nextInt();
		System.out.println("Nota de lengua: ");
		lengua=manolin.nextInt();
		
		
		
		if (mates >= 5){
			
		if (lengua >= 5){
		System.out.println("HAS APROBADO MATES Y LENGUA" ) ;
		}else{
		System.out.println("NO HAS APROBADO LENGUA, PERO SI MATES");
		}
		}
		
		else{
			if (lengua >= 5){
				System.out.println("HAS APROBADO LENGUA PERO NO MATES" ) ;
				}else{
				System.out.println("REPITES CURSO POR CRACK O TE LARGAS A MARISCAR");
				}
		}
		
	}

}
